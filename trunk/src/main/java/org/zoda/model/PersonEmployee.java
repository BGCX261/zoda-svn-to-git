package org.zoda.model;

//~--- JDK imports ------------------------------------------------------------

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "PersonEmployee")
public class PersonEmployee extends Persistable {

    /**
     * @return the serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date              IGMdate;
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "CompanyID")
    Company                   company;
    private String            companySCL;
    private String            departmentCode;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date              entryDate;
    private String            exCompany;
    private boolean           isActive;
    private String            job;
    private String            jobRisk;
 
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "PersonID")
    Person                    person;
    private String            personelProtector;
    private String            secondSCL;
    private String            sigsic;
    private Long              telsic;
    private String            workState;
    private String            works;

    public PersonEmployee() {}

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getTelsic() {
        return telsic;
    }

    public void setTelsic(Long telsic) {
        this.telsic = telsic;
    }

    /**
     * @return the isActive
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * @param isActive the isActive to set
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * @return the departmentCode
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /**
     * @param departmentCode the departmentCode to set
     */
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    /**
     * @return the secondSCL
     */
    public String getSecondSCL() {
        return secondSCL;
    }

    /**
     * @param secondSCL the secondSCL to set
     */
    public void setSecondSCL(String secondSCL) {
        this.secondSCL = secondSCL;
    }

    /**
     * @return the sigsic
     */
    public String getSigsic() {
        return sigsic;
    }

    /**
     * @param sigsic the sigsic to set
     */
    public void setSigsic(String sigsic) {
        this.sigsic = sigsic;
    }

    /**
     * @return the workState
     */
    public String getWorkState() {
        return workState;
    }

    /**
     * @param workState the workState to set
     */
    public void setWorkState(String workState) {
        this.workState = workState;
    }

    public Date getIGMdate() {
        return IGMdate;
    }

    public void setIGMdate(Date IGMdate) {
        this.IGMdate = IGMdate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * @return the works
     */
    public String getWorks() {
        return works;
    }

    /**
     * @param works the works to set
     */
    public void setWorks(String works) {
        this.works = works;
    }

    /**
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * @return the jobRisk
     */
    public String getJobRisk() {
        return jobRisk;
    }

    /**
     * @param jobRisk the jobRisk to set
     */
    public void setJobRisk(String jobRisk) {
        this.jobRisk = jobRisk;
    }

    /**
     * @return the personelProtector
     */
    public String getPersonelProtector() {
        return personelProtector;
    }

    /**
     * @param personelProtector the personelProtector to set
     */
    public void setPersonelProtector(String personelProtector) {
        this.personelProtector = personelProtector;
    }

    /**
     * @return the exCompany
     */
    public String getExCompany() {
        return exCompany;
    }

    /**
     * @param exCompany the exCompany to set
     */
    public void setExCompany(String exCompany) {
        this.exCompany = exCompany;
    }

    /**
     * @return the companySCL
     */
    public String getCompanySCL() {
        return companySCL;
    }

    /**
     * @param companySCL the companySCL to set
     */
    public void setCompanySCL(String companySCL) {
        this.companySCL = companySCL;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
