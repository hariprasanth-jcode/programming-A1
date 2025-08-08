package array;

public class EvenindexMax {
	public static void main(String[] args) {
     int[] a= {16,11,14,13,2,5};
     
     int max=a[0];
     for(int i=0;i<a.length;i+=2) {
    	 if(max<a[i]) {
    		 max=a[i];
    	 }
     }
     System.out.println(max);
	}
}
