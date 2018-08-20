package com.hib.exa.repo;

import com.hib.exa.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Emp,Long> {
}
