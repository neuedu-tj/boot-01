package me.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
@Data
public class Stu {

    @Id
    @GeneratedValue
    private Integer sid;
    private String sname;

    @Min(value = 17 , message = ">>>>> [EERROR] : invalid age . ")
    private Integer age;
    private double score;

    

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Stu{");
        sb.append("sid=").append(sid);
        sb.append(", sname='").append(sname).append('\'');
        sb.append(", age=").append(age);
        sb.append(", score=").append(score);
        sb.append('}');
        return sb.toString();
    }


}
