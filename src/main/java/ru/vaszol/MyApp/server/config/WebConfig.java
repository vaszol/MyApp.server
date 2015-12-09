package ru.vaszol.MyApp.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by vas on 09.12.2015.
 */
@Configuration
@EnableWebMvc
@ComponentScan("ru.vaszol.MyApp.server")
public class WebConfig extends WebMvcConfigurerAdapter{
}
