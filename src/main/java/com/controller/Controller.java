package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("/Bla")
            public String index()
    {
        return "hello world";
    }

    @GetMapping("/shout")
    public String shout()
    {
        return "shout";
    }

    //bla bla bla

    //Hej - Ulrik

    //Hej Ulric - Johannes

    //Jeg Vil have linje plads 25 - Ulrik

    //Min branch er meget federe end jeres

}
