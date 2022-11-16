/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int min =1;
        int max = n;
        int mid = min+(max-min)/2;
        while(min<=max){
            mid = min+(max-min)/2;
            int res = guess(mid);
            if(res ==0)
                return mid;
            if(res<0)
                max = mid-1;
            else
                min = mid+1;
        }
        
        return -1;
    }
}