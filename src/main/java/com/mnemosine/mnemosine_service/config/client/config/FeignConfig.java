package com.mnemosine.mnemosine_service.config.client.config;

import com.mnemosine.mnemosine_service.config.client.properties.FeignProperties;
import feign.Logger;
import feign.RequestInterceptor;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class FeignConfig {

  private final FeignProperties feignProperties;

  @Bean
  public RequestInterceptor requestInterceptor() {
    return requestTemplate -> {
      requestTemplate.header("Authorization", "Bearer " + feignProperties.getToken());
      requestTemplate.header("Notion-Version", "2022-06-28");

      log.debug("Feign Request: {} {}", requestTemplate.method(), requestTemplate.url());
      log.debug("Headers: {}", requestTemplate.headers());

      if (requestTemplate.body() != null) {
        log.debug("Body: {}", new String(requestTemplate.body()));
      }
    };
  }

  @Bean
  public Logger.Level feignLoggerLevel() {
    return Logger.Level.FULL;
  }

}
