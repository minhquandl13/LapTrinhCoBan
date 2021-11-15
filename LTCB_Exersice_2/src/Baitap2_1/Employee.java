package Baitap2_1;

public class Employee {
    String name;
    int hours;

    /**
     * @param name
     * @param hours
     */
    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    /**
     * Determines the wage of an employee
     * from the number of hours of work
     *
     * @return hours * 12
     * Example new Employee("Mai", 1).WageOfEmployee() : 12
     */
    // Exercise 2.1
    public int WageOfEmployee() {
        return this.hours * 12;
    }

    /**
     * Determines the tax of an employee from the wage
     *
     * @return hours * 12 * 0.15
     * Example new Employee("Mai", 1).TaxOfEmployee() : 1.8
     */
    public double TaxOfEmployee() {
        return this.WageOfEmployee() * 0.15;
    }

    /**
     * Determines the netpay of an employee
     *
     * @return hours * 12 - hours * 12 * 0.15
     * Example new Employee("Mai", 1).NetPayOfEmployee() : 10.2
     */
    public double NetPayOfEmployee() {
        return this.WageOfEmployee() - this.TaxOfEmployee();
    }

    /**
     * Raise the wage of employee with 14$
     *
     * @return hours * 12 + 14
     * Example new Employee("Mai", 1).RaisedWageOfEmployee() : 30
     */
    public int RaisedWageOfEmployee() {
        return this.WageOfEmployee() + 14;
    }

    /**
     * Determines whether the number of hours of work
     * exceeds 100
     *
     * @return hours > 100
     * Example new Employee("Mai", 1).CheckOverTimeOfEmployee() : false
     */
    public boolean CheckOverTimeOfEmployee() {
        return this.hours > 100;
    }

    /**
     * Consumes the gross pay and produces the amount of tax owed
     *
     * @return grossPay * taxRate
     * Example new Employee("Mai", 30).TaxWithRate() : 54.0
     */
    // Exercise 2.1.1
    public double TaxWithRate() {
        double grossPay = this.WageOfEmployee();
        if (grossPay <= 240)
            return 0.0;

        if (grossPay <= 480)
            return grossPay * 0.15;

        return grossPay * 0.28;
    }

    /**
     * determines the net pay of an employee from the number of hours worked
     *
     * @return WageOfEmployee - TaxWithRate
     * Example new Employee("Mai", 30).NetPayWithRate() : 306.0
     */
    public double NetPayWithRate() {
        return this.WageOfEmployee() - this.TaxWithRate();
    }
}
