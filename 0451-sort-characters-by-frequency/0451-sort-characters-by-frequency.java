class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        StringBuilder res = new StringBuilder();
        while(!pq.isEmpty()){
            char ch = pq.poll();
            int count = map.get(ch);
            for (int i = 0; i < count; i++) {
                res.append(ch);
            }
        }
        return res.toString();
    }
}