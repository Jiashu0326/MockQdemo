package com.laioffer.laidemo1.controller;

import com.laioffer.laidemo1.entity.Interview;
import com.laioffer.laidemo1.service.InterviewService;
import com.laioffer.laidemo1.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class InterviewController {
    @Autowired
    private InterviewService interviewService;

    @RequestMapping(value = "/interview{interviewId}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.CREATED)
    @ResponseBody
    public Interview getInterview(@PathVariable("interviewId") int interviewId) {
        return interviewService.getInterview(interviewId);
    }
}

