package Mode;


import javax.persistence.*;
import java.util.List;

@SuppressWarnings("ALL")
@Entity
@Table(name = "Ward")
public class ward {
    @Id
    @Column(name = "id")
    private Long ward_id;
    @Column(name = "name")
    private String name;
    @Column(name = "capacity")
    private Long capacity;
    @ManyToMany
    @JoinColumn(name = "doctor_Id")
    private List<Doctor> doctor;

    public ward(Long ward_id, String name, Long capacity, List<Doctor> doctor) {
        this.ward_id = ward_id;
        this.name = name;
        this.capacity = capacity;
        this.doctor = doctor;
    }

    public ward() {

    }

    public Long getWard_id() {
        return ward_id;
    }

    public void setWard_id(Long ward_id) {
        this.ward_id = ward_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public List<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<Doctor> doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "ward{" +
                "ward_id=" + ward_id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", doctor=" + doctor +
                '}';
    }
}
