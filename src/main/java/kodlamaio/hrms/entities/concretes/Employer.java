package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employers")
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

}
