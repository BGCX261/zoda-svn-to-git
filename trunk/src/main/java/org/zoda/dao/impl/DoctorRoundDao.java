/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.zoda.dao.impl;

import org.zoda.dao.AbstractDao;
import org.zoda.model.DoctorRound;

/**
 *
 * @author furkan
 */
public class DoctorRoundDao extends AbstractDao {

    public <T extends DoctorRound> T persist(T dr){
        return super.persist(dr);
    }

}
