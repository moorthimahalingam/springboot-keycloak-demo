package springboot.keycloak.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeyCloakController {

  @GetMapping("/healthcheck")
  public String healthCheck() {
    return "healthy";
  }

}
