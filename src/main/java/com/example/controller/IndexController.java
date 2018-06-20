//package com.example.controller;
//
//import com.example.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author zzf
// * @date 18/5/6 17:47.
// */
//@RestController
//public class IndexController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/find")
//    public Object find(int age) {
//
//        return userService.find(age);
//    }
//
//
//    @RequestMapping(value = {"/index", "/show"}, method = RequestMethod.GET)
//    public Map<String, String> index() {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("悟空", "monkey");
//        map.put("鲁班", "hero");
//        return map;
//    }
//
//    @RequestMapping(value = {"/index2", "/show2"}, method = RequestMethod.POST)
////    @PostMapping("/index2")
//    public Map<String, String> index2() {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("悟空", "monkey");
//        map.put("鲁班", "hero");
//        return map;
//    }
//
//
//}
