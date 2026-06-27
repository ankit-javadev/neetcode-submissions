class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        for(String i : strs){
            char[] c = i.toCharArray();
            Arrays.sort(c);
            String key = new String(c);           
            List<String> l = m.get(key); 
            if(l==null){ 
                l = new ArrayList<>(); 
                m.put(key, l);
                }
            l.add(i); 
        }
        return new ArrayList(m.values());
    }
}
