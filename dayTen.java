import java.util.*;
public class dayTen {
    public static void main(String[] args) {
        String[] in = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> answer = groupAnagrams(in);
        System.out.println(answer);
    }

        public static List<List<String>> groupAnagrams(String[] strs) {
            
            Map<String, List<String>> anagramGroups = new HashMap<>();

            for (String s : strs) {
                
                char[] charArray = s.toCharArray();
                Arrays.sort(charArray);

                String sortedString = new String(charArray);

                if (!anagramGroups.containsKey(sortedString)) {
                    anagramGroups.put(sortedString, new ArrayList<>());
                }

                anagramGroups.get(sortedString).add(s);
            }


            return new ArrayList<>(anagramGroups.values());
        }
}
