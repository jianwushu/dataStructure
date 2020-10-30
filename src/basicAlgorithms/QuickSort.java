package basicAlgorithms;

import java.util.Arrays;

/**
 * @Author ilvyu.cn
 * @Date 2020/10/29 23:23
 * @Version 520.1314
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,9,2,48,7,8,1};
        method(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 快速排序
     * @param arr 待排序数组
     * @param left 左边界
     * @param right 有边界
     */
    public static void method(int[] arr,int left,int right){
        if(left<right){
            int temp = arr[left];
            int l = left;
            int r = right;
            while(l<r){
                while (l<r && temp <= arr[r]){
                    r--;
                }
                if(l<r){
                    arr[l++] = arr[r];
                }
                while (l<r && temp >= arr[l]){
                    l++;
                }
                if(l<r){
                    arr[r--] = arr[l];
                }
            }
            arr[l] = temp;
            method(arr,left,l-1);
            method(arr,l+1,right);
        }
    }
}
