package com.ymyz.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.ymyz.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 *
 * @author zhangmingxiao
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class YmyzAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(YmyzAuthApplication.class, args);
        System.out.println("\033[35;1m" + "          (♥◠‿◠)ﾉﾞ  认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ               \n" +
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
