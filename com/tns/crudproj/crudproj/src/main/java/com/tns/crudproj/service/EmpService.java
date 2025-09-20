package com.tns.crudproj.service;

import com.tns.crudproj.entity.Emp;
import com.tns.crudproj.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    public EmpRepo er;

    //insert
    public Emp addEmp(Emp emp){
        return er.save(emp);
    }

    //get
    public List<Emp> getEmp(){
        return er.findAll();
    }

    //delete
    public void delete(int eid){
        er.deleteById(eid);
    }

    //update
    public Emp updateEmp(Emp emp){
        Integer eid=emp.getEid();
        //getEid-->userinput
        //findbyid-->db input
        Emp emp1=er.findById(eid).get();
        emp1.setEname(emp.getEname());
        emp1.setEsal(emp.getEsal());
        return er.save(emp1);
    }

}
