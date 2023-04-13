package abc;


import java.util.*;

public class Main {

public static void main(String[] args) {

// TODO Auto-generated method stub

weather[] w=new weather[5];

int i;

for(i=0;i<5;i++)

{

w[i]=new weather();

w[i].get();

}

float sumh=0,suml=0,sumr=0,sums=0;

for(i=0;i<5;i++)

{

sumh+=w[i].getHighTemp();

}

System.out.println("Average of high temprature is "+sumh/5);

for(i=0;i<5;i++)

{

suml+=w[i].getLowTemp();

}

System.out.println("Average of high temprature is "+suml/5);

for(i=0;i<5;i++)

{

sumr+=w[i].getAmountRain();

}

System.out.println("Average of high temprature is "+sumr/5);

for(i=0;i<5;i++)

{

sums+=w[i].getAmountSnow();

}

System.out.println("Average of high temprature is "+sums/5);

}

}

class weather{

float dayOfMonth,highTemp,lowTemp,amountRain,amountSnow;

Scanner s=new Scanner(System.in);

weather()

{

dayOfMonth=0;

highTemp=0;

lowTemp=0;

amountRain=0;

amountSnow=0;

}

public void get()

{

System.out.print("Enter day of month");

this.dayOfMonth=s.nextFloat();

System.out.print("Enter high temprature");

this.highTemp=s.nextFloat();

System.out.print("Enter low temprature");

this.lowTemp=s.nextFloat();

System.out.print("Enter amount of rain");

this.amountRain=s.nextFloat();

System.out.print("Enter amount of snow");

this.amountSnow=s.nextFloat();

System.out.println();

}

public float getHighTemp() {

return highTemp;

}

public float getLowTemp() {

return lowTemp;

}

public float getAmountRain() {

return amountRain;

}

public float getAmountSnow() {

return amountSnow;

}

}