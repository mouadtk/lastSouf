package com.opm.snds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.opm.snds.app")
@Import({ SecurityConfig.class })
public class AppConfig extends  WebMvcConfigurerAdapter{

	@Bean
    public  ViewResolver viewResolver() {
		
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass( JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        
        return viewResolver;
    }
	
	/** 
	@Bean
    public UrlBasedViewResolver viewResolver() {
		UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
        viewResolver.setViewClass(TilesViewResolver.class);
        return viewResolver;
    }
	 */
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/assets/**").addResourceLocations("/resources/assets/");
	}
	
//	@Bean
//	public ResourceBundleMessageSource messageSource() throws Exception {
//	    ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
//	    resourceBundleMessageSource.setBasename("/WEB-INF/messages/message.properties");
//	    return resourceBundleMessageSource;
//	}
//
//	@Bean
//	public PropertiesFactoryBean propertiesFactoryBean() throws Exception {
//	    PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
//	    Resource resource = new ClassPathResource("/WEB-INF/messages/message.properties");
//	    propertiesFactoryBean.setLocation(resource);
//	    return propertiesFactoryBean;
//	}
	
}
