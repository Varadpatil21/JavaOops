


import java.util.*;

public class ass21{

    public static void main(String[] args) {

// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);


        weather[] w=new weather[5];

        int i;

        for(i=0;i<5;i++)

        {
            w[i]=new weather();


        }
        for(i=0;i<5;i++)

        {
            System.out.println("Enter data for day"+(i+1));

            System.out.print("Enter high temprature");

            float h=s.nextFloat();

            System.out.print("Enter low temprature");

            float l=s.nextFloat();

            System.out.print("Enter amount of rain");

            float ar=s.nextFloat();

            System.out.print("Enter amount of snow");

            float as=s.nextFloat();

            System.out.println();



            w[i]=new weather(h,l,ar,as);


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


        highTemp=0;

        lowTemp=0;

        amountRain=0;

        amountSnow=0;

    }
    weather(float h,float l,float ar,float as)

    {


        highTemp=h;

        lowTemp=l;

        amountRain=ar;

        amountSnow=as;

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
