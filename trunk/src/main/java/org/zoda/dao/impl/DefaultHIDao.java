/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.zoda.dao.impl;

import org.zoda.dao.AbstractDao;
import org.zoda.model.DefaultHI;

/**
 *
 * @author furkan
 */
public class DefaultHIDao extends AbstractDao{

     public <T extends DefaultHI> T persist(T dhi){
        return super.persist(dhi);
    }
}
