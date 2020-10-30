package basicAlgorithms;

import java.util.Arrays;

/**
 * @Author ilvyu.cn
 * @Date 2020/10/29 23:42
 * @Version 520.1314
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,9,2,48,7,8,1};
        method(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 分治
     * @param arr 待排序数组
     * @param left 左边界
     * @param right 有边界
     */
    public static void method(int[] arr,int left,int right){
        if(left<right){
            int mid = (right-left)/2 + left;
            method(arr,left,mid);
            method(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right-left+1];
        int index = 0;
        int l = left;
        int r = mid+1;
        while (l<=mid && r<=right){
            if(arr[l]<=arr[r]){
                temp[index++] = arr[l++];
            }else{
                temp[index++] = arr[r++];
            }
        }

        while(l<=mid){
            temp[index++] = arr[l++];
        }

        while(r<=right){
            temp[index++] = arr[r++];
        }

        index = 0;
        while(index<temp.length){
            arr[left++] = temp[index++];
        }
    }


}
