package abc;

import java.util.*;

public class Main {

public static void main(String[] args) {

int ch;

float num1=0,num2=0,answer;

complex_op cal= new complex_op();

Scanner input =new Scanner(System.in);

System.out.println("Enter the first Number");

num1=input.nextFloat();

num2=input.nextFloat();

complex_op object1=new complex_op(num1,num2);

System.out.println("eNTER THE sECOND NUMBER");

num1=input.nextFloat();

num2=input.nextFloat();

complex_op object2=new complex_op(num1,num2);

do {

System.out.println("1.Addition\n2.Subtration\n3.Multiplication\n4.Division\n5.Exit");

System.out.println("Enter your choice");

ch=input.nextInt();

switch(ch) {

case 1 : cal.addition(object1,object2);

break;

case 2 : cal.subtraction(object1,object2);

break;

case 3 : cal.multiplication(object1,object2);

break;

case 4 : cal.division(object1,object2);

break;

}

}while(ch!=5);

}

}

class complex_op{

float real,imag;

complex_op(){

real=0;

imag=0;

}

complex_op(float comp1,float comp2){

real=comp1;

imag=comp2;

}

public void addition(complex_op C1,complex_op C2) {

float real,imag;

real=(C1.real +C2.real);

imag=(C1.imag + C2.imag);

System.out.println("Answer is :("+real+") + ("+imag+")i");

}

public void subtraction(complex_op C1,complex_op C2) {

float real,imag;

real=(C1.real -C2.real);

imag=(C1.imag - C2.imag);

System.out.println("Answer is :("+real+") + ("+imag+")i");

}

public void multiplication(complex_op C1,complex_op C2) {

float real,imag;

real=(C1.real *C2.real -C1.imag*C2.imag);

imag=(C1.real*C2.imag + C1.imag*C2.real);

System.out.println("Answer is :("+real+") + ("+imag+")i");

}

public void division(complex_op C1,complex_op C2) {

float real,imag;

real=(C1.real *C2.real)+(C1.imag*C2.imag)/(C2.real*C2.real)+(C2.imag*C2.imag);

imag=(C1.imag*C2.real) -( C1.real*C2.imag)/(C2.real*C2.real)+(C2.imag*C2.imag);

System.out.println("Answer is :("+real+") + ("+imag+")i");

}

}