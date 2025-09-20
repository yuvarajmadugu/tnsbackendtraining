package com.tns.crudproj.controller;

import com.tns.crudproj.entity.Emp;
import com.tns.crudproj.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    public EmpService es;

    //add
    @PostMapping("/addemp")
    public Emp addEmp(@RequestBody Emp emp){
        return es.addEmp(emp);
    }

    //get
    @GetMapping("/getemp")
    public List<Emp> getEmp(){
        return es.getEmp();
    }

    @DeleteMapping("/deleteeid/{eid}")
    public void deleteEmp(@PathVariable int eid){
        es.delete(eid);
    }

}
