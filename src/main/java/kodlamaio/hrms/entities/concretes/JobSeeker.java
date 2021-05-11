package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "jobSeekers")
public class JobSeeker {

    @Id
    @GeneratedValue
    @Column(name="jobSeekerId")
    private int jobSeekerId;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="identificationNumber")
    private String identificationNumber;

    @Column(name="email")
    private String email;

    @Column(name="phoneNumber")
    private int phoneNumber;

    @Column(name="jobName")
    private String jobName;

    @Column(name="yearOfBirth")
    private Date yearOfBirth;

    @Column(name="userId")
    private int userId;

    public JobSeeker(int jobSeekerId, String firstName, String lastName, String identificationNumber,
                     String email, int phoneNumber, String jobName, Date yearOfBirth, int userId){
        this.jobSeekerId= jobSeekerId;
        this.firstName=firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
        this.email=email;
        this.phoneNumber = phoneNumber;
        this.jobName = jobName;
        this.yearOfBirth = yearOfBirth;
        this.userId = userId;
    }
}
