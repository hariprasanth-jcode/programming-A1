package array;

public class InsertAnElementInaArray {
public static void main(String[] args) {
	int[] a= {8,6,11,3,14};
	int index=2;
	int value=100;
	insertAnElementInArray(a,index,value);
}
public static void insertAnElementInArray(int[] a,int index,int value) {
	int[] b=new int[a.length+1];
	for(int i=0;i<index;i++) {
		b[i]=a[i];
	}
	b[index]=value;
	for(int i=index;i<b.length-1;i++) {
		b[i+1]=a[i];
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
