package LeetCode.Y2020.Oct;

import java.util.*;

public class Oct28 {
   /*
    给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
    如果每个数的出现次数都是独一无二的，就返回 true；否则返回false。 
    示例1：
    输入：arr=[1,2,2,1,1,3]
    输出：true
    解释：在该数组中，1出现了3次，2出现了2次，3只出现了1次。没有两个数的出现次数相同。
    示例2：
    输入：arr=[1,2]
    输出：false
    示例3：
    输入：arr=[-3,0,1,-3,1,1,1,-3,10,0]
    输出：true
    提示：
    1<=arr.length <=1000
    -1000<=arr[i]<=1000
    */
   public static void main(String[] args) {
       long startTime=System.currentTimeMillis(); //获取开始时间
        int[] arr={-3,0,1,-3,1,1,1,-3,10,0};
       //show01(arr);
       //show02(arr);
       show03(arr);

       long endTime=System.currentTimeMillis(); //获取结束时间
       System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
   }

    private static boolean show03(int[] arr) {
        Map<Integer, Integer> mp1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mp1.put(arr[i], mp1.getOrDefault(arr[i], 0) + 1);
        }
        return mp1.size() == new HashSet<>(mp1.values()).size();
    }
    //不用getOrDefault方法的show03
    private static boolean show02(int[] arr) {
       Map<Integer,Integer> mp=new HashMap<>();
        for (int i : arr) {
            if (mp.containsKey(i)){
                int j=mp.get(i)+1;
                mp.put(i,j);
            }else{
                mp.put(i,0);
            }
        }
        /*for (int key:mp.keySet()){
            System.out.println(key+"="+mp.get(key));
        }*/
        return mp.size() == new HashSet<>(mp.values()).size();
    }
    //速度最快，先排序，再用set集合的方式
    private static boolean show01(int[] arr) {
            Set<Integer> set = new HashSet<>();
            Arrays.sort(arr);
            int count = 1;
            for(int i = 1;i < arr.length;i ++){
                if(arr[i] != arr[i - 1]){
                    if(!set.add(count)){
                        return false;
                    }
                    count = 1;
                }else{
                    count ++;
                }
            }
            if(!set.add(count)){
                return false;
            }
            return true;
        }
}
