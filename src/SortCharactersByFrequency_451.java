import java.util.*;

/**
 * TreeMap （排序）
 */
public class SortCharactersByFrequency_451 {

    public static void main(String[] args) {
        SortCharactersByFrequency_451 entity = new SortCharactersByFrequency_451();
        System.out.println(entity.frequencySort("tree"));
    }

    public String frequencySort(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        int len = chars.length;
        for (int i = 0; i < len; ++i) {
            char c = chars[i];
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        StringBuilder ans = new StringBuilder();
        for (Map.Entry<Character, Integer> mapping : list) {
            for (Integer i = 0; i < mapping.getValue(); i++) {
                ans = ans.append(mapping.getKey());
            }
        }
        return ans.toString();
    }
    
}
