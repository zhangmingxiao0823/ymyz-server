package com.ymyz.admin;

import com.ymyz.common.security.annotation.EnableCustomConfig;
import com.ymyz.common.security.annotation.EnableRyFeignClients;
import com.ymyz.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class YmyzAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(YmyzAdminApplication.class, args);
        System.out.println("\033[35;1m" + "          (♥◠‿◠)ﾉﾞ  Admin模块启动成功   ლ(´ڡ`ლ)ﾞ               \n" +
                "                                                                    \n" +
                "                   $$$   $                  $$$                     \n" +
                "                   $$$  $$$                 $$$                     \n" +
                "        $$$$$$$$$$$$$$$$$$$$     $$$$$$$ $$$$$$$$$$$$        $$$    \n" +
                "        $$$$$$$$$$$$$$$$$$$$     $$$$$$$ $$$$$$$$$$$$        $$$    \n" +
                "        $$$        $$$             $$$      $$$   $$$        $$$    \n" +
                "        $$$        $$$  $$$        $$$      $$$   $$$        $$$    \n" +
                "        $$$$$$$$$$ $$$  $$$        $$$      $$$   $$$        $$$    \n" +
                "        $$$    $$$ $$$ $$$         $$$     $$$    $$$        $$$    \n" +
                "        $$$    $$  $$$$$$        $$$$$$$  $$$     $$$               \n" +
                "        $$$ $ $$$  $$$$$    $    $$$$$$$ $$$      $$$        $$$    \n" +
                "       $$$$ $$$$ $$$$$$$   $$           $$$  $$   $$$        $$$    \n" +
                "      $$$$      $$$$  $$$$$$$          $$$    $$$$$$                " +
                "\033[0m");
    }
}
