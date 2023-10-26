package com.ymyz.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ymyz.common.security.annotation.EnableCustomConfig;
import com.ymyz.common.security.annotation.EnableRyFeignClients;
import com.ymyz.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 *
 * @author zhangmingxiao
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class YmyzSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(YmyzSystemApplication.class, args);
        System.out.println("\033[35;1m" + "          (♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ               \n" +
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
