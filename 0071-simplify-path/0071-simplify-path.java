class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] parts = path.split("/");
        for(String part : parts){
            if(part.equals("") || part.equals(".")){
                continue;
            }
            if(part.equals("..")){
                if(!st.isEmpty()) st.pop();
            }else {
                st.push(part);
            }
        }
        if(st.isEmpty()) return "/";
        StringBuilder res = new StringBuilder();
        for(String f : st){
            res.append("/").append(f);
        }
        return res.toString();
    }
}