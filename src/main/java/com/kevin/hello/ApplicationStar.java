package com.kevin.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukuanpc on 2017/9/24.
 */
@SpringBootApplication //自动扫描
public class ApplicationStar extends SpringBootServletInitializer {

    /**
     * Configure your application when it’s launched by the servlet container
     * 外置tomcat运行时 由此启动 必须既承自 SpringBootServletInitializer  不然404
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationStar.class);

    }


    //内置tomcat运行时由此启动
    public static void  main(String[] args){
        SpringApplication.run(ApplicationStar.class,args);
    }

}
