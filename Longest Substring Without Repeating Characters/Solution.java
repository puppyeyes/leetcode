package leetcode_3;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
	public static int lengthOfLongestSubstring(String s) {
		HashMap<Character,Integer> hash_map =new HashMap<Character,Integer>();
		char[] c_array=s.toCharArray(); 
		int count=0,result=0;
		int end=0,start=0;
		for(int i=0;i<c_array.length;i++)
		{
			char end_c=c_array[i];
			end=i;
			if(!hash_map.containsKey(end_c))
			{
				hash_map.put(end_c, i);
				count=end-start+1;
				if(count>result)
				{
					result=count;
				}
			}
			else {
				int next_start=hash_map.get(end_c);
				//清空前面的hashmap
				for(int j=start;j<next_start;j++)
				{
					hash_map.remove(c_array[j]);
				}
				start=next_start+1;
				hash_map.put(end_c,i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("tmmzuxt"));
	}
}