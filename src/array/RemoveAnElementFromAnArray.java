package array;

public class RemoveAnElementFromAnArray {
public static void main(String[] args) {
	int[] a= {8,11,23};
	
	int value=11;
	
	int[] b=new int[a.length-1];
	
	int j=0;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]!=value) {
			b[j]=a[i];
			j++;
		}
	}
	display(b);
}

public static void display(int[] a) {
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
}
}
