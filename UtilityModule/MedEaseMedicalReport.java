package MedEaseNavigator.UtilityModule;

public class MedEaseMedicalReport {
    private int MRID;
    private String chiefcomplaint;
    private String diagnosis;
    private String prescription;
    private String followupadvice;
    private String followupdate;
    private String symptoms;
    private String labtest;
    private String status;
    private float fees;
    // try 
    private int PID;
    private int var;
    private int DID;
    private MedEaseMedicalReport reporthead;
    private Boolean IsVlaid;
    /*Getter method */
    public String getChiefcomplaint() {
        return chiefcomplaint;
    }
    public int getDID() {
        return DID;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
    public float getFees() {
        return fees;
    }
    public String getFollowupadvice() {
        return followupadvice;
    }
    public String getFollowupdate() {
        return followupdate;
    }
    public Boolean getIsVlaid() {
        return IsVlaid;
    }
    public String getLabtest() {
        return labtest;
    }
    public int getMRID() {
        return MRID;
    }
    public int getPID() {
        return PID;
    }
    public String getPrescription() {
        return prescription;
    }
    public MedEaseMedicalReport getReporthead() {
        return reporthead;
    }
    public String getStatus() {
        return status;
    }
    public String getSymptoms() {
        return symptoms;
    }
    /*Setter method */
    public void setChiefcomplaint(String chiefcomplaint) {
        this.chiefcomplaint = chiefcomplaint;
    }
    public void setReporthead(MedEaseMedicalReport reporthead) {
        this.reporthead = reporthead;
    }
    public void setDID(int dID) {
        DID = dID;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public void setFees(float fees) {
        this.fees = fees;
    }
    public void setFollowupadvice(String followupadvice) {
        this.followupadvice = followupadvice;
    }
    public void setFollowupdate(String followupdate) {
        this.followupdate = followupdate;
    }
    public void setIsVlaid(Boolean isVlaid) {
        IsVlaid = isVlaid;
    }
    public void setLabtest(String labtest) {
        this.labtest = labtest;
    }
    public void setMRID(int mRID) {
        MRID = mRID;
    }
    public void setPID(int pID) {
        PID = pID;
    }
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    


    
    
}  
