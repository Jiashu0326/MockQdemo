package com.laioffer.laidemo1.service;

import com.laioffer.laidemo1.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class RecordService {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private SessionFactory sessionFactory;

    public Record getRecord() {
        Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
        String username = loggedInUser.getName();
        Customer customer = customerService.getCustomer(username);

        if (customer != null) {
            Record record = customer.getRecord();
            for (Interview item : record.getInterviewList()) {

            }
            return record;
        }
        return new Record();
    }

    public void removeInterview(int InterviewId) {

        Session session = null;
        try {
            session = sessionFactory.openSession();
            Interview interview = session.get(Interview.class, InterviewId);
            Record record = interview.getRecord();
            record.getInterviewList().remove(interview);

            session.beginTransaction();
            session.delete(interview);
            session.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            if (session != null) {
                session.getTransaction().rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
