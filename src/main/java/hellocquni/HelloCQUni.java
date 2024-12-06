package hellocquni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main application class for Hello CQUni
 *
 * @author MD.SADIKUR RAHMAN
 */
@SpringBootApplication
public class HelloCQUni {

    public static void main(String[] args) {
        SpringApplication.run(HelloCQUni.class, args);
    }
}

@RestController
class HelloController {

    @GetMapping("/")
    public String hello() {
        return "<h1>Hello CQUni</h1>" +
               "<p>Student ID: 12248860</p>" +
               "<p>Full Name: Md Sadikur Rahman</p>" +
               "<p>Campus: Sydney</p>";
    }
}
