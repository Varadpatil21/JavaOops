package abc;

import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Programmer o1=new Programmer();
        Teamlead o2=new Teamlead();
        Assprojmanager o3=new Assprojmanager();
        Projmanager o4=new  Projmanager();

        int y,ch;
        do {
            System.out.println("------MENU------\n1. Programmer\n2. Team Lead\n3. Assistant Manager\n4. Project Manager\n");
            System.out.print("Enter your choice:");
            ch=s.nextInt();
            switch (ch)
            {
                case 1:
                    o1.getdata();
                    o1.calculate();
                    o1.display();
                    o1.displaysal();
                    break;
                case 2:
                    o2.getdata();
                    o2.calculate();
                    o2.display();
                    o2.displaysal();
                    break;
                case 3:
                    o3.getdata();
                    o3.calculate();
                    o3.display();
                    o3.displaysal();
                    break;
                case 4:
                    o4.getdata();
                    o4.calculate();
                    o4.display();
                    o4.displaysal();
                    break;

            }
            System.out.print("Do you want to continue:");
            y=s.nextInt();
        }while(y==1);

    }
}

class Employee
{
    Scanner s=new Scanner(System.in);
    int empid;
    long mobile;
    String name,address,mailid;
    void getdata()
    {
        System.out.print("Enter Employee ID:");
        empid=s.nextInt();
        System.out.print("Enter Employee Name:");
        name=s.next();
        System.out.print("Enter Mobile No.:");
        mobile=s.nextLong();
        System.out.print("Enter Mail ID:");
        mailid=s.next();
        System.out.print("Enter Address:");
        address=s.next();
    }

    void display()
    {
        System.out.println("------Salary Slip-----");
        System.out.println("Employee ID: "+empid);
        System.out.println("Name: "+name);
        System.out.println("Mobile No.: "+mobile);
        System.out.println("Mail ID: "+mailid);
        System.out.println("Address: "+address);


    }
}

class Programmer extends Employee
{
    Scanner s=new Scanner(System.in);
    double bp,da,hra,pf,cf,net,gross;
    void calculate()
    {
        System.out.print("Enter basic pay:");
        bp=s.nextDouble();
        da=bp*97/100;
        hra=bp*10/100;
        pf=bp*12/100;
        cf=bp*0.1/100;
        gross=bp+da+hra+pf;
        net=gross-pf-cf;
    }
    void displaysal()
    {
        System.out.println("Designation: Programmer");
        System.out.println("Gross Salary: "+gross);
        System.out.println("Net salary:"+net);
    }




}

class Teamlead extends Employee
{
    Scanner s=new Scanner(System.in);
    double bp,da,hra,pf,cf,net,gross;
    void calculate()
    {
        System.out.print("Enter basic pay:");
        bp=s.nextDouble();
        da=bp*97/100;
        hra=bp*10/100;
        pf=bp*12/100;
        cf=bp*0.1/100;
        gross=bp+da+hra+pf;
        net=gross-pf-cf;
    }
    void displaysal()
    {
        System.out.println("Designation: PTeam Lead");
        System.out.println("Gross Salary: "+gross);
        System.out.println("Net salary:"+net);
    }




}

class Assprojmanager extends Employee
{
    Scanner s=new Scanner(System.in);
    double bp,da,hra,pf,cf,net,gross;
    void calculate()
    {
        System.out.print("Enter basic pay:");
        bp=s.nextDouble();
        da=bp*97/100;
        hra=bp*10/100;
        pf=bp*12/100;
        cf=bp*0.1/100;
        gross=bp+da+hra+pf;
        net=gross-pf-cf;
    }
    void displaysal()
    {
        System.out.println("Designation: Assistant Program Manager");
        System.out.println("Gross Salary: "+gross);
        System.out.println("Net salary:"+net);
    }




}

class Projmanager extends Employee
{
    Scanner s=new Scanner(System.in);
    double bp,da,hra,pf,cf,net,gross;
    void calculate()
    {
        System.out.print("Enter basic pay:");
        bp=s.nextDouble();
        da=bp*97/100;
        hra=bp*10/100;
        pf=bp*12/100;
        cf=bp*0.1/100;
        gross=bp+da+hra+pf;
        net=gross-pf-cf;
    }
    void displaysal()
    {
        System.out.println("Designation: Project Manager");
        System.out.println("Gross Salary: "+gross);
        System.out.println("Net salary:"+net);
    }




}