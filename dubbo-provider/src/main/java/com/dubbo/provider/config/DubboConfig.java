package com.dubbo.provider.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by lxq on 15-11-17.
 */
@Configuration
@ImportResource("classpath:dubbo_provider.xml")
public class DubboConfig {
}
