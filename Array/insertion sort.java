package priyam;

public class q4 {
public static void insertionsort(int a[]) {
	int n = a.length;
	
	for(int i=1; i<=n-1; i++) {
		for(int j=i-1; j>=0;j--) {
			
			if(a[j] > a[j+1]) {
			
				int temp;
				temp =a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			
			else 
				break;
		}
	}
	for(int element:a) {
		System.out.println(element);
	}
}
	public static void main(String[] args) {
		
int a[] = {1,3,5,3,6,8,7,9};

insertionsort(a);




}
		
		
		
	}


