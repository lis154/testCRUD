package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration  // данный класс является конфигурационным и содержит определения и зависимости bean
@EnableWebMvc  //позволяет импортировать конфигурацию Spring MVC из класса WebMvcConfigurationSupport
@ComponentScan() //сообщает Spring где искать компоненты, которыми он должен управлять, т.е. классы,
// помеченные аннотацией @Component или ее производными, такими как @Controller, @Repository,
// @Service. Эти аннотации автоматически определяют бин класса
public class WebConfig {
    @Bean
    ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
        viewResolve.setPrefix("/pages/");
        viewResolve.setSuffix(".jsp");
        return viewResolve;
    }
}
