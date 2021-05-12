package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue
    @Column(name="user_id")
    private int user_id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="email")
    private String email;

    @Column(name="password_salt")
    private String password_salt;

    @Column(name="password_hash")
    private String password_hash;

    @Column(name="status")
    private boolean status;

    public User(int user_id, String first_name, String email, String password_salt, String password_hash, boolean status) {
        this.user_id = user_id;
        this.first_name = first_name;
        this.email = email;
        this.password_salt = password_salt;
        this.password_hash = password_hash;
        this.status = status;
    }
}
