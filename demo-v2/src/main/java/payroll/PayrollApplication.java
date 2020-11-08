package payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PayrollApplication {

  public static void main(String... args) {
    SpringApplication.run(PayrollApplication.class, args);
  }
}

//in powershell --- use ---- curl http://localhost:8080/employees





//package payroll;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
///* this annotation tells Spring Boot to help out whenever possible
// * @SpringBootApplication is a meta-annotation that pulls in component scanning, autoconfiguration and property support
// * in essence, it will fire up a servlet container and serve up our service
// */
//@SpringBootApplication
//public class PayrollApplication {
//
//	public static void main(String... args) {
//		SpringApplication.run(PayrollApplication.class, args);
//	}
//}