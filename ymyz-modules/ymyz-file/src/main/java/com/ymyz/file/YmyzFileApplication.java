package com.ymyz.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.ymyz.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 文件服务
 * 
 * @author zhangmingxiao
 */
@EnableCustomSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class YmyzFileApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(YmyzFileApplication.class, args);
        System.out.println("\033[35;1m" + "          (♥◠‿◠)ﾉﾞ  文件服务模块启动成功   ლ(´ڡ`ლ)ﾞ               \n" +
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
