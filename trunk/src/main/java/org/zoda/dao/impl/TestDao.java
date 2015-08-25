package org.zoda.dao.impl;

import org.zoda.dao.AbstractDao;
import org.zoda.model.Persistable;

/**
 * User: Melih Birim 
 * Date: Jun 19, 2009
 * Time: 5:12:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestDao extends AbstractDao {

    public Persistable persit(Persistable obj) {
        return super.persist(obj);
    }
    
}
