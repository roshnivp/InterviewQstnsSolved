package PracticeQstns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roshni Velluva Puthanidam on 11/12/17.
 */
public class AllSubstsOfString {
    public static void main(String[] args){
        String str = "abc";
        printAllSubset(str);
    }
    static List<String>  printAllSubset(String str){
        int n = str.length();
        List<String> res = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                String new_str = str.substring(i,i+j);
                if(!res.contains(new_str)) res.add(new_str);
            }
        }

        System.out.println(res.size());
        return  res;
    }
}
