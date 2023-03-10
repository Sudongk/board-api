package com.myboard.config.web;

import com.myboard.aop.resolver.LoginUserIdResolver;
import com.myboard.aop.resolver.SearchParamsArgumentResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class WebMvcConfig implements WebMvcConfigurer {

    private final LoginUserIdResolver loginUserIdResolver;
    private final SearchParamsArgumentResolver searchParamsArgumentResolver;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(loginUserIdResolver);
        resolvers.add(searchParamsArgumentResolver);
    }
}
