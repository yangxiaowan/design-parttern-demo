package pattern.test;

import java.util.Scanner;
import java.util.concurrent.*;
/**
 * Created by yangwan on 2019/4/23
 */
public class GcdLcmTest {


    public static int getGcd(int a, int b){
        if(a < b){
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int gcd = 1;
        int temp;
        do{
            temp = a % b;
            if(temp == 0){
                gcd = b;
            }
            a = b;
            b = temp;
        }while(temp != 0);
        return gcd;
    }

    public static int getLcm(int a, int b){
        return a * b / (getGcd(a, b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer one = scanner.nextInt();
        Integer two = scanner.nextInt();
        System.out.println("the Gcd :" + getGcd(one, two));
        System.out.println("the Lcm :" + getLcm(one, two));
    }

}
