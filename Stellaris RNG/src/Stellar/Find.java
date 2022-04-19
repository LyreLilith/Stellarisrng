package Stellar;

public class Find {
	int a;
	Find(double[]list, String toFind){
		double word = 0;
		for(int i=0; i<toFind.length(); i++) {
			word+=toFind.indexOf(i);
		}
		word/=toFind.length();
	}
		Find(double[]list, int first, int last, double key){
			a= binarySearch(list, first, last,  key);
			System.out.println("The index is"+a);
		}
	
	public static int binarySearch(double[]list, int first, int last, double key) {
		
		if(last>=first) {
		int mid = first + (first +last)/2;
		if (list[mid]==key) {
			return mid;
		}
		if (list[mid]>key) {
			return binarySearch(list, first, mid-1, key);
			
		}
		else {
			return binarySearch(list, mid+1,last, key);
		}
		}
		return-1;
	}
	
}
