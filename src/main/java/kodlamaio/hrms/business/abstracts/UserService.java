package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {
    DataResult<List<User>>getAll();
    Result add(User user);
}
