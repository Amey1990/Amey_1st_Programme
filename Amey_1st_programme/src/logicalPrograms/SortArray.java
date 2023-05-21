package logicalPrograms;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] ={78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
		System.out.println("Array elements after sorting:");  
		//sorting logic  
		for (int i = 0; i < a.length; i++)   
		{  
			for (int j = i + 1; j < a.length; j++)   
			{  
				int temp = 0;  
				if (a[i] > a[j])   
				{  
					temp = a[i];  
					a[i] = a[j];  
					a[j] = temp;  
				}  
			}  
		//prints the sorted element of the array  
		System.out.println(a[i]);  
		}  
		}   
		
	}
