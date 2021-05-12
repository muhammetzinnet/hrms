package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="system_personnels")
public class SystemPersonnel {

    @Id
    @GeneratedValue
    @Column(name="system_personnel_id")
    private int system_personnel_id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    public SystemPersonnel(int system_personnel_id, String first_name, String last_name){
        this.system_personnel_id = system_personnel_id;
        this.first_name = first_name;
        this.last_name = last_name;

    }

}
