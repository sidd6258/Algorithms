package leetCode;

public class MedianTwoSortedArray {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int l_arr1 = nums1.length;
		int l_arr2 = nums2.length;

		double[] nums3 = new double[l_arr1 + l_arr2];
		double median=0;
		nums3=mergearrays(nums1,nums2,l_arr1,l_arr2,nums3);
		if((l_arr1 + l_arr2)%2==0)
		{
			
			median=(nums3[(l_arr1 + l_arr2)/2-1]+nums3[(l_arr1 + l_arr2)/2])/2;
			return median;
		}
		else
		{
			median= nums3[(l_arr1 + l_arr2)/2];
			return median;
		}
			
	}
	

	private static double[] mergearrays(int[] nums1, int[] nums2, int l_arr1, int l_arr2, double[] nums3) {
		int i=0,j=0,k=0;
		while(i<l_arr1 && j<l_arr2) {
			if(nums1[i]<nums2[j]) {
				nums3[k++]=nums1[i++];
			}
			else {
				nums3[k++]=nums2[j++];
			}
		}
		while (i < l_arr1)
            nums3[k++] = nums1[i++];
     
        // Store remaining elements of second array
        while (j < l_arr2)
            nums3[k++] = nums2[j++];
        
        return nums3;
		
	}


	public static void main(String[] args) {
		int[] nums1= {1,3};
		int[] nums2= {2};
		double median=findMedianSortedArrays(nums1,nums2);
		System.out.println(median);
	}
}
