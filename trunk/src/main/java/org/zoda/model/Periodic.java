package org.zoda.model;

//~--- JDK imports ------------------------------------------------------------

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
public class Periodic extends Persistable {
    private static final long serialVersionUID = 1L;
    private String            BMI;
    private String            EKG;
    private String            KBB;
    private boolean           PM;
    private String            alcohol;
    private String            audiometry;
    private double            bloodPB;
    private String            cigarette;
    private String            complaint;
    private String            conclusion;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date              datePeriodic;
    private String            digestion;
    private String            disability;
    private String            eye;
    private boolean           hardWork;
    private Long              height;
    private String            hemogram;
    private String            illness;
    private String            kardiyovaskuler;
    private String            neurology;
    private String            operations;
    private String            orthopedy;
    private String            other;
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "PersonID")
    Person                    person;
    private String            psychiatry;
    private String            pulse;
    private String            respiration;
    private String            scrutinyDR;
    private String            sedimentation;
    private String            sgotGama;
    private String            sisExamination;
    private String            skin;
    private String            spirometry;
    private String            tension;
    private String            treatment;
    private String            urine;
    private String            urogenital;
    private String            workAccident;

    public String getWorkAccident() {
        return workAccident;
    }

    public void setWorkAccident(String workAccident) {
        this.workAccident = workAccident;
    }
    private Long              weight;
    private String            xray;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getBMI() {
        return BMI;
    }

    public void setBMI(String BMI) {
        this.BMI = BMI;
    }

    public String getEKG() {
        return EKG;
    }

    public void setEKG(String EKG) {
        this.EKG = EKG;
    }

    public String getKBB() {
        return KBB;
    }

    public void setKBB(String KBB) {
        this.KBB = KBB;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getAudiometry() {
        return audiometry;
    }

    public void setAudiometry(String audiometry) {
        this.audiometry = audiometry;
    }

    public double getBloodPB() {
        return bloodPB;
    }

    public void setBloodPB(double bloodPB) {
        this.bloodPB = bloodPB;
    }

    public String getTension() {
        return tension;
    }

    public void setTension(String tension) {
        this.tension = tension;
    }

    public String getCigarette() {
        return cigarette;
    }

    public void setCigarette(String cigarette) {
        this.cigarette = cigarette;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public Date getDatePeriodic() {
        return datePeriodic;
    }

    public void setDatePeriodic(Date datePeriodic) {
        this.datePeriodic = datePeriodic;
    }

    public String getDigestion() {
        return digestion;
    }

    public void setDigestion(String digestion) {
        this.digestion = digestion;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public String getHemogram() {
        return hemogram;
    }

    public void setHemogram(String hemogram) {
        this.hemogram = hemogram;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getKardiyovaskuler() {
        return kardiyovaskuler;
    }

    public void setKardiyovaskuler(String kardiyovaskuler) {
        this.kardiyovaskuler = kardiyovaskuler;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getNeurology() {
        return neurology;
    }

    public void setNeurology(String neurology) {
        this.neurology = neurology;
    }

    public String getOperations() {
        return operations;
    }

    public void setOperations(String operation) {
        this.operations = operation;
    }

    public String getOrthopedy() {
        return orthopedy;
    }

    public void setOrthopedy(String orthopedy) {
        this.orthopedy = orthopedy;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public boolean isPM() {
        return PM;
    }

    public void setPM(boolean PM) {
        this.PM = PM;
    }

    public boolean isHardWork() {
        return hardWork;
    }

    public void setHardWork(boolean hardWork) {
        this.hardWork = hardWork;
    }

    public String getScrutinyDR() {
        return scrutinyDR;
    }

    public void setScrutinyDR(String scrutinyDR) {
        this.scrutinyDR = scrutinyDR;
    }

    public String getPsychiatry() {
        return psychiatry;
    }

    public void setPsychiatry(String psychiatry) {
        this.psychiatry = psychiatry;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getRespiration() {
        return respiration;
    }

    public void setRespiration(String respiration) {
        this.respiration = respiration;
    }

    public String getSedimentation() {
        return sedimentation;
    }

    public void setSedimentation(String sedimentation) {
        this.sedimentation = sedimentation;
    }

    public String getSgotGama() {
        return sgotGama;
    }

    public void setSgotGama(String sgotGama) {
        this.sgotGama = sgotGama;
    }

    public String getSisExamination() {
        return sisExamination;
    }

    public void setSisExamination(String sisExamination) {
        this.sisExamination = sisExamination;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getSpirometry() {
        return spirometry;
    }

    public void setSpirometry(String spirometry) {
        this.spirometry = spirometry;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getUrine() {
        return urine;
    }

    public void setUrine(String urine) {
        this.urine = urine;
    }

    public String getUrogenital() {
        return urogenital;
    }

    public void setUrogenital(String urogenital) {
        this.urogenital = urogenital;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getXray() {
        return xray;
    }

    public void setXray(String xray) {
        this.xray = xray;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
