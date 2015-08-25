package org.zoda.util;

import java.util.ArrayList;
import java.util.Date;
import junit.framework.TestCase;
import org.zoda.dao.impl.PersonDao;
import org.zoda.model.Person;

import java.util.List;
import org.zoda.dao.impl.CompanyDao;
import org.zoda.dao.impl.DefaultHIDao;
import org.zoda.dao.impl.DoctorRoundDao;
import org.zoda.dao.impl.PeriodicDao;
import org.zoda.dao.impl.PersonEmployeeDao;
import org.zoda.model.Company;
import org.zoda.model.DefaultHI;
import org.zoda.model.DoctorRound;
import org.zoda.model.Periodic;
import org.zoda.model.PersonEmployee;


public class Total extends TestCase {

    public void testBasicDao(){

        PersonDao pd = new PersonDao();
        CompanyDao cod = new CompanyDao();
        PeriodicDao perd = new PeriodicDao();
        DefaultHIDao dhid = new DefaultHIDao();
        DoctorRoundDao drd = new DoctorRoundDao();
        PersonEmployeeDao ped = new PersonEmployeeDao();

        Company com = new Company();
        Person p = new Person();
        Periodic per =new Periodic();
        DefaultHI dhi = new DefaultHI();
        DoctorRound dr = new DoctorRound();
        PersonEmployee pe = new PersonEmployee();

        com.setCompanyAddress("Yukarý Dudullu");
        com.setCompanyName("AnelSis");
        com.setCompanySicil("ANLS-01");
        com.setCompanyTel("09922121222");
        
        p.setName("Aslý");
        p.setSurname("Börek");
        p.setAddress("Ankara");
        p.setEducation("Lisans");
        p.setTCno(123L);
        p.setRetirement(false);
        p.setSex("Bayan");

        Date a = new Date();
        a.setDate(21);
        a.setMonth(3);
        a.setYear(10);

        per.setAlcohol("Haftada 2 gün");
        per.setCigarette("Kullanmýyor");
        per.setScrutinyDR("Prof. Dr. Ferhat Oðuz");
        per.setDatePeriodic(a);

        dhi.setMedicineAllergy("Yok");
        dhi.setWorkAccident("Bulunmuyor");

        dr.setAttention("Kondisyonu Saðlam");
        dr.setScrutinyDR("Prof. Dr. Ferhat Oðuz");

        List<Periodic> perList = new ArrayList<Periodic>();
        perList.add(per);

        List<DoctorRound> drList = new ArrayList<DoctorRound>();
        drList.add(dr);

        //hi.setPerson(p);
        p.setDefaultHI(dhi);
        p.setPeriodic(perList);
        p.setDoctorround(drList);
        p.setRetirement(true);


        pe.setIsActive(true);
        pe.setJob("Bilgisayar");
        pe.setSigsic("22");
        pe.setTelsic(1221L);
        pe.setCompany(com);
        pe.setPerson(p);
        
        //hiDao.persist(hi);
        pd.persist(p); //Person persist Persist edilmezse Person kaydolmuyor.
        cod.persist(com); //Company persist
        perd.persist(per); //Periodic persist
        dhid.persist(dhi); //DefaultHI persist
        drd.persist(dr); //DoctorRound persist
        ped.persist(pe); //PersonEmployee persist Persist edilmezse PersonEmployee kaydolmuyor.

        List<Person> list = pd.list(Person.class);
        for (Person person : list) {
            System.out.println("person.getName() = " + person.getName());
        }

        list = pd.listByProperty(Person.class, "name", "test");
        for(Person person : list){
            System.out.println(person.getName());
        }

//        PersonEmployee peList = (PersonEmployee) PersonEmployeeDao.emf.createEntityManager().createQuery("from PERSON pe");
        //PersonEmployee peList = ped.findID(PersonEmployee.class,"TELSIC",1221 );
        //System.out.println("SONUC  :"+peList.getPerson().getName());


    }

}
