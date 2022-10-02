package com.absoft.unit8;

public class Main {
    public static void main(String[] args) {
//    Employee employee1 = new Employee("Ivan", "Ivanov",
//                                  25, "AQA", 25000, POSITION.JUNIOR);
        EmployeeNamePrinter namePrinter = new EmployeeNamePrinter();
//    namePrinter.print( employee1 );
//
        EmployeeSalaryPrinter salaryPrinter = new EmployeeSalaryPrinter();
//    salaryPrinter.print( employee1 );
//
//    Employee employee2 = new Employee("", "", 16,
//                                "AQA", -50000, POSITION.MIDDLE);
//    namePrinter.print( employee2 );
//    salaryPrinter.print( employee2 );
//
//    Employee employee3 = new Employee("Gleb", "Popov", 25, "AQA", POSITION.SENIOR);
//    namePrinter.print( employee3 );
//    salaryPrinter.print( employee3 );
//

        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Sasha", "Petrov", 30, "AQA", POSITION.JUNIOR);
        employees[1] = new Employee("Igor", "Astakhov", 45, "QML/JS Develop", POSITION.SENIOR);

        for ( Employee employee : employees ) {
            namePrinter.print( employee );
            salaryPrinter.print( employee );
        }
    }

}