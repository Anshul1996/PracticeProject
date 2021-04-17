package globallogic;

import java.util.HashMap;
import java.util.Map;

public class test {
        public int firstUniqChar(String s) {
            HashMap<Character,Integer> hs =new HashMap<Character,Integer>();
            char[] chars=s.toCharArray();
            for(char c : chars){
                if(hs.containsKey(c)){
                    int i = hs.get(c);
                    hs.put(c,i+1);
                }
                else{
                    hs.put(c,1);
                }
            }
            System.out.println(hs);
            for(int i=0;i<chars.length;i++){
                System.out.print(chars[i]);
                System.out.print(hs.get(chars[i]));
                if(hs.get(chars[i]) == 1){
                    return i;
                }
                System.out.println();
            }
            return -1;
        }

    public static void main(String args[]){
            test t1 = new test();
        System.out.println(t1.firstUniqChar("loveleetcode"));
    }
}


