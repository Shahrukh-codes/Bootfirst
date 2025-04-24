package net.Bootpract.Bootcopractice.controller;

import net.Bootpract.Bootcopractice.AccentureEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//    @GetMapping("/kill")
//    public  String Hi(){
//        return "Hello";
//    }

    private AccentureEmp ae;
    @Autowired
public DemoController(AccentureEmp ae){
    this.ae=ae;

}
    @GetMapping("h")
    public String Sa(){
        return "Saim";
    }
    @GetMapping("i")
    public String work(AccentureEmp ae){
        return ae.getworkdone();
    }
}
