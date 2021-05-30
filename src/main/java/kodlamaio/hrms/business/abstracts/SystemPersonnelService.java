package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.SystemPersonnel;

import java.util.List;

public interface SystemPersonnelService {
    DataResult<List<SystemPersonnel>>getAll();
    Result add(SystemPersonnel systemPersonnel);
}
