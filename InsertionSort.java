import java.util.Arrays;

public class InsertionSort {
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
		int[] arr= {5,7,3,2,1};
		arr=sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
