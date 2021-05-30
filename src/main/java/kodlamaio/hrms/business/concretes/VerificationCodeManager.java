package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.VerificationCodeService;
import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.VerificationCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VerificationCodeManager implements VerificationCodeService {

    @Override
    public void generateCode(VerificationCode code, Integer id) {

    }

    @Override
    public Result verify(String verificationCode, Integer id) {
        return null;
    }
}
