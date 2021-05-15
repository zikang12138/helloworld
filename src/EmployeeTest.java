public class EmployeeTest {
    public static void main(String[] args){
        Employee empOne=new Employee("yu");
        Employee empTwo=new Employee("zi");

        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.emSalary(100.57);
        empOne.printEmployee();

        empTwo.empAge(27);
        empTwo.empDesignation("菜鸡");
        empTwo.emSalary(50.25);
        empTwo.printEmployee();
    }
}
