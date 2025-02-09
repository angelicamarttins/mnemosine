package com.mnemosine.mnemosine_service.config.client.properties;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class FeignProperties {

  @Value("${notion.auth.token}")
  private String token;

}
