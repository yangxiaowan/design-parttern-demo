package pattern.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by yangwan on 2019/4/10
 */
public class Test {


    private static void inOrderVisited(List list, int n, boolean flag){
        if(n > 0){
            inOrderVisited(list, n-1, true);
            if(flag){
                list.add("down");
            }else{
                list.add("up");
            }
            inOrderVisited(list, n-1, false);
        }
    }

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        inOrderVisited(list, 2 , true);
        String[] strArray = list.toArray(new String[list.size()]);
        System.out.println(strArray.toString());
        String[] array = list.toArray(new String[list.size()]);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
