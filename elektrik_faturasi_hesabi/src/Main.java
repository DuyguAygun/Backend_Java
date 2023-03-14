//elektrik>100->%5 vergi
//elektrik>300->%10 vergi
//elektrik>500->%15 vergi

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner elektrik=new Scanner(System.in);

        System.out.println("lutfen harcanilan elektrigi kWh cinsinden giriniz:");
        float miktar=elektrik.nextFloat();

        if(miktar>=100 &&miktar<300)
        {
            miktar=miktar+miktar*5/100;
        }
        else if(miktar>=300 && miktar<500)
        {
            miktar=miktar+miktar*10/100;
        }
        else if(miktar>=500)
        {
            miktar=miktar+miktar*15/100;
        }
        System.out.println("Odenmesi gereken miktar:"+miktar);
    }
}