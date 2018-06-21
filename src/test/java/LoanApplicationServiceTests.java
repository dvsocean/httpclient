import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import hello.PersonService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;


//@AutoConfigureMockMvc
//@AutoConfigureJsonTesters
//@AutoConfigureStubRunner(repositoryRoot = "classpath:m2/repository/", ids = "com.example:contract-rest-service:+:stubs:8000")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= WebEnvironment.MOCK)
public class LoanApplicationServiceTests {

  @Test
  public void shouldGiveMeLoan() throws Exception {

  }

  @Test
  public void shouldRejectLoan(){

  }

}
