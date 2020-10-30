package basicAlgorithms;

import java.util.Arrays;

/**
 * @Author ilvyu.cn
 * @Date 2020/10/29 23:00
 * @Version 520.1314
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5,9,2,48,7,8,1};
        method(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void method(int[] arr){
        if(arr.length<2){
            return;
        }
        for (int i = 0; i < arr.length-1; i++) {
            int val = arr[i];
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if(val>arr[j]){
                    val = arr[j];
                    index = j;
                }
            }
            if(index!=i){
                arr[index] = arr[i];
                arr[i] = val;
            }
        }

    }
}
