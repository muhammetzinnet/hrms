package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="system_personnels")
public class SystemPersonnel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="system_personnel_id")
    private int system_personnel_id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

}
