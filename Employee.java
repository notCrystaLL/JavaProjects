
package employee;
import java.util.Scanner;

public class Employee {
    Scanner input = new Scanner(System.in);
    
    String idNo, name;
    
    public void getInfo(){
        System.out.println("Enter employee Name: ");
        name = input.next();
        System.out.println("Enter emplyee ID: ");
        idNo = input.next();
    }

    public static void main(String[] args) {
        PartTime PartTime = new PartTime();
        Regular Regular = new Regular();

        Regular.getInfo();
        System.out.print(Regular.idNo + " " + Regular.name + " Regular " + "350/hr");
        System.out.print("\nDaily Salary = " + Regular.DailySalary + "\r\n");

        PartTime.getInfo();
        System.out.print(PartTime.idNo + " " + PartTime.name + " PartTime " + "280/hr");
        System.out.print("\nDaily Salary = " + PartTime.DailySalary + " \r\n");
    }
}

class PartTime extends Employee{
    int Rate = 280;
    int DailySalary = Rate * 8;
}
class Regular extends Employee{
    int Rate = 350;
    int DailySalary = Rate * 8 + 500;
}
}