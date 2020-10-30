package basicAlgorithms;

import java.util.Arrays;

/**
 * @Author ilvyu.cn
 * @Date 2020/10/30 10:41
 * @Version 520.1314
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[80000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*80000);
        }
        long pre = System.currentTimeMillis();
        method(arr);
        long suf = System.currentTimeMillis();
        System.out.println("所需时间:"+(suf-pre));
    }
    public static void method(int[] arr){
        if(arr.length<2){
            return;
        }
        for (int gap = arr.length/2; gap > 0 ; gap/=2) {
            for (int i = gap; i < arr.length; i++) {
                int val = arr[i];
                int index = i-gap;
                while(index>=0 && val<arr[index]){
                    arr[index+gap] = arr[index];
                    index-=gap;
                }
                if(index!=i-gap){
                    arr[index+gap] = val;
                }
            }
        }
    }
}
