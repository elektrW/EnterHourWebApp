package pl.wojciechdomagala.enterhourwebapp.model;

import javax.persistence.*;

@Entity
@Table(name = "employeeHours")
public class Hours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hours")
    private Long id;

    @Column(name = "Name_of_place")
    private String nameOfPlace;

    @Column(name = "Home_office")
    private String isHomeOffice;

    @Column(name = "Hours")
    private Integer hours;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfPlace() {
        return nameOfPlace;
    }

    public void setNameOfPlace(String nameOfPlace) {
        this.nameOfPlace = nameOfPlace;
    }

    public String getIsHomeOffice() {
        return isHomeOffice;
    }

    public void setIsHomeOffice(String isHomeOffice) {
        this.isHomeOffice = isHomeOffice;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
