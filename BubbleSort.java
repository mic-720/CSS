import java.util.Arrays;

public class BubbleSort {
	public static int[] sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		arr=sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
