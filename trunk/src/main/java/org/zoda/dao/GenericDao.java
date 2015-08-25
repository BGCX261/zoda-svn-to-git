package org.zoda.dao;

import org.zoda.model.Persistable;

import java.util.List;

/**
 * User: Melih Birim 
 * Date: Jun 13, 2009
 * Time: 10:28:10 AM
 * To change this template use File | Settings | File Templates.
 */
public interface GenericDao {        

    public <T extends Persistable> T persist(T obj);

    public void refresh(Persistable obj);

    public void remove(Persistable obj);

    public <T extends Persistable> T find(Class<T> clazz, long systemId);

    public <T extends Persistable> T find(Class<T> clazz, String propertyName, Object propertyValue);

    public <T extends Persistable> List<T> list(Class<T> clazz);

    public <T extends Persistable> List<T> list(Class<T> clazz, int maxResults);

    public <T extends Persistable> List<T> listByProperty(Class<T> clazz, String propertyName, Object propertyValue);

    public <T extends Persistable> List<T> listByProperty(Class<T> clazz, String propertyName, Object propertyValue, int maxResults);
}
