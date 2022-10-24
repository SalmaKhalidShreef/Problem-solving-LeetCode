class Solution {
    public int hammingDistance(int x, int y) {
        int tmp = x ^ y;
        return Integer.bitCount(tmp);
    }
}