package com.mnemosine.mnemosine_service.controller;

import com.mnemosine.mnemosine_service.client.MnemosineClient;
import com.mnemosine.mnemosine_service.model.dto.BlocksDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/mnemosine")
@AllArgsConstructor
public class MnemosineController {

  private final MnemosineClient mnemosineClient;

  @GetMapping
  public ResponseEntity<BlocksDto> getPage() {
    BlocksDto blocksDto = mnemosineClient.getBlock();
    List<String> content;
    return ResponseEntity.ok(blocksDto);
  }

}
