package com.corona.coronaline.controller.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

import java.util.List;

@Configuration
public class APIPlaceRouter {

//    어짜피 빈이라서 자동으로 등록된다
//    private final APIPlaceHandler apiPlaceHandler;

    @Bean
    public RouterFunction<ServerResponse> placeRouter(APIPlaceHandler apiPlaceHandler){
        return RouterFunctions.route().nest(RequestPredicates.path("/api/places") , builder -> builder
                .GET("" , apiPlaceHandler::getPlaces)
                .POST(""  , apiPlaceHandler::createPlace)
                .GET("/{placeId}" , apiPlaceHandler::getPlace)
                .PUT(("/{placeId}") , apiPlaceHandler::modifiyPlace)
                .DELETE(("/{placeId}") , apiPlaceHandler::deletePlace)
        ).build();


    }

}
