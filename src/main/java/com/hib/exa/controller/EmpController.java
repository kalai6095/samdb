package com.hib.exa.controller;

import com.hib.exa.model.Emp;
import com.hib.exa.servicewithimpl.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/getEmp")
    public List<Emp> getEmpDetails() {
        List<Emp> emplist = empService.getEmp();
        return emplist;
    }

    @PostMapping("/saveEmp")
    public String storeEmpDetails(@RequestBody Emp emp) {
        empService.save(emp);
        return "";
    }

    @PostMapping("/getWithCri")
    public List<Emp> getEmpDetailswithCri(@RequestBody  List<String> searchBase){
        List<Emp> emplist=empService.getEmpwithCri(searchBase);
        return emplist;
    }
}
