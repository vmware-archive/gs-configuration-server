package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  private static final String template = "Hello, %s!";

  @RequestMapping("/")
  public String home() {
    return String.format(template, "World");
  }

}
