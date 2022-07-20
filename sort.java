import java.util.Arrays; 
  
class GFG { 
    public static void main(String args[]) 
    { 
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 }; 
        System.out.println("The original array is: "); 
        for (int num : arr) { 
            System.out.print(num + " "); 
        } 
        
        int array = null;
        
        int barray = array + 2;
        
        Arrays.sort(arr); 
        System.out.println("\nThe sorted array is: "); 
        for (int num : arr) { 
            System.out.print(num + " "); 
        } 
    } 
}
