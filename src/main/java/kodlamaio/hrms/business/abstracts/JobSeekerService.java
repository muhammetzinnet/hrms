package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    DataResult<List<JobSeeker>>getAll();
    Result add(JobSeeker jobSeeker);
}
