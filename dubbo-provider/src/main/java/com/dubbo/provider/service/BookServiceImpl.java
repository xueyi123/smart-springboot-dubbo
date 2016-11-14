package com.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.BookService;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public String say(String txt) {
        System.out.println(txt);
        return "Say::::"+txt;
    }
}
