/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.zoda.dao.impl;

import org.zoda.dao.AbstractDao;
import org.zoda.model.Company;

/**
 *
 * @author furkan
 */
public class CompanyDao extends AbstractDao {

    public <T extends Company> T persist(T cmp) {
        return super.persist(cmp);
    }
}
