package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Roshni Velluva Puthanidam on 03/08/16.
 */
public class ClosestNumbers2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named matrixZero. */
        Scanner in = new Scanner(System.in);
        //HashMap<List<Integer>,Integer> hm=new HashMap<List<Integer>,Integer>();
        int n = in.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> ls = new ArrayList<Integer>();
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        try {
            for (int k = 0; k < n - 1; k++) {
                // List<Integer> ls=new ArrayList<>();
                int abs = Math.abs(arr[k] - arr[k + 1]);
                if (diff > abs) {
                    ls.clear();
                    diff = abs;
                    ls.add(arr[k]);
                    ls.add(arr[k + 1]);
                    // hm.put(ls,abs);
                } else if (diff == abs) {
                    diff = abs;
                    ls.add(arr[k]);
                    ls.add(arr[k + 1]);
                }
            }
            for (int k = 0; k < ls.size(); k++) {
                System.out.print(ls.get(k) + " ");
            }
        } catch (Exception ae) {
            System.out.println("Exception caught " + ae.getMessage());
        }
    }
}
