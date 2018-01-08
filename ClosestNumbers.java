package HackerRank;

import java.lang.*;
import java.util.*;
import java.util.Map.Entry;

import java.math.*;
import java.util.regex.*;

/**
 * Created by Roshni Velluva Puthanidam on 02/08/16.
 */
public class ClosestNumbers {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named matrixZero. */
        Scanner in = new Scanner(System.in);
        HashMap<List<Integer>, Integer> hm = new HashMap<List<Integer>, Integer>();
        int n = in.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> ls_new = new ArrayList<Integer>();
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        try {
            for (int k = 0; k < n - 1; k++) {
                List<Integer> ls = new ArrayList<>();
                int abs = Math.abs(arr[k] - arr[k + 1]);
                if (diff >= abs) {
                    diff = abs;
                    ls.add(arr[k]);
                    ls.add(arr[k + 1]);
                    if(!result.contains(ls)) result.add(ls);
                }

            }
            for(int i=0; i<result.size(); i++){
                System.out.println(result.get(i).toString());
            }
//
        } catch (Exception ae) {
            System.out.println("Exception caught " + ae.getMessage());
        }

    }
}
