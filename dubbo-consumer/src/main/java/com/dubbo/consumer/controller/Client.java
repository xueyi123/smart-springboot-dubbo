package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lxq on 15-11-17.
 */
@RestController
public class Client {
	
	private static final Logger log = LoggerFactory.getLogger(Client.class);

	/**
	 * dubbo注解，远程调用分布
	 */
    @Reference
    private BookService xmlService;



    /**
     * http://localhost:8082/test
     * mainInterfaceTest2
     * @return 
     * Integer
     * @exception 
     * @since  1.0.0
     */
    @RequestMapping("/test")
    @ResponseBody
    public Integer  mainInterfaceTest2(){
        String a = xmlService.say("ddddddddddddddddddddddddddd");
        System.out.println("<<<<<<<<<<<<"+a);
        log.info("客户端调用返回结果" + a);
        return 1;
    }
    
}
