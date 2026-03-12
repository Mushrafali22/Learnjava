package Practice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class topKelement {
    /*find three largest element */
    public static PriorityQueue<Integer> fte(int[] arr,int k){
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int num : arr){
            minheap.add(num);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        return minheap;
    }
    /*find three smallest element */
    public static PriorityQueue<Integer> fse(int[] arr1, int k){
        PriorityQueue<Integer> minheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : arr1){
            minheap.add(num);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        return minheap;
    }
    /*K most fraquent element */
    public static PriorityQueue<Integer> mfe(int[] arr2,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr2){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Integer> minheap=new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for(int nums : map.keySet()){
            minheap.add(nums);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        return minheap;
    }
    /*Kth Largest element */
    public static Integer kle(int[] arr3,int k){
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int num : arr3){
            minheap.add(num);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        return minheap.peek();
    }
    public static void main(String[] args) {
        int[] arr={3,1,5,12,2,11};
        int[] arr1={3,1,5,12,2,11};
        int[] arr2={1,1,1,2,2,3,4};
        int[] arr3={3,2,1,5,6,4};
        System.out.println(fte(arr, 3));
        System.out.println(fse(arr1, 3));
        System.out.println(mfe(arr2, 2));
        System.out.println(kle(arr3, 2));
    }
}
