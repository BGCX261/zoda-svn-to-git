/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.zoda.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import org.zoda.dao.AbstractDao;
import org.zoda.model.Periodic;
import org.zoda.model.Persistable;

/**
 *
 * @author lord
 */
public class PeriodicDao extends AbstractDao{

    private static EntityManager em = emf.createEntityManager();

    public static final String SELECT_BY_TWO_PROPERTY;

    static {
        SELECT_BY_TWO_PROPERTY = "SELECT p FROM :CLASS: p WHERE p.:PROPNAME:>=?1 AND p.:PROPNAME:<=?2";
    }
    
    public <T extends Persistable> List<T> listByTwoDate(Class<T> clazz, String propertyName, Object propertyValue1, Object propertyValue2) {
        return listByTwoDate(clazz, propertyName, propertyValue1, propertyValue2, 100);
    }

    public <T extends Persistable> List<T> listByTwoDate(Class<T> clazz, String propertyName, Object propertyValue1, Object propertyValue2, int maxResults) {
        String query = PeriodicDao.SELECT_BY_TWO_PROPERTY.replaceFirst(":CLASS:", clazz.getSimpleName()).replaceAll(":PROPNAME:", propertyName);
        System.out.println(query);
        List<T> persistables = em.createQuery(query).setParameter(1, propertyValue1).setParameter(2, propertyValue2).setMaxResults(maxResults).getResultList();
        return persistables;
    }


     public <T extends Periodic> T persist(T per){        
        return super.persist(per);
    }
}
