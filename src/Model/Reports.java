package Model;

public class Reports {
    private int countryCount;
    private String countryName;
    public String appointmentsMonth;
    public int appointmentTotal;
    public String appointmentType;

    public Reports (int countryCount, String countryName, String appointmentsMonth, int appointmentTotal,
                    String appointmentType){
        this.countryCount = countryCount;
        this.appointmentsMonth = appointmentsMonth;
        this.appointmentTotal = appointmentTotal;
        this.appointmentType = appointmentType;
    }

    public int getCountryCount() {
        return countryCount;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getCountryName(){
        return countryName;
    }

    public void setCountryCount(int countryCount) {
        this.countryCount = countryCount;
    }
    public void setAppointmentsMonth(String appointmentsMonth){
        this.appointmentsMonth = appointmentsMonth;
    }
    public void setAppointmentsMonth(){
        this.appointmentsMonth = appointmentsMonth;
    }

    public int getAppointmentTotal() {
        return appointmentTotal;
    }

    public void setAppointmentTotal(int appointmentTotal) {
        this.appointmentTotal = appointmentTotal;
    }
    public String getAppointmentType(){
        return appointmentType;
    }
    public void setAppointmentType(){
        this. appointmentType = appointmentType;
    }
}
