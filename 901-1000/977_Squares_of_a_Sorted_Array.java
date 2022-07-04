/*
977. Squares of a Sorted Array
Easy

5740

159

Add to List

Share
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 

Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
*/



class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int index=right;
        int[] result= new int[nums.length];
        while(left<=right){
            if(nums[left]*nums[left]<nums[right]*nums[right]){
                result[index--]=nums[right]*nums[right];
                right--;
            }else{
                result[index--]=nums[left]*nums[left];
                left++;
            }
            
        }
          return result;  
    }
}