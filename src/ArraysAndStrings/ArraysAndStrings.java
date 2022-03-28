package ArraysAndStrings;

import java.util.*;

public class ArraysAndStrings {

    public static void main(String args[]){

    //System.out.println(isUnique("Anabelle"));
        System.out.println(checkPermutation("adc",
                "dcda"));
    }


    //1.1
    public static boolean isUnique(String s){

        char[] temp = s.toUpperCase().toCharArray();

        Arrays.sort(temp);  //  nlog(n)

        for(int i=0;i<temp.length-1;i++){
            if(temp[i]==temp[i+1]){
                return true;
            }
        }
        return false;
    }

    //1.2
    public static boolean checkPermutation(String s1, String s2){

        char temp1[] = s1.toCharArray();
        char temp2[] = s2.toCharArray();

        List<Character> h = new ArrayList<Character>();
        List<Character> orig = new ArrayList<Character>();

        for(int i=0;i<temp1.length;i++){
            h.add((Character)(temp1[i]));
        }

        orig.addAll(h);

        for(int i=0;i<temp2.length;i++){

            if(h.contains((Character)temp2[i])){
                h.remove((Character)temp2[i]);
            }else{
                h.clear();
                h.addAll(orig);

                i= i+1-h.size();
            }


            if(h.size()==0){
                return true;
            }

        }

        return false;
    }
}
