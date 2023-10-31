
public class Q1 {
	public static void main(String[] args) {
		int[] arr={5,3,4,2,7};
		int min=arr[0];
		int count=5;
		int red=0;
		System.out.print("Total Positive Numbers after successive Reduction: ");
		while(count>0)
		{
			count=0;
			min=Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++) 
			{
				if(min>arr[i] && arr[i]!=0)
				{	
					min=arr[i];
				}
			}
			for(int i=0;i<arr.length;i++) 
			{
				if(arr[i]>0) {
					arr[i]=arr[i]-min;
				}
				if(arr[i]>0) {
					count++;
				}
			}
			System.out.print(count+" ");
			red++;
		}
		System.out.println();
		System.out.println("No. of reductions : "+red);
	}
}
