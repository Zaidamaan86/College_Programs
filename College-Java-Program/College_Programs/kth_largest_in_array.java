import java.util.Scanner;
class kth_largest_in_array{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=obj.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=obj.nextInt();
		}
		System.out.println("enter the kth largest number to be find");
		int k=obj.nextInt();
		int temp; 
		for(int i=0;i<k;i++){
			int max=-999;
			for(int j=i;j<n;j++){
			if(arr[j]>=max){
				max=arr[j];
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}

		}
		}
		System.out.println(k+"th largest number = "+arr[k-1]);
	}
}

