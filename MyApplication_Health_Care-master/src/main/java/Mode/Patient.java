package Mode;


import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name = "Patient")
public class Patient {
   @Id
   @Column(name = "id")
  private Long id;
    @Column(name = "f_name")
  private String f_name;
    @Column(name = "l_name")
  private String l_name;
    @Column(name = "age")
  private Long age;
    @Column(name = "gender")
  private String gender;
    @Column(name = "phone")
  private String phone;
    @Column(name = "sicknessDetails")
  private String sicknessDetails;
    @ManyToOne
    private ward ward;

    public Patient(Long id, String f_name, String l_name, Long age, String gender, String phone, String sicknessDetails, Mode.ward ward) {
        this.id = id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.sicknessDetails = sicknessDetails;
        this.ward = ward;
    }

    public Patient() {

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

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSicknessDetails() {
        return sicknessDetails;
    }

    public void setSicknessDetails(String sicknessDetails) {
        this.sicknessDetails = sicknessDetails;
    }

    public Mode.ward getWard() {
        return ward;
    }

    public void setWard(Mode.ward ward) {
        this.ward = ward;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", sicknessDetails='" + sicknessDetails + '\'' +
                ", ward=" + ward +
                '}';
    }
}
