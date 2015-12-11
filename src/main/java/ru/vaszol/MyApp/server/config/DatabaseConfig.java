package ru.vaszol.MyApp.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

/**
 * Created by vas on 12.12.2015.
 */
@Configuration
@EnableJpaRepositories("ru.vaszol.MyApp.server.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("ru.vaszol.MyApp.server")
public class DatabaseConfig {

    @Resource
    private Environment env;
}
