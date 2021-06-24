package cn.gson.prohis.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.PostConstruct;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Configuration//跨域访问
    public class MyConfiguration {
        @Bean
        public WebMvcConfigurer corsConfigurer() {
            return new WebMvcConfigurerAdapter() {
                @Override
                public void addCorsMappings(CorsRegistry registry) {
                    registry.addMapping("/**");
                }
            };
        }
    }

    @Configuration//注册转换器
    public class WebDateConfig {
        @Autowired
        private RequestMappingHandlerAdapter handlerAdapter;

        @PostConstruct
        public void initEditableAvlidation() {
            ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer) handlerAdapter.getWebBindingInitializer();
            if (initializer.getConversionService() != null) {
                GenericConversionService genericConversionService = (GenericConversionService) initializer.getConversionService();
                genericConversionService.addConverter(new DateConverter());//添加自定义的类型转换器
            }
        }
    }
	/*@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 多个拦截器组成一个拦截器链
		// addPathPatterns 用于添加拦截规则
		// excludePathPatterns 用户排除拦截
		registry.addInterceptor(new LoginInterceptor())                   //添加拦截器
				.addPathPatterns("/**")                    //拦截所有请求
				.excludePathPatterns("/come/login","/forgetcode","/forgetphonecode");    //对应的不拦截的请求

		super.addInterceptors(registry);
	}*/


}
