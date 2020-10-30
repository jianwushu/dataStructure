package basicAlgorithms;

import java.util.Arrays;

/**
 * @Author ilvyu.cn
 * @Date 2020/10/29 22:19
 * @Version 520.1314
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,9,2,48,7,8,1};
        method(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 冒泡排序-相邻元素依次比较
     * @param arr
     */
    public static void method(int[] arr){
        if(arr.length < 2){
            return;
        }
        boolean isSorted = true;
        for (int i = 0; i < arr.length; i++) {
            isSorted = true;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            if(isSorted){
                return;
            }
        }
    }
}
