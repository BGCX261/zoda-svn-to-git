package org.zoda.model;

//~--- JDK imports ------------------------------------------------------------

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * User: Melih Birim -- melih.birim@alcatel-lucent.com
 * Date: Jun 13, 2009
 * Time: 2:07:40 AM
 * To change this template use File | Settings | File Templates.
 */
@MappedSuperclass
public abstract class Persistable implements Serializable {
    public static final long UNSAVED_ID_VALUE = 0L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long           Id               = Persistable.UNSAVED_ID_VALUE;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;

        hash += ((getId() != null)
                 ? getId().hashCode()
                 : 0);

        return hash;
    }

    @Override
    public boolean equals(Object object) {

        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }

        Company other = (Company) object;

        if (((this.getId() == null) && (other.getId() != null))
                || ((this.getId() != null) &&!this.Id.equals(other.Id))) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "healthsystem.Company[Id=" + getId() + "]";
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
