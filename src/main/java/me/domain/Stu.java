package me.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class Stu {

    @Id
    @GeneratedValue
    private Integer sid;
    private String sname;

    @Min(value = 17 , message = ">>>>> [EERROR] : invalid age . ")
    private Integer age;
    private double score;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

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
