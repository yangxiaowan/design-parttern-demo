package pattern.sort;

/**
 * Created by yangwan on 2019/4/10
 */
public class ChargeChangeTest {

    public static void main(String[] args) {
        int[] coins = {1, 2 ,5};
        int amount = 11;
        int dynamicArr[] = new int[15];
        dynamicArr[0] = 0;
        for(int k=1; k < dynamicArr.length; k++){
            dynamicArr[k] = Integer.MAX_VALUE;
        }
        for(int i=1; i <= amount; i++){
            for(int j=0; j < coins.length; j ++){
                if(i > coins[j]){
                    dynamicArr[i] = dynamicArr[i-coins[j]] + dynamicArr[coins[j]];
                }else{
                    if(j == coins[i]){
                        dynamicArr[i] = 1;
                    }
                }
            }
        }

    }

}
