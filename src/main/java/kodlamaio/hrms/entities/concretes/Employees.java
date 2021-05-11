package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="employees")
public class Employees {

    @Id
    @GeneratedValue
    @Column(name="employeesId")
    private int employeesId;

    @Column(name="passwordSalt")
    private String passwordSalt;

    @Column(name="passwordHash")
    private String passwordHash;

    @Column(name="userId")
    private int userId;

    @Column(name="systemPersonnelId")
    private int systemPersonnelId;

    @Column(name="identificationNumber")
    private String identificationNumber;

    @Column(name="email")
    private String email;
}
