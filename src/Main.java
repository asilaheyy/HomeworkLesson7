import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //ДЗ 1
        //1.
        int savings = 29000;
        int total =0;
        int i=0;
        while(total<2_459_000){
            total = total+ total/100;
            total =total+savings;
            i++;
            System.out.println("Месяц " +i + " ,итого " +total+" руб.");
        } System.out.println(total);
        //2.
        for (int j=10; j>=0; j--){
            System.out.print(j+"\t");
        }System.out.println();
        int k=0;
        while(k<=10){
            System.out.print(k+"\t");k++;
        }System.out.println();
        // 3.
        double population = 12_000_000;
        double birth = (double)17/1000;
        double death = (double)8/1000;
        int years=0;
        while(years<10){
            population = population + (population * birth) + (population * death);
            years++;
            System.out.println("Год " + years + " ,численность населения: "+Math.round(population));
        }
        //ДЗ 2.
        //1+2+3
        int saving = 15000;
        int totalMoney = 0;
        int month =0;
        while (month < 108){ //9 лет = 108 мес.
            totalMoney = totalMoney + totalMoney / 70;
            totalMoney=totalMoney+saving;
            month++;
            if(month % 6 ==0 ) {
                System.out.println("Месяц " + month + " ,итого " + totalMoney + " руб.");
            }
        }
        // 4.
        int firstFridayOfMonth =1;
        int day = 0;
        while (day<31){
            day ++;
            if(day % 7 ==1){
                System.out.println("Сегодня пятница," + day+ " -е число. Необходимо подготовить отчет.");
            }
        }
        //ДЗ 3
        // 1.
        int kometaYear=1822;
        while (kometaYear <2122){
            kometaYear++;
            if(kometaYear % 79 == 0){
                System.out.println(kometaYear);
            }

        }
        // 2.
        int a =2;
        for(int b=1;b<=10;b++){
                System.out.println(a+"*"+b+"="+(a*b));

        }




    }
}