package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "verification_codes")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class VerificationCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "verification_id")
    private int verification_id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "email_verification_code")
    private String email_verification_code;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "expired_date")
    private LocalDate expiredDate;

    @Column(name = "isActivate")
    private boolean isActivate;

    @Column(name = "isDeleted")
    private boolean isDeleted;

    @Column(name = "confirmed_date")
    private LocalDate confirmedDate;
}
