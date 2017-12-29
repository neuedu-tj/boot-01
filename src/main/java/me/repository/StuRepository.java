package me.repository;

import me.domain.Stu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuRepository extends JpaRepository<Stu , Integer> {

    
}
