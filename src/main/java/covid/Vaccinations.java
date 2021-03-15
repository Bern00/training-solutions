package covid;


import java.util.Date;

public class Vaccinations {

    private int id;
    private int citizen_id;
    private Date vaccination_date;
    private String status;
    private String note;
    private String vaccination_type;

    public Vaccinations(int id, int citizen_id, Date vaccination_date, String status, String note, String vaccination_type) {
        this.id = id;
        this.citizen_id = citizen_id;
        this.vaccination_date = vaccination_date;
        this.status = status;
        this.note = note;
        this.vaccination_type = vaccination_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCitizen_id() {
        return citizen_id;
    }

    public void setCitizen_id(int citizen_id) {
        this.citizen_id = citizen_id;
    }

    public Date getVaccination_date() {
        return vaccination_date;
    }

    public void setVaccination_date(Date vaccination_date) {
        this.vaccination_date = vaccination_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getVaccination_type() {
        return vaccination_type;
    }

    public void setVaccination_type(String vaccination_type) {
        this.vaccination_type = vaccination_type;
    }

    @Override
    public String toString() {
        return "Vaccinations{" +
                "id=" + id +
                ", citizen_id=" + citizen_id +
                ", vaccination_date=" + vaccination_date +
                ", status='" + status + '\'' +
                ", note='" + note + '\'' +
                ", vaccination_type='" + vaccination_type + '\'' +
                '}';
    }
}
