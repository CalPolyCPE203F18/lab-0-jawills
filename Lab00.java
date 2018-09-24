public class Lab00
{
   public static void main(String[] args)
   {
		// declaring and initializing some variables
		int x = 5;
		String y = "hello";
		double z = 9.8;
		
		// printing the variables
		System.out.println("x: " + x + " y: " + y + " z: " + z);
	   
	   
		// a list (make an array in java)
		int[] nums = new int[4];
		//3, 6, -1, 2
		nums[0] = 3;
		nums[1] = 6;
		nums[2] = -1;
		nums[3] = 2;
		for (int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
		}
		
		//call a function
	    int numFound = char_count(y, 'l');   
	    System.out.println("Found: " + numFound);
		
		
		// a counting for loop
	    for (int i = 1; i < 11; i++){
		    System.out.print(i + " ");
		}
		System.out.println();
	}
   
   public static int char_count(String s, char c){
	   int count = 0;
	   char[] chrarray = s.toCharArray();
	   for (int i = 0; i < chrarray.length; i++){
		   // iterate through each char of the string
		   if (chrarray[i] == c){
			   count ++;
		   }
	   }
		return count;
	   
   }
}
