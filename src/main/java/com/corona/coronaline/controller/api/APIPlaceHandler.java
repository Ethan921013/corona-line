package com.corona.coronaline.controller.api;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.HandlerFunction;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.ServerResponse.ok;

import java.net.URI;
import java.util.List;

@Component
public class APIPlaceHandler{

    public ServerResponse getPlaces(ServerRequest request){
        return ok().body(List.of("place1" , "place2"));
    }

    public ServerResponse createPlace(ServerRequest request){
        return ServerResponse.created(URI.create("/api/places/1")).body(true); //TODO 1은 구현할 때 필요
    }

    public ServerResponse getPlace(ServerRequest request){
        return ok().body("place " + request.pathVariable("placeId"));
    }

    public ServerResponse modifiyPlace(ServerRequest request){
        return ok().body(true);
    }

    public ServerResponse deletePlace(ServerRequest request){
        return ok().body(true);
    }

}
