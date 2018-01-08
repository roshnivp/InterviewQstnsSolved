package HackerRank;

import java.io.IOException;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by Roshni Velluva Puthanidam on 09/02/17.
 */
public class StringToNumber {

    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        String str=in.next();
        StringToNumber st=new StringToNumber();
        long ans= myStringToInteger(str);
        System.out.println(ans);

    }



    static long myStringToInteger(String str) {
//        Pattern p = Pattern.compile("[^+-0-9]");
//        Matcher m = p.matcher(str);
//        boolean b =  m.matches();
            if(str.length()> 0) {
                if (str.matches("(\\+|-)?([0-9]+)")) {
                    int answer = 0, factor = 1;
 //                   String new_str=str;
//                    int neg=str.indexOf('-');
//                    int pos=str.indexOf('+');
//                    str.replace("+","");
//                    str.replace("1","")
                    if(str.contains ("+")|| str.contains("-")) {
                        str.substring(1);
                        System.out.println(str);
                    }
//                    System.out.println(pos);
//                    System.out.println(neg);
                    for (int i = str.length() - 1; i >= 0; i--) {

                                answer += (str.charAt(i) - '0') * factor;
                                factor *= 10;


                    }
                    return answer;
                }
                else{
                    throw new IllegalArgumentException("Invalid input");

                }
            }
            else{
                throw new IllegalArgumentException("Invalid input");

            }



    }
}
