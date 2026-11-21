class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        int idx = 0;
        String[] ans = new String[heights.length];
        for(String s : map.values()){
            ans[idx++] = s;
        }
        return ans;
    }
}