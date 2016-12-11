package com.conf;

import com.edu.ukits.domain.StudingroupDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author Ќюта
 */
@Configuration
@EnableWebMvc
@ComponentScan({ "com.conf", "com" })
//@Import({ AppSecurityConfig.class })
public class WebConfig {
 
@Bean
 public InternalResourceViewResolver viewResolver() {
 InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
 viewResolver.setViewClass(JstlView.class);
 viewResolver.setPrefix("/WEB-INF/views/");
 viewResolver.setSuffix(".jsp");
 return viewResolver;
 }
 
// @Bean
//public StudingroupDaoImpl studingroupImpl(){
//    return new StudingroupDaoImpl();
//}
}

