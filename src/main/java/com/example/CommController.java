package com.example;

import com.objects.Person;
import org.junit.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CommController {

  @Bean
  private RestTemplate restTemplate() {
    return new RestTemplate();
  }

  @GetMapping("/{id}")
  public String TestCase(@PathVariable("id") int id){
    Person p = restTemplate().getForObject("http://localhost:5565/person/" + id, Person.class);
    return p.getName();
  }

//  @GetMapping("/{id}")
//  public String TestCase(@PathVariable("id") int id){
//    Person p = restTemplate().getForObject("/person/" + id, Person.class);
//    return p.getName();
//  }

  @GetMapping("/123")
  public void TestCase123(){
    System.out.println("Non service endpoint");
  }

}
