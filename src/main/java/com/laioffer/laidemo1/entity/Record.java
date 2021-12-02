package com.laioffer.laidemo1.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "record")
public class Record implements Serializable {

    private static final long serialVersionUID = 8436097833452420298L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(mappedBy = "record", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Interview> interviewList;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public List<Interview> getInterviewList() {
        return interviewList;
    }

    public void setInterviewList(List<Interview> interviewList) {
        System.out.println(interviewList);
        this.interviewList = interviewList;
    }

}

