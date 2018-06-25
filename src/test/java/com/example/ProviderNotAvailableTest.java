package com.example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import au.com.dius.pact.model.MockProviderConfig;
import au.com.dius.pact.consumer.Pact;
import au.com.dius.pact.consumer.PactProviderRuleMk2;
import au.com.dius.pact.consumer.PactVerification;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.model.RequestResponsePact;
import com.objects.Person;
import com.testServices.PersonService;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;

public class ProviderNotAvailableTest {

  @Rule
  public PactProviderRuleMk2 mockProvider
      = new PactProviderRuleMk2("person", "localhost", 8000, this);

  @Pact(provider="person", consumer="person_consumer")
  public RequestResponsePact createResponsePact(PactDslWithProvider builder) {
    return builder
        .given("a person exists")
        .uponReceiving("a request for a specific")
        .path("/person/1")
        .method("GET")
        .willRespondWith()
        .status(200)
        .body("{\"id\":1,\"name\":\"Jak\",\"surname\":\"Sparrow\"}")
        .toPact();
  }

  @PactVerification("person")
  @Test
  public void get_person() throws IOException {
    PersonService psc = new PersonService();
    Person response = psc.findPerson("http://localhost:8000", 1);
    assertThat(response.getName(), is("Jak"));
    System.out.println("Tested for return name--> " + response.getName());
  }

}
