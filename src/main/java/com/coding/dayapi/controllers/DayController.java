package com.coding.dayapi.controllers;

import com.coding.dayapi.dto.DayMessageDto;
import com.coding.dayapi.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DayController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/day-message", method = RequestMethod.GET)
    public DayMessageDto standardDayMessage() {
        DayMessageDto dayMessageDto = new DayMessageDto();
        dayMessageDto.setMessage(messageService.getGreeting(null));

        return dayMessageDto;
    }
    

    @RequestMapping(value = "/day-message/{input}", method = RequestMethod.GET)
    public DayMessageDto dayMessage(@PathVariable String input) {
        DayMessageDto dayMessageDto = new DayMessageDto();
        dayMessageDto.setMessage(messageService.getGreeting(input));

        return dayMessageDto;
    }



}
