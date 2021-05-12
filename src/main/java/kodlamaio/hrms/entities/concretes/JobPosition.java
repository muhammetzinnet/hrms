package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "job_positions")
public class JobPosition {

    @Id
    @GeneratedValue
    @Column(name="job_position_id")
    private int job_position_id;

    @Column(name="job_position_name")
    private String job_position_name;

    public JobPosition(){}

    public JobPosition(int job_position_id, String job_position_name){
        this.job_position_id = job_position_id;
        this.job_position_name = job_position_name;
    }
}
