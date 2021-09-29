package com.corona.coronaline.controller.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

//APIPlaceRouter 확인을 위해 빈등록을 잠시 해제
//http://localhost:5050/actuator/beans 빈쪽에서 확인가능
//@RequestMapping("/api")
//@RestController
public class APIPlaceController {

    @GetMapping("/places")
    public List<String> getPlaces(){
        return List.of("place1" , "place2");
    }

    @PostMapping("/places")
    public Boolean createPlace(){
        return true;
    }

    @GetMapping("/places/{placeId}")
    public String getPlaces(@PathVariable Integer placeId){
        return "place " + placeId;
    }

    @PutMapping("place/{placeId}")
    public Boolean modifyPlace(@PathVariable Integer placeId){
        return true;
    }

    @DeleteMapping("/places/{placeId}")
    public Boolean removePlace(@PathVariable Integer placeId){
        return true;
    }

}
