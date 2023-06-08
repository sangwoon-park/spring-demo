package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
class DemoControllerTests {

  @Autowired
  MockMvc mockMvc;

  @Test
  void testToLowerEndpoint() throws Exception {
    mockMvc.perform(
        MockMvcRequestBuilders.get("/to-lower")
            .queryParam("input", "abCDe")
    )
        .andExpect(
            MockMvcResultMatchers.jsonPath("$.result")
                .value("abcde")
        );
  }

}
