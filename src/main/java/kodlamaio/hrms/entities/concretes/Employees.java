package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="employees")
public class Employees {

    @Id
    @GeneratedValue
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

    public Employees(int employees_id, String password_salt, String password_hash, int user_id, int system_personnel_id,
                     String identification_number, String email){
        this.employees_id = employees_id;
        this.password_salt = password_salt;
        this.password_hash = password_hash;
        this.user_id = user_id;
        this.system_personnel_id = system_personnel_id;
        this.identification_number = identification_number;
        this.email = email;
    }
}
