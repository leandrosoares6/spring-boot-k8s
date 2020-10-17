package br.com.leandro.springbootk8s;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRESTController {
  final String hostname = System.getenv().getOrDefault("HOSTNAME", "unknown");

  @RequestMapping("/hello")
  public String sayHello() {
    return "Hello from Spring Boot!" + new java.util.Date() + " on " + hostname + "\n";
  }
}