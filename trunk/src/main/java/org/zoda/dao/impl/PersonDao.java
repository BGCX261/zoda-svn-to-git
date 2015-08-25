package org.zoda.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import org.zoda.dao.AbstractDao;
import org.zoda.model.Persistable;
import org.zoda.model.Person;

/**
 * User: Melih Birim 
 * Date: Jun 13, 2009
 * Time: 2:17:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class PersonDao extends AbstractDao {

    private static EntityManager em = emf.createEntityManager();

    public static final String SELECT_BY_NAME_SURNAME;

    static {
        SELECT_BY_NAME_SURNAME = "SELECT p FROM :CLASS: p WHERE p.:PROPNAME1:=?1 AND p.:PROPNAME2:=?2";
    }

    public <T extends Persistable> List<T> listByNameSurname(Class<T> clazz, String propertyName1,String propertyName2,Object propertyValue1, Object propertyValue2) {
        return listByNameSurname(clazz, propertyName1,propertyName2, propertyValue1, propertyValue2, 100);
    }

    public <T extends Persistable> List<T> listByNameSurname(Class<T> clazz, String propertyName1,String propertyName2, Object propertyValue1, Object propertyValue2, int maxResults) {
        String query = PersonDao.SELECT_BY_NAME_SURNAME.replaceFirst(":CLASS:", clazz.getSimpleName()).replaceFirst(":PROPNAME1:", propertyName1).replaceFirst(":PROPNAME2:", propertyName2);
        System.out.println(query);
        List<T> persistables = em.createQuery(query).setParameter(1, propertyValue1).setParameter(2, propertyValue2).setMaxResults(maxResults).getResultList();
        return persistables;
    }

    public <T extends Person> T persist(T obj) {
        return super.persist(obj);
    }

    public void remove(Person person){
        super.remove(person);
    }


    
}
