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

    public Employees(int employeesId, String passwordSalt, String passwordHash, int userId, int systemPersonnelId,
                     String identificationNumber, String email){
        this.employeesId = employeesId;
        this.passwordSalt = passwordSalt;
        this.passwordHash = passwordHash;
        this.userId = userId;
        this.systemPersonnelId = systemPersonnelId;
        this.identificationNumber = identificationNumber;
        this.email = email;
    }
}
