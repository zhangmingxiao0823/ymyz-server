package com.ymyz.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ymyz.common.security.annotation.EnableCustomConfig;
import com.ymyz.common.security.annotation.EnableRyFeignClients;
import com.ymyz.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 * 
 * @author zhangmingxiao
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients   
@SpringBootApplication
public class YmyzJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(YmyzJobApplication.class, args);
        System.out.println("\033[35;1m" + "          (♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ               \n" +
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
