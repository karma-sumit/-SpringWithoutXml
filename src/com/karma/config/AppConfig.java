package com.karma.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.karma.springdemo,com.karma.model,com.karma.service,com.karma.config")
@PropertySource("classpath:application.properties")
public class AppConfig {

}
