package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/to-lower")
  public ToLowerResponseDto toLower(@RequestParam String input) {
    return new ToLowerResponseDto(input.toLowerCase());
  }

}
