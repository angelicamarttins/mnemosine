package com.mnemosine.mnemosine_service.client;

import com.mnemosine.mnemosine_service.config.client.config.FeignConfig;
import com.mnemosine.mnemosine_service.model.dto.BlocksDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "${notion.url.block.children}", name = "block", configuration = FeignConfig.class)
public interface MnemosineClient {

  @GetMapping
  BlocksDto getBlock();

}
