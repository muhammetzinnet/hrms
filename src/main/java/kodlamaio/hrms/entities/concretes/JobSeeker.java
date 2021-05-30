package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_seekers")
public class JobSeeker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="job_seeker_id")
    private int job_seeker_id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    @Column(name="identification_number")
    private String identification_number;

    @Column(name="email")
    private String email;

    @Column(name="phone_number")
    private int phone_number;

    @Column(name="job_name")
    private String job_name;

    @Column(name="year_of_birth")
    private Date year_of_birth;

    @Column(name="user_id")
    private int user_id;

}
