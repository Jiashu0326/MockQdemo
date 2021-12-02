package com.laioffer.laidemo1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "interview")
public class Interview implements Serializable {

    private static final long serialVersionUID = -2455760938054036364L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String industry;

    private String position;

    private String question_type;

    private String recordingURL;

    private String Time;


    @ManyToOne
    @JsonIgnore
    private Record record;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getindustry() {
        return industry;
    }
    public void setindustry(String industry) {
        this.industry = industry;
    }

    public void setposition(String position) {
        this.position = position;
    }
    public String getposition() {
        return position;
    }

    public void setquestion_type(String question_type) {
        this.question_type = question_type;
    }
    public String getquestion_type() {
        return question_type;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }
    public String getTime() {
        return Time;
    }

    public void setrecordingURL(String recordingURL) {
        this.recordingURL = recordingURL;
    }
    public String getrecordingURL() {
        return recordingURL;
    }


    public Record getRecord() {
        return record;
    }
    public void setRecord(Record record) {
        this.record = record;
    }
}
