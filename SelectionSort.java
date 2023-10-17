import java.util.Arrays;

public class SelectionSort {
	public static int[] sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i];
			int minIndex=i;
			int j=i+1;
			for(;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=min;
			arr[minIndex]=temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr= {5,7,3,2,1};
		arr=sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
