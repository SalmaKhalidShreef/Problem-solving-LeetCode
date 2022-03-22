class Solution {
    public String getSmallestString(int n, int k) {
        char[] res = new char[n];
        for (int i = 0; i < n; i++) res[i] = 'a';
        k -= n;
        while (k > 0) {
            if (k > 25) {
                res[--n] = 'z';
                 k -= 25;
            } else {
                res[--n] = (char) (k + 97);
                break;
            }
        }

        return new String(res);
    }
}