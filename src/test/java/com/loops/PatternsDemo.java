package com.loops;

public class PatternsDemo {

	public static void main(String[] args) {
		getPattern(4,5);
		hollowPattern(4,5);
		patternTriangle(5);
		patternReverseTri(5);
		patternUppeTriang(5);
		patternNumber(5);
		patternRevNum(5);
		patternRevHalf(5);
		patternHalfpyramid(5);
		patternTest(5);
		patternHollo(5,5);
		patternOneZero(5);
		patternZeroOne(5);
		patternAandB(5);
		patternButterfly(4);
		patternRombus(5);
		patternpyramidNum(5);
		patternPalindrome(5);
		patternDiamond(5);
		patternDiamond2(5);
	}
	public static void getPattern(int n,int m) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void hollowPattern(int n,int m) {
		System.out.println("---------------------------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1 ||j==1||i==n||j==m) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
		
			}
			System.out.println();
		}
	}
	public static void patternTriangle(int n) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void patternReverseTri(int n) {
		System.out.println("----------Reverse Triangle------------");
		for(int i=n;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void patternUppeTriang(int n) {
		System.out.println("----------------------------------");
		for(int i=1;i<=n;i++) {
			//inner loop space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}
			//inner loop star
			for(int j=1;j<=i;j++) {
			System.out.print("*");	
			}
			System.out.println();
		}
	}
	public static void patternNumber(int n) {
		System.out.println("--------------------print number pattern------------");
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void patternRevNum(int n) {
		System.out.println("-------------------------------------");
		for(int i=n;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void patternRevHalf(int n) {
		System.out.println("----------------------------------------");
		for(int i=1;i<=n;i++) {
			//inner print space
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void patternHalfpyramid(int n) {
		System.out.println("--------------------------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void patternTest(int n) {
		System.out.println("--------------------------");
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
	public static void patternHollo(int n, int m) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1 || j==1 || i==n || j==m) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void patternOneZero(int n) {
		int sum=0;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			sum=i+j;
			if(sum%2==0) {
				System.out.print("1 ");
			}else {
				System.out.print("0 ");
			}
		}
		System.out.println();
	}	
	}
	public static void patternZeroOne(int n) {
		System.out.println("--------------------------------");
		int sum=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				sum=i+j;
				if(sum%2==0) {
					System.out.print("0 ");
				}else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
	public static void patternAandB(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				if(sum%2==0) {
					System.out.print("A ");
				}else {
					System.out.print("B ");
				}
			}
			System.out.println();
		}
	}
	public static void patternButterfly(int n) {
		System.out.println("------------Butterfly---------------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			int sp=2*(n-i);
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			//2nd part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//second half
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			int sp=2*(n-i);
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			//2nd part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void patternRombus(int n) {
		System.out.println("----------Rombus Pattern-------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void patternpyramidNum(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
	}
	public static void patternPalindrome(int n) {
		System.out.println("------------patternPalindrome-------------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//first half
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			//second half
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void patternDiamond(int n) {
		System.out.println("-------------Diamond---------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void patternDiamond2(int n) {
		System.out.println("--------Diamond 2 ----------------");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return;
	}
}
