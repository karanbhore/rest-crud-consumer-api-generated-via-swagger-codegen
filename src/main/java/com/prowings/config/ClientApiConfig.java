package com.prowings.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.prowings.ProductApi;
import com.prowings.client.invoker.ApiClient;

@Configuration
public class ClientApiConfig {

    @Bean
    public ApiClient apiClient() {
        return new ApiClient();
    }

    @Bean
    public ProductApi productApi(ApiClient apiClient) {
        return new ProductApi(apiClient);
    }
    @Bean
    public RestTemplate restTemplate() {
    	return new RestTemplate();
    }
}
