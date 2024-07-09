package com.example.precourse.ch2.controller;

import com.example.precourse.ch2.model.BookQueryParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "/hello")
    public String hello(){
        return "<html><body><h1>Hello Spring Boot</h1></body></html>";
    }

    @GetMapping(path = "/echo/{message}/{age}/{isMan}")
    public String echo(
            @PathVariable String message,
            @PathVariable(name = "age") int number,
            @PathVariable boolean isMan){
        System.out.print("echo Message : " + message +" " + number +"isMan?" + isMan);
        return message.toUpperCase();
    }

    @GetMapping(path = "/book")
    public void queryParam(
            @RequestParam String category,
            @RequestParam String issuedYear,
            @RequestParam(name = "issued-month") String issuedMonth,
            @RequestParam(name = "issued_day") String issuedDay
        ){
            System.out.println(category);
            System.out.println(issuedYear);
            System.out.println(issuedMonth);
            System.out.println(issuedDay);
        }

    @GetMapping(path = "/book2")
    public void queryParamDto(
        BookQueryParam bookQueryParam
    ){
        System.out.println(bookQueryParam.getCategory());
        System.out.println(bookQueryParam.getIssuedMonth());
        System.out.println(bookQueryParam.getIssuedYear());
        System.out.println(bookQueryParam.getIssuedDay());
    }
}
