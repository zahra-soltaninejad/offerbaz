//package ir.alzahra.offerBaz.config;
//
///**
// * @Author: zahra soltaninejad
// * @Date: 4/19/2019, Fri
// **/
//import ir.rayan.bankSystem.facade.UserFacade;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class ApplicationStartUp implements ApplicationListener<ContextRefreshedEvent> {
//
//    @Autowired
//    public ApplicationStartUp(UserFacade userFacade) {
//        this.userFacade = userFacade;
//    }
//
//    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        userFacade.insertUser("admin", "admin", "ROLE_ADMIN");
//
//    }
//}
