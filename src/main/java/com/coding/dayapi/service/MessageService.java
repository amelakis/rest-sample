package com.coding.dayapi.service;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

    private static final String MORNING="MERA";
    private static final String NIGHT="NUXTA";

    private static final String GOOD_MORNING="KALIMERA";
    private static final String GOOD_NIGHT="KALINIXTA";

    private static final String STANDARD_GREETING="Hey Mate!";

    public String getGreeting(String input) {
        switch (input) {
            case MORNING:
                return GOOD_MORNING;
            case NIGHT:
                return GOOD_NIGHT;
            default:
                return STANDARD_GREETING;
        }
    }

}
