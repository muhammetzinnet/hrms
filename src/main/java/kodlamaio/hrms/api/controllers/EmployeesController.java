package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployeesService;
import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    private EmployeesService employeesService;

    @Autowired
    public EmployeesController(EmployeesService employeesService) {
        super();
        this.employeesService = employeesService;
    }

    @GetMapping("/getall")
    public DataResult<List<Employees>>geyAll(){
        return this.employeesService.getAll();
    }

    @PostMapping("/add")
    public Result add(Employees employees){
        return this.employeesService.add(employees);
    }
}
