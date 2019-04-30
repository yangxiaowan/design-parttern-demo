package pattern.test;

import java.util.Scanner;
import java.util.concurrent.Executors;

/**
 * Created by yangwan on 2019/4/16
 */
public class FriendListTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userCount = scanner.nextInt();
        int userId = scanner.nextInt();
        int[][] arr = new int[100][100];
        for(int m=0; m < 100; m++){
            for(int n=0; n < 100; n++){
                arr[m][n] = -1;
            }
        }
        for(int i = 0; i < userCount; i++){
            Scanner friendScanner = new Scanner(System.in);
            String[] splits = friendScanner.nextLine().split(" ");
            for(int k =0; k < splits.length; k++){
                arr[i][k] = Integer.parseInt(splits[k]);
            }
        }
        int commonFriends[] = new int[100];
        for(int t=0; t < 100; t ++){
            commonFriends[t] = 0;
        }
        for(int x=0; x < 100 && arr[userId][x] != -1; x++){
            int temp = arr[userId][x];
            for(int y=0; y < 100 && arr[temp][y] != -1; y++){
                commonFriends[arr[temp][y]] ++;
            }
        }
        int resultFriend = -1;
        int count = 0;
        for(int w=0; w < 100; w++){
            if(commonFriends[w] > count && w != userId){
                count = commonFriends[w];
                resultFriend = w;
            }
        }
        System.out.println(resultFriend);

    }

}
