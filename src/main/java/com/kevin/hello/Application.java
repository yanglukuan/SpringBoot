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
public class Application extends SpringBootServletInitializer {

    /**
     * Configure your application when it’s launched by the servlet container
     * 外置tomcat运行时 由此启动 必须既承自 SpringBootServletInitializer  不然404
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);

    }


    //内置tomcat运行时由此启动
    public static void  main(String[] args){

//        List<String>  ss=new ArrayList<String>();
//
//        ss.add("23");
//
//        ss.stream().forEach(m->System.out.print(m));

        SpringApplication.run(Application.class,args);
    }

}
