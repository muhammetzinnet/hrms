package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "job_seekers")
public class JobSeeker {

    @Id
    @GeneratedValue
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

    @Column(name="yearof_birth")
    private Date yearof_birth;

    @Column(name="user_id")
    private int user_id;

    public JobSeeker(int job_seeker_id, String first_name, String last_name, String identification_number,
                     String email, int phone_number, String job_name, Date yearof_birth, int user_id){
        this.job_seeker_id= job_seeker_id;
        this.first_name=first_name;
        this.last_name = last_name;
        this.identification_number = identification_number;
        this.email=email;
        this.phone_number = phone_number;
        this.job_name = job_name;
        this.yearof_birth = yearof_birth;
        this.user_id = user_id;
    }
}
