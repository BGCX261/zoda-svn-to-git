/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.zoda.dao.impl;

import org.zoda.dao.AbstractDao;
import org.zoda.model.PersonEmployee;

/**
 *
 * @author furkan
 */
public class PersonEmployeeDao extends AbstractDao{

     public <T extends PersonEmployee> T persist(T pe){
        return super.persist(pe);
    }
}
