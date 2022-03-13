class Solution {
public static int lengthOfLongestSubstring(String s) {
	int max=0;
	HashSet<Character> used = new HashSet<Character>();
	int i =0,j=0;
	while(i<s.length()&&j<s.length()) {
		if(!used.contains(s.charAt(i))) {
		used.add(s.charAt(i++));
		
		max=Math.max(max, i-j);
		}
		else {
			used.remove(s.charAt(j));
			j++;
		}
	}
	return max;
}

}