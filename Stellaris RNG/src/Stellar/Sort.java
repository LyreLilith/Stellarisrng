package Stellar;

import java.util.ArrayList;

public class Sort {
	double[] arr;
     Sort(ArrayList<Trait> t){
    	 double[] iArr=traitsToInt(t);
    	 int high = iArr.length-1;
    	 double low = iArr[0];
     }
     
    Sort(double[]s)
     {
    	arr = mergeSort(s, s.length);
     }
     
     
     private double[] traitsToInt(ArrayList<Trait>t) {
 		int size = t.size();
 		 double[] ArrSize = new double[size];
 		for (int i=0; i<size; i++) {
 			double word=0;
 			 String s = t.get(i).getDes();
 			 for(int j=0; j<s.length(); j++ ) {
 				word+=s.indexOf(j); 
 			 }
 			 word/=s.length();
 			ArrSize[i]=word;
 		}
 		return ArrSize;
 	}
     public static double[] merge(
    		  double[] a, double[] l, double[] r, int left, int right) {
    		 
    		    int i = 0, j = 0, k = 0;
    		    while (i < left && j < right) {
    		        if (l[i] <= r[j]) {
    		            a[k++] = l[i++];
    		        }
    		        else {
    		            a[k++] = r[j++];
    		        }
    		    }
    		    while (i < left) {
    		        a[k++] = l[i++];
    		    }
    		    while (j < right) {
    		        a[k++] = r[j++];
    		    }
				return a;
    		}
     public static double[]mergeSort(double[] a, int n) {
    	    if (n < 2) {
    	        return a;
    	    }
    	    int mid = n / 2;
    	    double[] l = new double[mid];
    	    double[] r = new double[n - mid];

    	    for (int i = 0; i < mid; i++) {
    	        l[i] = a[i];
    	    }
    	    for (int i = mid; i < n; i++) {
    	        r[i - mid] = a[i];
    	    }
    	    mergeSort(l, mid);
    	    mergeSort(r, n - mid);

    	   return merge(a, l, r, mid, n - mid);
    	}
     public double[] getSort() {
    	 return arr;
     }
    public String toString(){
    	String s="";
    	 for(double p:arr) {
    		 s+=p+"\n";
    	 }
    	 return s;
    	 
     }
}
