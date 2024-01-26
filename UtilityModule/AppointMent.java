package MedEaseNavigator.UtilityModule;

public class AppointMent {
    private String Date;
    private String TimeSlot;
    private String PID;
    private String Name;
    AppointMent nextAppointment;

    public void setDate(String date) {
        Date = date;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNextAppointment(AppointMent nextAppointment) {
        this.nextAppointment = nextAppointment;
    }
    

    public void setPID(String pID) {
        PID = pID;
    }

    public void setTimeSlot(String timeSlot) {
        TimeSlot = timeSlot;
    }

    public String getDate() {
        return Date;
    }

    public String getTimeSlot() {
        return TimeSlot;
    }

    public String getName() {
        return Name;
    }

    public String getPID() {
        return PID;
    }

    public void CreateAppointmentList() {

    }
}
