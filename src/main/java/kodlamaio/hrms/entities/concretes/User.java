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

    public User(int userId, String firstName, String email, String passwordSalt, String passwordHash, boolean status) {
        this.userId = userId;
        this.firstName = firstName;
        this.email = email;
        this.passwordSalt = passwordSalt;
        this.passwordHash = passwordHash;
        this.status = status;
    }
}
