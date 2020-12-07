package hbcu.stay.ready.algor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public Boolean harmlessRansomNote(String message, String magazineText) {

        String[] ransomNoteArray = message.split(" ");
        Map<String, Integer> magazineWordCount = new HashMap<>();
        String[] magazineArray = magazineText.split(" ");

        for (String word : magazineArray) {
            if (magazineWordCount.containsKey(word)) {
                Integer count = magazineWordCount.get(word) + 1;
                magazineWordCount.put(word, count);
            } else
                magazineWordCount.put(word, 1);
        }

        for (String word : ransomNoteArray) {
            if(magazineWordCount.containsKey(word)==false)
                return false;
            int count = magazineWordCount.get(word);
            if (count ==0)
                return false;
            magazineWordCount.put(word, count-1);
        }
        return true;
    }
}


//            Map<Character,Integer> map=new HashMap<Character,Integer>();
//
//            for(int i=0;i<magazineText.length();i++){
//                map.put(magazineText.charAt(i),(map.getOrDefault(magazineText.charAt(i),0)+1));
//            }
//
//            for(int i=0;i<message.length();i++){
//
//                if(map.containsKey(message.charAt(i))){
//                    if(map.get(message.charAt(i))<=0) return false;
//                }else{
//                    return false;
//                }
//
//                map.put(message.charAt(i),(map.get(message.charAt(i))-1));
//            }
//
//            return true;
//        }

//        public static void main(String[] args) {
//            message rn=new RansomNote();
//            System.out.println(rn.canConstruct("aa","aab"));




//        List<Character> maga=new ArrayList<>();
//        for(Character c:magazineText.toCharArray()) maga.add(c);
//        for(Character c:message.toCharArray()){
//            if(!maga.contains(c)){return false;}
//            else{
//                maga.remove(maga.indexOf(c));
//            }
//        }
//        return true;
//    }
//}







//        int[] arr = new int[1];
//        for (int i = 0; i < magazineText.length(); i++) {
//            arr[magazineText.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < message.length(); i++) {
//            if(--arr[message.charAt(i)-'a'] < 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    }


