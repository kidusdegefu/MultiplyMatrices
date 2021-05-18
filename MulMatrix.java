
import java.util.Scanner;
public class MulMatrix
{
	//Desc: 	Multiply 2 square matrices
	//Input:	Keyboard supplies the dimensions of the matrix, followed by the values of the first 
	//	matrix, followed by the values of the second matrix.  The values are entered in row-major 
	//	(the values of row 1 followed by values of row 2 and so on) and are separated by white 
	//	space.  
	//Output:The product of the 2 input matrices 
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);		
		System.out.print("Enter dimension of square matrix: ");		
		int n=input.nextInt();
		int[][] m1=new int[n][n];
		System.out.println("Enter values for m1:");		
		readMatrix(m1, input);		
		int[][] m2=new int[n][n];
		System.out.println("Enter values for m2:");		
		readMatrix(m2, input);
		int[][] m3= mulMatrix (m1,m2);				
		System.out.println("Product of m1 and m2:");		
		printMatrix(m3);	
		input.close();	
	}
	//You are to write methods readMatrix, printMatrix, and mulMartix
	//return: an arry  formed from th product of arr and arr1
	public static int[][] mulMatrix(int[][] arr,int[][] arr1)
	{
		int[][] multipleArr= new int[arr.length][arr1[0].length];
		for (int j=0; j<arr.length; ++j)
			for (int i=0; i<arr1[0].length ;++i)
			{
				int sum=0;
				for(int k=0; k<arr1.length; ++k)
					{
						int temp=arr[j][k]*arr1[k][i];	
						sum+=temp;
					}
				multipleArr[j][i]=sum;
			}
		return multipleArr;
	}
	//post: the next number to assign to the two dimensional array
	public static void readMatrix(int[][] arr, Scanner input)
	{
		for (int j=0; j<arr.length; ++j)
			for(int k=0; k<arr[j].length; ++k)
			{	
				int ele= input.nextInt();
				arr[j][k]= ele;
			}		
	}
	// output: prints the matrix arr on the screen
	public static void printMatrix(int[][] arr)
	{
		for (int j=0; j<arr.length; ++j)
			{
			for(int k=0; k<arr[j].length; ++k)
				System.out.printf("%4d",arr[j][k]);
			System.out.println();
			}
	}
}
