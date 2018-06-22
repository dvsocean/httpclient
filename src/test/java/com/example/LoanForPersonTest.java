package com.example;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties.StubsMode;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//@AutoConfigureJsonTesters
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = "com.example:contract-rest-service:+:stubs:5565", stubsMode = StubsMode.LOCAL)
public class LoanForPersonTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void initTest() throws Exception {
    mockMvc.perform(get("/123")).andDo(print()).andExpect(status().isOk());
//        .andExpect(jsonPath("$.name.*").value("JackieBoy"));
  }

  @Test
  public void initTestTwo() throws Exception {
    mockMvc.perform(get("/1")).andDo(print()).andExpect(status().isOk());
//        .andExpect(jsonPath("$.name").value("JackieBoy"));
  }
}
