package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.SystemPersonnelService;
import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.core.utilites.result.SuccessDataResult;
import kodlamaio.hrms.core.utilites.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SystemPersonnelDao;
import kodlamaio.hrms.entities.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemPersonnelManager implements SystemPersonnelService {

    private SystemPersonnelDao systemPersonnelDao;

    @Autowired
    public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao) {
        super();
        this.systemPersonnelDao = systemPersonnelDao;
    }

    @Override
    public DataResult<List<SystemPersonnel>> getAll() {
        return new SuccessDataResult<List<SystemPersonnel>>(this.systemPersonnelDao.findAll(),"Data Listelendi.");
    }

    @Override
    public Result add(SystemPersonnel systemPersonnel) {
        this.systemPersonnelDao.save(systemPersonnel);
        return new SuccessResult("Sistem personeli eklendi.");
    }
}
