package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue
    @Column(name="userId")
    private int userId;

    @Column(name="firstName")
    private String firstName;

    @Column(name="email")
    private String email;

    @Column(name="passwordSalt")
    private String passwordSalt;

    @Column(name="passwordHash")
    private String passwordHash;

    @Column(name="status")
    private boolean status;
}
