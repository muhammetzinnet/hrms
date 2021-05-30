package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employees_id")
    private int employees_id;

    @Column(name="password_salt")
    private String password_salt;

    @Column(name="password_hash")
    private String password_hash;

    @Column(name="user_id")
    private int user_id;

    @Column(name="system_personnel_id")
    private int system_personnel_id;

    @Column(name="identification_number")
    private String identification_number;

    @Column(name="email")
    private String email;

}
