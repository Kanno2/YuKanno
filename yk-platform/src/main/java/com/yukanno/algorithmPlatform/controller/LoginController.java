package com.yukanno.algorithmPlatform.controller;

import com.yukanno.algorithmPlatform.entity.DTO.LoginDTO;
import com.yukanno.algorithmPlatform.entity.Result;
import com.yukanno.algorithmPlatform.service.LoginService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/common")
@AllArgsConstructor
@NoArgsConstructor
public class LoginController {

    private LoginService loginService;

    @PostMapping("/login")
    public Result login(@RequestBody LoginDTO loginDTO){
        return Result.success();
    }
}
