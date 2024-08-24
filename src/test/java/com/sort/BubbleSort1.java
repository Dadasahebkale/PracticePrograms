package com.sort;

public class BubbleSort1 {
	public static void printSort(int[] arr){
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
		}

		public static void main(String arg[]){

		int arr[]={7,8,3,2,1};
		//starts from zero and 1 is less because greater elements we will print
		for(int i=0;i<arr.length-1;i++){
			//we will get element 1+ another on as large before swapping
			for(int j=0;j<arr.length-i-1;j++){

			if(arr[j]>arr[j+1]){
			//swap the array

			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
		}
		}
		printSort(arr);
		}


}
