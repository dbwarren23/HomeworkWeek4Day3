import java.util.Scanner;

public class arrayhomework1 {
   public static void main(String args[]){
      System.out.println("Enter array size ");
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int myArray[] = new int [size];
      
      System.out.println("Enter the elements of the array one by one ");
      int sum = 0;
      for(int i=0; i<size; i++){
         myArray[i] = s.nextInt();
         sum = sum + myArray[i];
      }
      
      System.out.println("Your sum is  "+sum);
   }
}