class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int[] arr=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temp[i]>temp[st.peek()]){
                int prevDay=st.pop();
                arr[prevDay]=i-prevDay;
            }
            st.push(i);
        }
        return arr;
    }
}