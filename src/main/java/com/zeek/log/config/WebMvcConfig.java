package com.zeek.log.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 跨域配置
 */
//@Configuration
//public class WebMvcConfig  {
//    private CorsConfiguration corsConfig() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//
//        corsConfiguration.addAllowedOrigin("http://localhost:63342");
//        corsConfiguration.addAllowedHeader("*");
//        corsConfiguration.addAllowedMethod("*");
//        corsConfiguration.setAllowCredentials(false);
//        corsConfiguration.setMaxAge(3600L);
//        return corsConfiguration;
//    }
//
//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", corsConfig());
//        return new CorsFilter(source);
//    }
//}