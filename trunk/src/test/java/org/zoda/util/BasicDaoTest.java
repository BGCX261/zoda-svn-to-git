package org.zoda.util;

import junit.framework.TestCase;

import java.util.List;
import org.zoda.dao.impl.PersonDao;
import org.zoda.model.Person;

/**
 * User: Melih Birim 
 * Date: Jun 19, 2009
 * Time: 5:14:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class BasicDaoTest extends TestCase {

    public void testBasicDao(){

        PersonDao pd = new PersonDao();

        List<Person> list = pd.list(Person.class);
        for (Person person : list) {
            System.out.println("FIRST = " + person.getName());
        }

        String query = PersonDao.SELECT_ALL_QUERY.replaceFirst(":CLASS:",Person.class.getSimpleName());

        List<Person> lis = (List<Person>)PersonDao.emf.createEntityManager().createQuery(query).getResultList();

        for (Person person : lis) {
            System.out.println("SECOND = " + person.getName());
        }


        List<Person> l= pd.listByProperty(Person.class,"name","A");
        for (Person person : l) {
            System.out.println("FORTH = " + person.getSurname());
        }


    }

}
