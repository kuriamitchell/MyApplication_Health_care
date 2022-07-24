package Mode;

import javax.persistence.*;
import java.util.List;

@SuppressWarnings("ALL")
@Entity
@Table(name = "Doctor")
public class Doctor {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "f_name")
    private String f_name;
    @Column(name = "l_name")
    private String l_name;
    @Column(name = "gender")
    private Long gender;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "specialty")
    private String specialty;

    @ManyToMany
    @JoinColumn(name = "patient_Id")
    private List<Patient> patient;

    public Doctor(Long id, String f_name, String l_name, Long gender, String phone, String email, String specialty, List<Patient> patient) {
        this.id = id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.specialty = specialty;
        this.patient = patient;
    }

    public Doctor() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public Long getGender() {
        return gender;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public List<Patient> getPatient() {
        return patient;
    }

    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", specialty='" + specialty + '\'' +
                ", patient=" + patient +
                '}';
    }
}
