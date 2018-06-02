package com.karma.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.karma.springdemo,com.karma.model,com.karma.service,com.karma.config")
public class AppConfig {

}
