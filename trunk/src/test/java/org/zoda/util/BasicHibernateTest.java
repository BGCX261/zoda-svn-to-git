package org.zoda.util;

import junit.framework.TestCase;

import org.zoda.model.Person;
import org.zoda.dao.impl.PersonDao;

import java.util.List;

/**
 * User: Melih Birim 
 * Date: Jun 13, 2009
 * Time: 1:53:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class BasicHibernateTest extends TestCase {

   /* public void testBasicInsert() {
        SessionFactory session = HibernateUtil.getSessionFactory();
        Session sess = session.getCurrentSession();
        *//** Starting the Transaction *//*
        Transaction tx = sess.beginTransaction();
        *//** Creating Pojo *//*
        Person pojo = new Person();        
        pojo.setName("Test");
        pojo.setSurName("Test");
        *//** Saving POJO *//*
        sess.save(pojo);
        *//** Commiting the changes *//*
        tx.commit();
        System.out.println("Record Inserted");
        *//** Closing Session *//*
        session.close();
    }*/

    public void testPersonDaoTest(){
        PersonDao pd = new PersonDao();

        Person pojo = new Person();
        pojo.setName("PersonDao");
        pojo.setSurname("PersonDao");
        Person pojo2 = new Person();
        pojo2.setName("PersonDao2");
        pojo2.setSurname("PersonDao2");

        Person tempPerson = pd.persist(pojo);
        pd.persist(pojo2);
        tempPerson.setName("PersonDao3");
        tempPerson.setSurname("PersonDao3");
        pd.persist(tempPerson);
        //pd.remove(tempPerson);
        Person p2 = pd.find(Person.class,2L);
        System.out.println("p2.name = " + p2.getName());

        List<Person> list = pd.list(Person.class);
        for (Person person : list) {
            System.out.println("person.getName() = " + person.getName());
        }
        
    }
}
