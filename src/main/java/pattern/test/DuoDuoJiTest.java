package pattern.test;

import java.util.Scanner;

/**
 * Created by yangwan on 2019/4/16
 */
public class DuoDuoJiTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Scanner scannerLine = new Scanner(System.in);
        String splits[] = scannerLine.nextLine().split(" ");
        int[] numbers = new int[50];
        for(int i=0; i < 50; i++){
            numbers[i] = Integer.parseInt(splits[i].trim());
        }
        for(int j=0; j < 50; j++){

        }
    }

}
