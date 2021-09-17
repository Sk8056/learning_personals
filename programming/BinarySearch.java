import java.util.*;

public class BinarySearch {
    
    /**
     *  right == left could also be the case, when it happens, then their half would be the same
     *   index.
     */
    static int binarySeacrh(int[] ar, int target) {
        int left = 0;
        int right = ar.length - 1;
        while(right >= left) {
            int mid = (left + right) / 2;
            if(ar[mid] == target) {
                return mid;
            }
            else if(ar[mid] > target) { 
                right = mid -1;
            }
            else {
                left = mid + 1;
            } 
        }
        return -1;
    }

    /**
     *  ceiling of a number in sorted array using binary search.
     *  find number greater than or equal to the given number.
     */
     static int ceiling(int[] ar, int target) {
        int left = 0;
        int right = ar.length - 1;
        
        while(right >= left) {
            int mid = (left + right) / 2;
            
            if(ar[mid] == target) {
                return mid;
            }
            else if(ar[mid] > target) { 
                right = mid -1;
            }
            else {
                left = mid + 1;
            } 
        }
        return left;
    }

     /**
     *  floor of a number in sorted array using binary search
     *  find number less than or equal to the given number.
     */
     static int floor(int[] ar, int target) {
        int left = 0;
        int right = ar.length - 1;
        
        while(right >= left) {
            int mid = (left + right) / 2;
            
            if(ar[mid] == target) {
                return mid;
            }
            else if(ar[mid] > target) { 
                right = mid -1;
            }
            else {
                left = mid + 1;
            } 
        }
        return right;
    }
      
      /**
       *  leetcode Q.744
       */
      static char nextGreatestLetter(char[] letters, char target) {
          int length = letters.length;
          int left = 0;
          int right = length - 1;
          while(right >=  left) {
              int mid = (left + right) / 2;
              if(letters[mid] == target) {
                for(int i = mid + 1; i < length; ++i) {
                  if(letters[i] != target) return letters[i];
                }
                return letters[0];
              }
          } else if(letters[mid] < target) {
                  left = mid + 1;
                  if(left == length) return letters[0];
              } else {
                  right = mid -1;
                }
          }
          return letters[left];
    }

      /**
       * The change is no need to find the mid, we can use modulo concept to find the answer.
       * Basically we have to violate the while loop condition which will bring left position to
       * correct position. Modulo example 4 % 4 = 0.
       */
      static char nextGreatestLetterImproved(char[] letters, char target) {
          int left = 0;
          int right = lettters.length - 1;
          while(right >= left) {
            int mid = left + (right - left) / 2;
            if(target < letters[mid]) right = mid - 1;
            else left = mid + 1;
          }
          return letters[left % letters.length];
    }
    
      /**
       * leetcode Q.34
       */
      static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};  
        if(nums.length == 0) return ans;
        int left = searchPosition(nums, target, true);
        int right = searchPosition(nums, target, false);
        ans[0] = left; ans[1] = right;
        return ans;
    }
    
      static int searchPosition(int[] nums, int target, boolean findFirstIndex) {
        int ans = -1;
        int left = 0;
        int right = nums.length - 1;
        while(right >= left) {
           int mid = left + (right - left) / 2;
           if(nums[mid] > target) right = mid - 1;
           else if(nums[mid] < target) left = mid + 1;
           else {
               ans = mid;
               if(findFirstIndex) right = mid - 1;
               else left = mid + 1;
           }
        }  
        return ans;        
    }

      
    public static void main(String[] args) {
        
    }
        
}