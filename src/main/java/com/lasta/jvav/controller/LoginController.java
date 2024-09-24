package com.lasta.jvav.controller;


import com.lasta.jvav.common.Response;
import com.lasta.jvav.model.vo.LoginVo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Value("${github.clientId}")
    private String clientId;

    @Value("${github.appId}")
    private String appId;

    @PostMapping("/auth/login")
    private Response<LoginVo> login(String username, String password) {
        String auth = String.format("%s:%s", username, password);
        System.out.println(auth);
        LoginVo vo = new LoginVo();
        vo.setToken(auth);
        return Response.OK(vo);
    }
}
