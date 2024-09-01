package com.yukanno.algorithmPlatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author waves
 * @date 2024/4/24 22:39
 */
@SpringBootApplication
@MapperScan("com.yukanno.algorithmPlatform.mapper") // 配置要扫描的包
//@ComponentScan(basePackages = {"com.waves.core", "com.waves.payment"}) //配置要扫描的组件和配置
public class PlatformApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlatformApplication.class,args);
        System.out.println("算法主平台启动成功 (＾－＾)V  YUKANNO ");
    }
}