package week1.day2;
import java.util.Arrays;
public class SmallestNumber {

	public static void main(String[] args) {
	      int temp, size;
	      int array[] = {23,45,67,32,89,22};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	      for(int j = i+1; j<size; j++){
	      if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Smallest element of the array is:: "+array[0]);
	   }

}
