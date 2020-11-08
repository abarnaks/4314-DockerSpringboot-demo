package payroll;

class EmployeeNotFoundException extends RuntimeException {

  EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}

/*
 * package payroll;
 * 
 * class EmployeeNotFoundException extends RuntimeException {
 * 
 * EmployeeNotFoundException(Long id) { super("Could not find employee " + id);
 * } }
 */