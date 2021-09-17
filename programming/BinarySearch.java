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
     *  ceiling of a number using binary search
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
        return left > 0 ? left : -1;
     }

     /**
     *  floor of a number using binary search
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
        return right > 0 ? right : -1;
      }
      
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

      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10,12,23,45,60};
        int input = scanner.nextInt();
        int result = floor(array, input);
        System.out.println("index " + result + " number " + array[result]);
    }
        
}