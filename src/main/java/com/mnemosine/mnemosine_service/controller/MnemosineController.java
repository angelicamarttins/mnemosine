package com.mnemosine.mnemosine_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mnemosine")
public class MnemosineController {

  @GetMapping
  public ResponseEntity<String> getPage() {
    return ResponseEntity.ok("Hello, Mnemosine");
  }

}
