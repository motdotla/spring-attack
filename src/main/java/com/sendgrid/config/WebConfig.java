package com.sendgrid.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.sendgrid.controllers")
public class WebConfig extends WebMvcConfigurerAdapter {
 
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
  }

  @Bean
  public InternalResourceViewResolver viewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver(); 
    resolver.setPrefix("/WEB-INF/views/");                                     
    resolver.setSuffix(".jsp");
    return resolver;                                                          

  }                                                                            
}
