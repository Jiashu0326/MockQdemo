package com.laioffer.laidemo1.controller;

import com.laioffer.laidemo1.entity.Record;
import com.laioffer.laidemo1.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecordController {

    @Autowired
    private RecordService recordService;

    @RequestMapping(value = "/record", method = RequestMethod.GET)
    @ResponseBody
    public Record getRecord(){
        return recordService.getRecord();
    }
}

