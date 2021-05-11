package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employer")
public class Employer {

    @Id
    @GeneratedValue
    @Column(name="employerId")
    private int employerId;

    @Column(name="employerName")
    private String employerName;

    @Column(name="email")
    private String email;

    @Column(name="taxNumber")
    private int taxNumber;

    @Column(name="phoneNumber")
    private int phoneNumber;

    @Column(name="website")
    private String website;

    @Column(name="userId")
    private int userId;

    public Employer(int employerId, String employerName, String email, int taxNumber, String website, int userId){
        this.employerId = employerId;
        this.employerName = employerName;
        this.email = email;
        this.taxNumber = taxNumber;
        this.website = website;
        this.userId = userId;
    }
}
