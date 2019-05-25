package principal;

public class Programa {

	public static void main(String[] args) {
		int[] nums = {5,6,7,8,8,9};
		int posi = f1(nums,nums.length-1,8); //o llamando a f2
		System.out.println(posi);
	}
	
	public static int f1(int[] nums, int n, int b) {
		if(n==-1)
			return -1;
		
		if(nums[n]==b)
			return n;
		
		n = f1(nums,n-1,b);
		
		return n;
	}
	
	public static int f2(int[] nums, int n, int b) {
		if(n==-1)
			return -1;
		
		n = f2(nums,n-1,b);
		
		if(n!=-1 && nums[n]==b)
			return n;
		else {
			if((nums.length-1)==(n+1) && nums[n+1]!=b)
				return -1;
			
			return n+1;
		}
	}
}
