package basicAlgorithms;

/**
 * @Author ilvyu.cn
 * @Date 2020/10/29 20:26
 * @Version 520.1314
 */
public class BinarySearch {
    /**
     * 二分查找-递归
     * @param arr 传入的数组
     * @param target 待查找的元素
     * @param left 左边界
     * @param right 右边界
     * @return
     */
    public static int method1(int[] arr,int target,int left,int right){
        if(left>right) {
            return -1;
        }
        int mid = (right-left)/2 + left;
        if(target<arr[mid]){
            return method1(arr,target,left,mid-1);
        }else if(target>arr[mid]){
            return method1(arr,target,mid+1,right);
        }else{
            return mid;
        }
    }
}
