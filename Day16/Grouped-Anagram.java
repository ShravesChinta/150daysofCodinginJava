/**

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]

**/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagrams=new ArrayList<>();
        HashMap<String, List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String sorted_string=new String(c);
            if(!map.containsKey(sorted_string))
            {
                map.put(sorted_string, new ArrayList<>());
            }
            map.get(sorted_string).add(s);
        }
        System.out.println(map.values());
        groupAnagrams.addAll(map.values());
        
        return groupAnagrams;
    }
}
