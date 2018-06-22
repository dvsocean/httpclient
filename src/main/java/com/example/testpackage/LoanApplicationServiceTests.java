package com.example.testpackage;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties.StubsMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@AutoConfigureJsonTesters
@AutoConfigureStubRunner(stubsMode = StubsMode.LOCAL, ids = "com.example:contract-rest-service:+:stubs:8000")
@SpringBootTest(webEnvironment= WebEnvironment.MOCK)
public class LoanApplicationServiceTests {

//  @Autowired
//  MockMvc mockMvc;

//  @Test
//  public void shouldGiveMeLoan() throws Exception {
//      mockMvc.perform(get("/person/1").contentType("application/json")
//      .content("Jack")).andExpect(status().isOk());
//  }

//  @Test
//  public void shouldRejectLoan() throws Exception {
//    this.mockMvc.perform(get("/person/1")).andDo(print()).andExpect(status().isOk())
//        .andExpect(jsonPath("$.content").value("Jack"));
//  }

}
