import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagram_49 {
    static List<List<String>> groupAnagramsBruteForce(String[] strings){
        List<List<String>> result = new ArrayList<>();
        if(strings == null || strings.length == 0) return result;

        boolean[] visited = new boolean[strings.length];

        for(int i = 0; i < strings.length; i++){
            if(visited[i])
                continue;

            List<String> currentGroup = new ArrayList<>();
            currentGroup.add(strings[i]);
            visited[i] = true;

            for(int j = i + 1; j < strings.length; j++){
                if(!visited[j]) {
                    if(isAnagram(strings[i],strings[j])){
                        currentGroup.add(strings[j]);
                        visited[j] = true;
                    }
                }
            }
            result.add(currentGroup);
        }
        return result;
    }

    static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }

    public static void main(String[] args){
        String[] strings = {"eat", "tea", "tan", "ate"};
        System.out.println(groupAnagramsBruteForce(strings));
    }
}
