package basicAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author ilvyu.cn
 * @Date 2020/10/29 22:03
 * @Version 520.1314
 */
public class LeverOrder {

    /**
     * 力扣102题  层次遍历
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        List<Integer> levelList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int index=-1;int last =0;int num=0;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            levelList.add(node.val);
            index++;
            if(node.left!=null){
                queue.offer(node.left);
                num++;
            }
            if(node.right!=null){
                queue.offer(node.right);
                num++;
            }
            if(index == last){
                ans.add(levelList);
                levelList = new ArrayList<>();
                last = num;
            }
        }
        return ans;
    }

    /**
     * 力扣107题  层次遍历-倒序
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder2(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        List<Integer> levelList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int index=-1;int last =0;int num=0;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            levelList.add(node.val);
            index++;
            if(node.left!=null){
                queue.offer(node.left);
                num++;
            }
            if(node.right!=null){
                queue.offer(node.right);
                num++;
            }
            if(index == last){
                ans.add(levelList);
                levelList = new ArrayList<>();
                last = num;
            }
        }
        return ans;
    }
}
