
package employee;
import java.util.Scanner;

public class Employee {
    Scanner input = new Scanner(System.in);
    
    String idNo, name;
    
    public void getInfo(){
        System.out.println("Enter employee Name: ");
        name = input.nextLine();
        System.out.println("Enter emplyee ID: ");
        idNo = input.nextLine();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PartTime PT = new PartTime();
        Regular REG = new Regular();
        
       int emp;
        
        System.out.println("Type 1 for Regular or 2 for PartTime");
        emp = input.nextInt();
        
        if(emp == 1){
            REG.getInfo();
            System.out.print(REG.idNo + " " + REG.name + " Regular " + "350/hr");
            System.out.print("\nDaily Salary = " + REG.DailySalary + "\r\n");
        }else if(emp == 2){
            PT.getInfo();
            System.out.print(PT.idNo + " " + PT.name + " PartTime " + "280/hr");
            System.out.print("\nDaily Salary = " + PT.DailySalary + " \r\n");
    }
}

static class PartTime extends Employee{
    int Rate = 280;
    int DailySalary = Rate * 8;
}
static class Regular extends Employee{
    int Rate = 350;
    int DailySalary = Rate * 8 + 500;
}
}