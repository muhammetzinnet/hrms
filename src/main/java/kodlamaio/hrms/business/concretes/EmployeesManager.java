package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployeesService;
import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.core.utilites.result.SuccessDataResult;
import kodlamaio.hrms.core.utilites.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeesDao;
import kodlamaio.hrms.entities.concretes.Employees;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesManager implements EmployeesService {

    private EmployeesDao employeesDao;

    public EmployeesManager(EmployeesDao employeesDao) {
        super();
        this.employeesDao = employeesDao;
    }

    @Override
    public DataResult<List<Employees>> getAll() {
        return new SuccessDataResult<List<Employees>>(this.employeesDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(Employees employees) {
        this.employeesDao.save(employees);
        return new SuccessResult("Çalışan Eklendi.");
    }
}
