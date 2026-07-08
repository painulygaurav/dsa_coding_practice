import java.util.HashMap;

public class ValidAnagram_242 {
    public static void main(){
        System.out.println(isAnagramWithHashMap("anagram", "nagaram"));
        System.out.println(isAnagramWithArray("anagram", "nagaram"));
    }

    /**
     * Using HashMap
     * Case insensitive
     * Time complexity = O(n) or O(n * k) if we consider Hash collision
     * Space complexity = O(n)
     * @param s - First String
     * @param t - Second String
     * @return boolean true if s is an anagram of t else false
     */
    static boolean isAnagramWithHashMap(String s, String t){
        // Step 1: Check length
        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> frequencies = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++){
            char ch = Character.toLowerCase(t.charAt(i));

            // Not an anagram is t's character is not a key in frequencies HashMap
            if(!frequencies.containsKey(ch)) return false;

            frequencies.put(ch, frequencies.get(ch) - 1);

            if(frequencies.get(ch) == 0){
                frequencies.remove(ch);
            }

        }
        return frequencies.isEmpty();
    }

    /**
     * Using Array
     * Case insensitive
     * Time complexity = O(n)
     * Space complexity = O(1)
     * @param s - First String
     * @param t - Second String
     * @return boolean true if s is an anagram of t else false
     */
    static boolean isAnagramWithArray(String s, String t){
        if(s.length() != t.length()) return false;

        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++){
            charCounts[Character.toLowerCase(s.charAt(i)) - 'a']++;
            charCounts[Character.toLowerCase(t.charAt(i)) - 'a']--;
        }

        for (int count : charCounts){
            if(count != 0) return false;
        }

        return true;
    }
}
