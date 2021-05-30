package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {

    DataResult<List<Employer>> getAll();
    Result add(Employer employer);
}
