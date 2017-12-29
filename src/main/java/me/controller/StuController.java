package me.controller;


import me.biz.StuService;
import me.domain.Stu;
import me.exception.StuException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class StuController {


    @Autowired
    private StuService stuService;


    @PostMapping("stus")
    public void saveStu(Stu stu) throws StuException {
        stuService.saveStu(stu);
    }


}
