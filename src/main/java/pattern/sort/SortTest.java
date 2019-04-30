package pattern.sort;

/**
 * Created by yangwan on 2019/4/10
 */
public class SortTest {

    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr){
        int len = arr.length;
        for(int i=0; i < len-1; i++){ // len-1次循环
            for(int j=0; j < len-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 选择排序
     * @param arr
     */
    public static void selectSort(int[] arr){
        int len = arr.length;
        for(int i=0; i < len-1; i++){
            int smallIndex = i;
            for(int j=i; j < len; j++){
                if(arr[j] < arr[smallIndex]){
                    smallIndex = j;
                }
            }
            int temp;
            if(smallIndex != i){
                temp = arr[i];
                arr[i] = arr[smallIndex];
                arr[smallIndex] = temp;
            }
        }
    }

    /**
     * 插入排序
     * @param arr
     */
    public static void insertSort(int[] arr){
        int len = arr.length;
        for(int i=1; i <= len-1; i++){
            int j = i;
            int temp = arr[i];
            while(j > 0 && temp < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            if(i != j){
                arr[j] = temp;
            }
        }
    }

    /**
     * 希尔排序
     * @param arr
     */
    public static void shellSorted(int[] arr){
        for(int grap = arr.length/2; grap > 0; grap /= 2){
            for(int i = grap; i < arr.length; i++){
                int j = i;
                while(j-grap >= 0 && arr[j-grap] > arr[j]){
                    int temp = arr[j-grap];
                    arr[j-grap] = arr[j];
                    arr[j] = temp;
                    j -= grap;
                }
            }
        }
    }

    /**
     * 合并数组
     * @param arr
     * @param start
     * @param mid
     * @param end
     * @param temp
     */
    public static void merge(int[] arr, int start, int mid, int end, int[] temp){
        int tempIndex = 0;
        int i = start;
        int j = mid + 1;
        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                temp[tempIndex++] = arr[i++];
            }else{
                temp[tempIndex++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[tempIndex++] = arr[i++];
        }
        while(j<=end){
            temp[tempIndex++] = arr[j++];
        }
        tempIndex = 0;
        while(start <= end){
            arr[start ++] = temp[tempIndex ++];
        }
    }


    /**
     * 合并排序
     * @param arr
     */
    public static void mergeSorted(int[] arr){
        
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,32,4,1,43,11,6,72,24,5};
        shellSorted(arr);
        for(int i=0; i < arr.length; i++){
            System.out.println("  " + arr[i]);
        }
    }

}
