package com.example;

import com.objects.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
    Person p = restTemplate().getForObject("http://localhost:8000/person/" + id, Person.class);
      return p.getName();
    }
}
