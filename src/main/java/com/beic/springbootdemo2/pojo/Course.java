package com.beic.springbootdemo2.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Course implements Serializable {
    private static final long serialVersionUID = -2919526457023308317L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String cno;
    String cname;

    public Course() {
    }

    public Course(String cno, String cname) {
        this.cno = cno;
        this.cname = cname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return
                "{\n" +
                        "id:" + id + ",\n" +
                        "Cno:" + cno + ",\n" +
                        "Cname:" + cname + "\n" +
                        "}";
    }
}
