package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 03/08/16.
 */

        import java.util.*;
/**
 * Created by roshni on 5/20/16.
 */
public class LongestSubString {


        int lengthOfLongestSubsequence(String s) {
            HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
            int max=0, start =0, end=0;

            for (int i = 0; i < s.length(); i++) {
                if (hm.containsKey(s.charAt(i))) {
                    start++;
                }
                hm.put(s.charAt(i),i);
                end++;
                max = end-start;
            }
            return max;

        }
        int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
            int max=0, start =0, end=0;

            for (int i = 0; i < s.length(); i++) {
                if (hm.containsKey(s.charAt(i))) {
                    start = i;
                }
                hm.put(s.charAt(i),i);
                end++;
                max= max < end-start? end-start:max;
            }
            return max;
        }


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String theString = "ggafaccdeebe";
        LongestSubString vm=new LongestSubString();
        int length=vm.lengthOfLongestSubsequence(theString);
        int length_sub=vm.lengthOfLongestSubstring(theString);
        System.out.println(length);
        System.out.println(length_sub);
    }

}
