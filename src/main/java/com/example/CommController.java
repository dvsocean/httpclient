package com.example;

import com.objects.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CommController {

  RestTemplate restTemplate;

  @GetMapping("/{id}")
    public String TestCase(@PathVariable("id") int id){
      RestTemplate restTemplate = new RestTemplate();
      Person p = restTemplate.getForObject("http://localhost:8000/person/" + id, Person.class);
      //System.out.println(quote);
      return p.getName();
    }
}
