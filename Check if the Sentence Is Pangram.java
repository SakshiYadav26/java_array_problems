// https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
class Solution {
    public boolean checkIfPangram(String sentence) {

         if(sentence.length()<26) return false;
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                return false;
            }
         }
        return true;
    }
    // if (sentence.length() < 26) return false;
    //    char [] ch= new char[26];
       
    //    int count=0;
    //    for(char c: sentence.toCharArray()){
    //     if (c >= 'a' && c <= 'z') {
    //            if (ch[c - 'a'] == 0) {  
    //                ch[c - 'a'] = 1;
    //                count++;
    //            }
    //        }
    //    }

    //    return count == 26; 
    // }

}
       
