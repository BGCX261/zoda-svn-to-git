package org.zoda.dao;

import org.zoda.model.Persistable;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import javax.persistence.*;
import java.util.List;

/**
 * User: Melih Birim 
 * Date: Jun 13, 2009
 * Time: 2:05:36 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractDao implements GenericDao {
    protected static final Log log = LogFactory.getLog(AbstractDao.class);

    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("zoda");

    public static final String SELECT_ALL_QUERY;

    static {
        SELECT_ALL_QUERY = "SELECT p FROM :CLASS: p";
    }

    public static final String SELECT_BY_PROPERTY_QUERY;

    static {
        SELECT_BY_PROPERTY_QUERY = "SELECT p FROM :CLASS: p WHERE p.:PROPNAME:=?1";
    }

    @PersistenceContext
    private static EntityManager em = emf.createEntityManager();

    public static EntityTransaction beginTransaction() {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        return tx;
    }

    public <T extends Persistable> T persist(T obj) {

        log.debug("---------begin of persist method---------");

        EntityTransaction tx = null;
        try {
            tx = beginTransaction();            
            if (obj.getId() != Persistable.UNSAVED_ID_VALUE) {
                log.info("Updating... :" + obj);
                T merged = em.merge(obj);
                return merged;
            } else {
                em.persist(obj);
                return obj;
            }
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }
        finally {
            tx.commit();
            log.debug("---------end of persist method---------");
        }
    }

    public void refresh(Persistable obj) {
        em.refresh(obj);
    }

    public void remove(Persistable obj) {
        EntityTransaction tx = null;
        try {
            tx = beginTransaction();            
            em.remove(obj);
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }
        finally {
            tx.commit();
            log.debug("---------end of persist method---------");
        }
    }

    public <T extends Persistable> T find(Class<T> clazz, long systemId) {
        return em.find(clazz, systemId);
    }

    public <T extends Persistable> T find(Class<T> clazz, String propertyName, Object propertyValue) {
        String query = AbstractDao.SELECT_BY_PROPERTY_QUERY.replaceFirst(":CLASS:", clazz.getSimpleName()).replaceFirst(":PROPNAME:", propertyName);
        T result = (T) em.createQuery(query).setParameter(1, propertyValue).getSingleResult();
        return result;
    }

    public <T extends Persistable> List<T> list(Class<T> clazz) {
        return list(clazz, 100);
    }

    public <T extends Persistable> List<T> list(Class<T> clazz, int maxResults) {
        String query = AbstractDao.SELECT_ALL_QUERY.replaceFirst(":CLASS:", clazz.getSimpleName());
        List<T> persistables = em.createQuery(query).setMaxResults(maxResults).getResultList();
        return persistables;
    }

    public <T extends Persistable> List<T> listByProperty(Class<T> clazz, String propertyName, Object propertyValue) {
        return listByProperty(clazz, propertyName, propertyValue, 100);
    }

    public <T extends Persistable> List<T> listByProperty(Class<T> clazz, String propertyName, Object propertyValue, int maxResults) {
        String query = AbstractDao.SELECT_BY_PROPERTY_QUERY.replaceFirst(":CLASS:", clazz.getSimpleName()).replaceFirst(":PROPNAME:", propertyName);
        List<T> persistables = em.createQuery(query).setParameter(1, propertyValue).setMaxResults(maxResults).getResultList();
        return persistables;
    }
}
