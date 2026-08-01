class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st=0,end=0,max=0;
        char[] str=s.toCharArray();
        Map<Character,Integer> freq=new HashMap<>();
        for(end=0;end<str.length;end++)
        {
            freq.put(str[end],freq.getOrDefault(str[end],0)+1);
            while(freq.get(str[end])>1)
            {
                freq.put(str[st],freq.get(str[st])-1);
                st++;
            }
            max=Math.max(end-st+1,max);
        }
        return max;
    }
}