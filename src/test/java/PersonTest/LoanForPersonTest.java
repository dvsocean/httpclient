package PersonTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest(classes = LoanForPersonTest.class)
public class LoanForPersonTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void initTest() throws Exception {
//    this.mockMvc.perform(get("/person/2")).andDo(print()).andExpect(status().isOk())
//        .andExpect(jsonPath("$.name").value("Emma"));

    this.mockMvc.perform(get("/person/2")).andDo(print());
  }

}
