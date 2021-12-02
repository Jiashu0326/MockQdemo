package com.laioffer.laidemo1.service;

import com.laioffer.laidemo1.entity.*;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

@Service
public class InterviewService {

    @Autowired
    private SessionFactory sessionFactory;

    public Interview getInterview(int interviewId) {
        try (Session session = sessionFactory.openSession()) {
            Interview interview = session.get(Interview.class, interviewId);
            if (interview != null) {
                return interview;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new Interview();
    }
}