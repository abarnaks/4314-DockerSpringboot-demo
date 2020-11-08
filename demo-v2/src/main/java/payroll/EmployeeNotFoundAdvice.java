package payroll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class EmployeeNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(EmployeeNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String employeeNotFoundHandler(EmployeeNotFoundException ex) {
    return ex.getMessage();
  }
}

/*
 * package payroll;
 * 
 * import org.springframework.http.HttpStatus; import
 * org.springframework.web.bind.annotation.ControllerAdvice; import
 * org.springframework.web.bind.annotation.ExceptionHandler; import
 * org.springframework.web.bind.annotation.ResponseBody; import
 * org.springframework.web.bind.annotation.ResponseStatus;
 * 
 * 
 * When EmployeeNotFoundException is thrown, this Spring MVC configuration is
 * used to render an HTTP 404
 * 
 * @ControllerAdvice class EmployeeNotFoundAdvice {
 * 
 * @ResponseBody // signals that this advice is rendered straight into the
 * response body
 * 
 * @ExceptionHandler(EmployeeNotFoundException.class) //configures the advice to
 * only respond if an EmployeeNotFoundException is thrown
 * 
 * @ResponseStatus(HttpStatus.NOT_FOUND) // response status says to issue an
 * HTTP 404 String employeeNotFoundHandler(EmployeeNotFoundException ex) {
 * return ex.getMessage(); } }
 */