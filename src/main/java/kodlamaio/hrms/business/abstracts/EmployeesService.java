package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.Employees;

import java.util.List;

public interface EmployeesService {
    DataResult<List<Employees>>getAll();
    Result add(Employees employees);
}
