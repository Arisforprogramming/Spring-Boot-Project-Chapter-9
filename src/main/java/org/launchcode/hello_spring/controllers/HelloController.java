package org.launchcode.hello_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//1.Add notation controller and import statement
@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    //2. add public string
    //3. add response body
    //4. add GetMapping
    //change or handle requests at  path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    //because putting @RequestMapping("hello") on top now this will live in /hello/goodbye
    public String goodbye() {
        return "goodbye, Spring!";

    }

    //Handles requests of the form /hello?name=Launchcode
    //@RequestMapping is if I want to use both GET and POST
    //because putting @RequestMapping("hello") on top now this will live in /hello/hello
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryRaram(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    //Handles requests of the form /making?coder=a
    //because putting @RequestMapping("hello") on top now this will live in /hello/making
    @GetMapping("making")
    public String testParam(@RequestParam String coder) {
        return "what's up dog, " + coder + "!";
    }

    //Handle requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    //create form method
    //hello/form
    @GetMapping("form1")
    public String helloForm() {
        return "form1";
    }
//how to fix duplicating behavior put duplicate one up top

}
