import java.util.Arrays;

public class Q2 {
	public static int[] sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j=i-1;
			int temp=arr[i];
			for(;j>=0;j--) {
				if(arr[j]>temp) {
					arr[j+1]=arr[j];
				}
				else {
					break;
				}
			}
			arr[j+1]=temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr1={1,3,5,7,10};
		int[] arr2= {2,4,6};
		System.out.println("Initially");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				i++;
				continue;
			}
			else {
				int temp=arr1[i];
				arr1[i]=arr2[j];
				arr2[j]=temp;
				arr2=sort(arr2);
			}
		}
		System.out.println("After Merging");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
