package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.VerificationCode;

import java.util.List;

public interface VerificationCodeService {
    void generateCode(VerificationCode code, Integer id);
    Result verify(String verificationCode,Integer id);
}
