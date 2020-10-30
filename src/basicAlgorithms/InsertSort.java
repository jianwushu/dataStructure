package basicAlgorithms;

import java.util.Arrays;

/**
 * @Author ilvyu.cn
 * @Date 2020/10/29 22:27
 * @Version 520.1314
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5,9,2,48,7,8,1};
        method(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void method(int[] arr){
        if(arr.length<2){
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int index = i-1;
            while(index >= 0 && val < arr[index]){
                arr[index+1] = arr[index];
                index--;
            }
            if(index!=i-1){
                arr[index+1] = val;
            }
        }
    }
}
