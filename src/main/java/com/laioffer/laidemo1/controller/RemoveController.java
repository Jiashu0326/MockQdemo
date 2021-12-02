package com.laioffer.laidemo1.controller;

import com.laioffer.laidemo1.entity.Interview;
import com.laioffer.laidemo1.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class RemoveController {

    @Autowired
    private RecordService recordService;

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void remove(@RequestBody Interview removeinterview) {
        int removeinterviewID = removeinterview.getId();
        recordService.removeInterview(removeinterviewID);
    }
}
