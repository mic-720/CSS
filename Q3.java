
public class Q3 {
	public static boolean isSorted(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static int[] reverse(int[] arr,int i,int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,5,4,3,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(isSorted(reverse(arr,i,j))) {
					System.out.println("yes");
				}
			}
		}
	}
}
