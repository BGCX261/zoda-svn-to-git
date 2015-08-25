package org.zoda.util;

import junit.framework.TestCase;

import java.util.Date;
import java.util.List;
import org.zoda.dao.impl.PeriodicDao;
import org.zoda.model.*;

/**
 * User: Melih Birim 
 * Date: Jun 19, 2009
 * Time: 5:14:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestPeriodicDate extends TestCase {

//    private String getDateTime(Date date) {
//            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//            return dateFormat.format(date);
//        }

    public void testBasicDao(){

        PeriodicDao po = new PeriodicDao();
//        Periodic per = new Periodic();
//
//        Person p = new Person();
//        p.setName("zafer");
//        p.setSurname("demirci");
//        per.setPerson(p);
//
//        Date a = new Date();
//        a.setDate(21);
//        a.setMonth(3);
//        a.setYear(10);
//
//
//        per.setDatePeriodic(a);
//        po.persist(per);


        Date b = new Date();
        b.setDate(20);
        b.setMonth(3);
        b.setYear(10);

        Date c = new Date();
        c.setDate(21);
        c.setMonth(3);
        c.setYear(11);


//        List<Periodic> list = po.listByTwoDate(Periodic.class,"alcohol",getDateTime(b),getDateTime(c));
//        for (Periodic peo: list) {
//            System.out.println("NAME = " + peo.getPerson().getName());
//        }

        List<Periodic> lis = po.listByTwoDate(Periodic.class,"datePeriodic",b,c);
        for (Periodic peo: lis) {
            System.out.println("NAME = " + peo.getPerson().getName());
        }

    }

}
