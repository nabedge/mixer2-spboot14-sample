package com.example;

import org.mixer2.Mixer2Engine;
import org.mixer2.spring.webmvc.Mixer2XhtmlViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SampleConfig {

    @Bean
    public Mixer2Engine mixer2Engine() {
        return new Mixer2Engine();
    }

    @Bean
    public Mixer2XhtmlViewResolver mixer2XhtmlViewResolver() {
        Mixer2XhtmlViewResolver resolver = new Mixer2XhtmlViewResolver();
        resolver.setPrefix("classpath:/m2template/");
        resolver.setSuffix(".html");
        resolver.setBasePackage("com.example.view");
        resolver.setMixer2Engine(mixer2Engine());
        resolver.setOrder(100);
        return resolver;
    }
}
