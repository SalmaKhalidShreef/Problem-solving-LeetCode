class Solution {
public int search(int[] nums, int target)
{
int low=0,ans=-1,mid=0;
int high =nums.length-1;
while(low<=high)
{
mid=(low+high)/2;
if(target == nums[mid])
{

            break;
        }
        else if(target<nums[mid])
        {
            high = mid-1;
        }
        else
            low=mid+1;
    }
    if(low>high)
        return -1;
    else
        return mid;
   
}
}