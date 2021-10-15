import java.util.Arrays;
// this program returns the target elements if present or greater than target elememnt present in array.Concept binary search
//Time complexity O(log N) where N is thee size of array
public class Ceilingbin_srch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {21,34,56,67,78,89,90,92};
		System.out.println(Arrays.toString(ceiling(a,57)));
	}
		static int[] ceiling(int[] a,int target)
		{
		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
		if(target==a[mid])
			return new int[] {mid,a[mid]};
			if(target>a[mid])
				start=mid+1;
			else 
				end=mid-1;	
			}
		if(start==a.length)
			return new int[] {-1,-1};
		else
		return new int[] {start,a[start]};

	}
}

