package com.class14;


public class Mod11 {

	public static void main(String[] args) {
		
		  //@Author: Lily King
		 //@Date: 03/13/2021
   //Program: Array Calculation Methods
			
		//Listed below is a program 
		//with methods to return
		//array calculations, averages, 
		//and totals
		//declaring the 2d array variables
		
		long [] [] nums = {{1,2,3,4,5}, {6,7,8,9}, 
				{10,11,12,13,14,15}, {16,17,18,19,20},
				{21,22,23,24,25}};
		
		int rownum=1;

		
		//creating the arguments
		
calcTotal(nums);
calcAverage(nums);
calcRowAverage(nums, rownum);

System.out.println("\n\t\tArray Calculation Methods\n");
//testing methods, printing results
System.out.println("Total of array values: "+ calcTotal(nums));
System.out.println("Average of array values: "+calcAverage(nums));
System.out.println("Average of array row values: "+calcRowAverage(nums,rownum));
	
	}
	
	
public static long calcTotal(long[][]nums)  {//method to calculate array total
	
	{
long total =0;
	
for(long a []: nums) { for(long b: a) { total+=b;

}
}
return total;

}
	}


public static long calcAverage(long[][]nums)  {//method to calculate array average
	
	

long average =0;
int counter =0;
	
for(long d []: nums) { for(long c: d) { average+=c;counter++;

	
		}
}

return average/counter;

}


public static int calcRowAverage(long[][]nums, int rownum) {//method to calculate array row average
	
int counter =0;
int rowAvg=0;


for(int row=rownum; row<=rownum; row++) {  for (int i = 0; i<nums[row].length; i++) {
	
rowAvg+=nums[row][i];
	
	counter++;
}		
}


rowAvg=rowAvg/counter;

return rowAvg;


}
}





