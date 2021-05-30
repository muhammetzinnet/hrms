package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
