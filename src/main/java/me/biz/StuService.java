package me.biz;

import me.domain.Stu;
import me.enums.ResultEnum;
import me.exception.StuException;
import me.repository.StuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class StuService {

    @Autowired
    private StuRepository stuRepository;

    @Transactional
    public void saveStu(Stu stu) throws StuException {

        if(stu.getAge()<18) {
            throw new StuException(ResultEnum.TOOYOUNG);
        } else if(stu.getAge() >= 18 && stu.getAge() < 60) {
            stuRepository.save(stu);
        } else if( stu.getAge() >=60) {
            throw new StuException(ResultEnum.OVERAGE);
        } else {
            throw new StuException(ResultEnum.UNKONW_ERROR);
        }



    }


}
