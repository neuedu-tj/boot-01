package me.repository;

import me.domain.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpRepository extends JpaRepository<Emp, Integer>{

    List<Emp> findByAge(Integer age);
    
}

