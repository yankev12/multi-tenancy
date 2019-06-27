package com.multitenancy.multitenancy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class WebAppConfigAdapter extends WebMvcConfigurerAdapter {
 
	@Autowired
	InterceptorConfig  interceptor;
	
	@Override
	public void addInterceptors (InterceptorRegistry interceptorRegistry) {
		interceptorRegistry.addInterceptor(interceptor);
	}
}