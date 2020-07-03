package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public interface TaxPayable {
    public int calculateTax(Employee employee);
}
