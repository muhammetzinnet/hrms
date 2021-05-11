package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="systemPersonnels")
public class SystemPersonnel {

    @Id
    @GeneratedValue
    @Column(name="systemPersonnelId")
    private int systemPersonnelId;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

}
