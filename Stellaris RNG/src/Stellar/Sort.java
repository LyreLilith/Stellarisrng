package Stellar;

import java.util.ArrayList;

public class Sort {
     Sort(ArrayList<Trait> t){
    	 int[] iArr=traitsToInt(t);
    	 int high = iArr.length-1;
    	 int low = iArr[0];
     }
     private int[] traitsToInt(ArrayList<Trait>t) {
 		int size = t.size();
 		
 		int[] ArrSize = new int[size];
 		for (int i=0; i<size; i++) {
 			int word=0;
 			 String s = t.get(i).getDes();
 			 for(int j=0; j<s.length(); j++ ) {
 				word+=s.indexOf(j); 
 			 }
 			ArrSize[i]=word;
 		}
 		return ArrSize;
 	}
     public static void mergeSort(int[] array, int length) {
    	   if (length<2)
    	   {
    		   return;
    	   }
    	   int mid = length/2;
    	   int[]left = new int[mid];
    	   int[]right = new int[mid-1];
    	   for(int i=0; i<mid; i++) {
    		   left[i]=array[i];
    	   }
    	   for(int i=mid; i<length; i++) {
    		   right[i-mid]=array[i];
    	   }
    	   mergeSort(left,mid);
    	   mergeSort(right,length-mid);
    	   
    	   
    	   
    	   
     }
     public static void merge(int[] array, int low, int mid, int high) {
    	 int[] leftMerge = new 
     }
}
