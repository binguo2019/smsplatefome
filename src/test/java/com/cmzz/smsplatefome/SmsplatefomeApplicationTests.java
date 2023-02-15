//package com.cmzz.smsplatefome;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//@RunWith(SpringRunner.class)
////@WebAppConfiguration
//@SpringBootTest
//public class SmsplatefomeApplicationTests {
//
//    private MockMvc mvc;
//
//    @BeforeEach
//    public void setUp() throws Exception {
//        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
//    }
//    @Test
//    public void contextLoads() throws Exception {
//        RequestBuilder request = null;
//
//        // 1、get
//        request = MockMvcRequestBuilders.get("/")
//                .contentType(MediaType.APPLICATION_JSON);
//        mvc.perform(request)
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print())
//                .andReturn();
//
//    }
//
//
//}
