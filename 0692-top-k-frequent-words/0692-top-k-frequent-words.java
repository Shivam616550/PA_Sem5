class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String str : words){
            map.put(str, map.getOrDefault(str,0)+1);
        }
        
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
            if(map.get(a).equals(map.get(b))){
                return a.compareTo(b);
            }
            return map.get(b) - map.get(a);
        });
        pq.addAll(map.keySet());
        List<String> res = new ArrayList<>();
        for(int i = 0; i < k; i++){
            res.add(pq.poll());
        }
        return res;
    }
}