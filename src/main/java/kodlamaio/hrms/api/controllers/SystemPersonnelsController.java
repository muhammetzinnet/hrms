package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.SystemPersonnelService;
import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.core.utilites.result.SuccessDataResult;
import kodlamaio.hrms.entities.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/system_personnels")
public class SystemPersonnelsController {

    private SystemPersonnelService systemPersonnelService;

    @Autowired
    public SystemPersonnelsController(SystemPersonnelService systemPersonnelService) {
        super();
        this.systemPersonnelService = systemPersonnelService;
    }

    @GetMapping("/getall")
    public DataResult<List<SystemPersonnel>>getAll(){
        return this.systemPersonnelService.getAll();
    }

    @PostMapping("/add")
    public Result add(SystemPersonnel systemPersonnel){
        return this.systemPersonnelService.add(systemPersonnel);
    }
}
