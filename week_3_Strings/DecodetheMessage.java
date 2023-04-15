package week_3_Strings;

import java.util.HashMap;

//2325. Decode the Message
public class DecodetheMessage {

	public static void main(String[] args) {
		String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
		System.out.println(decodeMessage(key, message));
	}
	
	public static String decodeMessage(String key, String message) {
        StringBuilder ans = new StringBuilder();
        key = key.replaceAll(" ", "");
       
        HashMap<Character,Character> letters = new HashMap<>();

        char original = 'a';
        for (int i = 0; i < key.length() ; i++) {
            if (!letters.containsKey(key.charAt(i))){
                letters.put(key.charAt(i),original++);
            }
        }
        
        for (int i = 0; i < message.length(); i++) {
            if (letters.containsKey(message.charAt(i))){
                ans.append(letters.get(message.charAt(i)));
            }else{
                ans.append(message.charAt(i));
            }
        }
        return ans.toString();
    }

}
