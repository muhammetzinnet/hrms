package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employer")
public class Employer {

    @Id
    @GeneratedValue
    @Column(name="employer_id")
    private int employer_id;

    @Column(name="employer_name")
    private String employer_name;

    @Column(name="email")
    private String email;

    @Column(name="tax_number")
    private int tax_number;

    @Column(name="phone_number")
    private int phone_number;

    @Column(name="website")
    private String website;

    @Column(name="user_id")
    private int user_id;

    public Employer(int employer_id, String employer_name, String email, int tax_number, String website, int user_id){
        this.employer_id = employer_id;
        this.employer_name = employer_name;
        this.email = email;
        this.tax_number = tax_number;
        this.website = website;
        this.user_id = user_id;
    }
}
