package com.hib.exa.servicewithimpl;

import com.hib.exa.model.Emp;
import com.hib.exa.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class EmpService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private EmpRepo empRepo;

    public List<Emp> getEmp() {
        return empRepo.findAll();
    }

    public void save(Emp emp) {
        empRepo.save(emp);
    }

    public List<Emp> getEmpwithCri(List<String> searchBase) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Emp> query = builder.createQuery(Emp.class);
        Root r = query.from(Emp.class);
        return entityManager.createQuery(query).getResultList();
    }
}
