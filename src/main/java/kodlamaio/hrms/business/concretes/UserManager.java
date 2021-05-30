package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    @Override
    public DataResult<List<User>> getAll() {
        return null;
    }

    @Override
    public Result add(User user) {
        return null;
    }
}
