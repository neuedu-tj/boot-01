package me.biz;

import me.domain.Emp;
import me.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepository empRepository;

    @Transactional
    public List<Emp> saveEmp(List<Emp> emps) {
        return empRepository.save(emps);
    }

}
