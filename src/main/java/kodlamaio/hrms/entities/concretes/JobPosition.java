package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jobPositions")
public class JobPosition {

    @Id
    @GeneratedValue
    @Column(name="jobPositionId")
    private int jobPositionId;

    @Column(name="jobPositionName")
    private String jobPositionName;



    public JobPosition(int jobPositionId, String jobPositionName){
        this.jobPositionId = jobPositionId;
        this.jobPositionName = jobPositionName;
    }
}
