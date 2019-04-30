package pattern.test;

/**
 * Created by yangwan on 2019/4/18
 */
public class MinMaxStringTest {


    public static void main(String[] args) {

        String s = "welcometojava";
        int k = 3;
        String smallest = "";
        String largest = "";
        for(int i=k-1; i < s.length(); i++){
            if(i == k-1){
                smallest = s.substring(0, k);
                largest = smallest;
            }else{
                String tempStr = s.substring(i-k+1, i+1);
                if(tempStr.compareTo(largest) > 0){
                    largest = tempStr;
                }else if(tempStr.compareTo(smallest) < 0){
                    smallest = tempStr;
                }
            }
        }
        System.out.println("smallest: " + smallest + "  | " + largest);
    }

}
