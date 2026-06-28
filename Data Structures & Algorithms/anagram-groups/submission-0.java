class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, HashSet<Integer>> list = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
                char[] chars = strs[i].toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);

                if( list.containsKey(sorted) == false){
                    HashSet<Integer> set = new HashSet<>();
                    set.add(i);
                    list.put (sorted,set);
                }
                else{
                    list.get(sorted).add(i);
                }          
        }
        List<List<String>> ans = new ArrayList<>();
        for (HashSet<Integer> indices : list.values()) {
             List<String> group = new ArrayList<>();
            for (int index : indices) {
                            group.add(strs[index]);
            }
            ans.add(group);
        }
         return ans;
    }
}
