package net.Bootpract.Bootcopractice.controller;

import net.Bootpract.Bootcopractice.AccentureEmp;
import net.Bootpract.Bootcopractice.Employee;
import net.Bootpract.Bootcopractice.TechMahindra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
////    @GetMapping("/kill")
////    public  String Hi(){
////        return "Hello";
////    }
//private Employee e;
//    private AccentureEmp ae;
//    private Tcsemployee tcs;
//    private TechMahindra tm;
////    @Autowired
////public DemoController(AccentureEmp ae){
////    this.ae=ae;
////@Autowired
////    public void set(AccentureEmp ae){
////        this.ae=ae;
////}
//    @Autowired
//public void set(Employee e){
//    this.e=e;
//}
//    Employee tc = new Tcsemployee();
//    Employee tech = new TechMahindra();
//
//    @GetMapping("h")
//    public String Sa(){
//        return "Saim";
//    }
//    @GetMapping("i")
//    public String work(AccentureEmp ae){
//        return ae.getworkdone();
//    }
//    public String work(Tcsemployee tcs){
//        return tcs.getworkdone();
//    }
//    @GetMapping("/Saim")
//    public String saim(){
//        return e.getworkdone();
//    }
//    @GetMapping("/tcs")
//    public String tc(){
//        return tc.getworkdone();
//    }
//    @GetMapping("/tech")
//    public String tm(){
//        return tech.getworkdone();
//    }
private Employee e;
    @Autowired
public void set(Employee e){
    this.e=e;
    }
    @GetMapping("/")
    public String work() {
       return e.getworkdone();

}
}
