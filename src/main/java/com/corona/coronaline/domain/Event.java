package com.corona.coronaline.domain;

import com.corona.coronaline.constant.EventStatus;

import java.time.LocalDateTime;

public class Event {

    private Long id;
    private Place place;
    private String eventName;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDatetime;
    private LocalDateTime eventEndDatetime;
    private Integer currentNumberOfPeople;
    private Integer capacity;
    private String memo;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
