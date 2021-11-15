package Baitap2_1;

public class Program {
    public static void main(String[] args) {
        Employee employeeA = new Employee("Nam", 20);
        Employee employeeB = new Employee("Mai", 30);
        Employee employeeC = new Employee("Minh", 102);

        // Calculate Wage
        int wage1 =employeeA.WageOfEmployee();
        System.out.println("Result Wage of EmployeeA: " + wage1 + "$");

        int wage2 = employeeB.WageOfEmployee();
        System.out.println("Result Wage of EmployeeB: " + wage2 + "$");

        int wage3 = employeeC.WageOfEmployee();
        System.out.println("Result Wage of EmployeeC: " + wage3 + "$");

        // Calculate Tax
        double tax1 = employeeA.TaxOfEmployee();
        System.out.println("Result Tax of EmployeeA: " + tax1 + "$");

        double tax2 = employeeB.TaxOfEmployee();
        System.out.println("Result Tax of EmployeeB: " + tax2 + "$");

        double tax3 = employeeC.TaxOfEmployee();
        System.out.println("Result Tax of EmployeeC: " + tax3 + "$");

        // Calculate Netpay
        double netpay1 = employeeA.NetPayOfEmployee();
        System.out.println("Result Netpay of EmployeeA: " + netpay1 + "$");

        double netpay2 = employeeB.NetPayOfEmployee();
        System.out.println("Result Netpay of EmployeeB: " + netpay2 + "$");

        double netpay3 = employeeC.NetPayOfEmployee();
        System.out.println("Result Netpay of EmployeeC: " + netpay3 + "$");

        // Calculate RaiseWage
        int raiseWage1 = employeeA.RaisedWageOfEmployee();
        System.out.println("Result RaiseWage of EmployeeA: " + raiseWage1 + "$");

        int raiseWage2 = employeeB.RaisedWageOfEmployee();
        System.out.println("Result RaiseWage of EmployeeB: " + raiseWage2 + "$");

        int raiseWage3 = employeeC.RaisedWageOfEmployee();
        System.out.println("Result RaiseWage of EmployeeC: " + raiseWage3 + "$");

        // Calculate CheckOverTime
        boolean checkOverTime1 = employeeA.CheckOverTimeOfEmployee();
        System.out.println(checkOverTime1 == true ? "True" : "False");

        boolean checkOverTime2 = employeeB.CheckOverTimeOfEmployee();
        System.out.println(checkOverTime2 == true ? "True" : "False");

        boolean checkOverTime3 = employeeC.CheckOverTimeOfEmployee();
        System.out.println(checkOverTime3 == true ? "True" : "False");


    }
}
