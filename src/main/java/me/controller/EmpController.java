package me.controller;

import me.biz.EmpService;
import me.domain.Emp;
import me.exception.util.ResultUtil;
import me.repository.EmpRepository;
import me.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpRepository empRepository;

    @Autowired
    private EmpService empService;

    @GetMapping(value="/emps")
    public List<Emp> getEmps(){
        return empRepository.findAll();
    }
    
    @PostMapping(value = "/emps" )
    public Result<Emp> saveEmp(@Valid Emp emp , BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtil.success(empRepository.save(emp));
    }

    @GetMapping(value = "/emps/{id}")
    public Emp getEmp(@PathVariable("id" ) Integer id){
        return empRepository.findOne(id);
    }

    @PutMapping(value = "/emps/{id}")                               
    public Emp updateEmp(@PathVariable("id") Integer id , Emp emp) {
        
        return empRepository.save(emp);
    }

    @DeleteMapping(value = "/emps/{id}")
    public void removeEmp(@PathVariable("id") Integer id) {
        empRepository.delete(id);
    }


    /////////////////

    @GetMapping(value = "/emps/age/{age}")
    public List<Emp> getEmpsByAge(@PathVariable("age") Integer age) {
        return empRepository.findByAge(age);
    }

    @PostMapping(value = "/emps" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Emp> saveEmps(@RequestBody List<Emp> emps) {
        return empService.saveEmps(emps);
    }

}
