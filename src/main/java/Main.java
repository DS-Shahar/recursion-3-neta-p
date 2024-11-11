package Explorer;

public class Main {
	
	static int q3(int n,int [] a,int i) {
		if(i==0 && a[i]!=n) {
			return 0;
		}
		if(a[i]==n ) {
			return 1+q3(n,a,i-1);
		}
		return q3(n,a,i-1);
	}
	
	static boolean q2(int [] a,int i) {
		if(i+1==a.length) {
			return true;
		}
		if(a[i]>a[i+1]) {
			return false;
		}
		return q2(a,i+1);
	}
	

	
	
	static int f21(String n,int i) {
		if(i==n.length()) {
			return 0;
		}
		if(Character.isLowerCase(n.charAt(i))) {
			return 1+f21(n,i+1);
		}
		return f21(n,i+1);
	}
	

	
    public static String f22(String str) {
        return addAsteriskHelper(str, 0);
    }

    private static String addAsteriskHelper(String str, int i) {
        if (i >= str.length()) {
            return "";
        }
        if (i + 3 > str.length()) {
            return str.substring(i);
        }
        return str.substring(i, i + 3) + "*" + addAsteriskHelper(str, i + 3);
    }

    public static String o(String str) {
        return oppositeStrHelper(str, 0);
    }

    
    
    private static String oppositeStrHelper(String str, int i) {
        if (i >= str.length()) {
            return "";
        }
        return str.charAt(str.length()-1-i) + oppositeStrHelper(str, i + 1);
    }
	
    
    private static int f10(int n) {
    	if(n==0) {
    		return 0;
    	}
    	if(n%2==0) {
    		return n*n+f10(n-1);
    	}
    	return n*2+f10(n-1);
    
    }
    
    private static double f11(int n,double i) {
    	if(n==0) {
    		return 0;	
    	}
        return i-Math.sqrt(i+2)+f11(n-1,i+4);
    }
    
    private static int f12(int n1,int n2,int i) {
        if(n1*i>=n2) {
        	return 0;
        }
        return n1*i+f12(n1,n2,i+1);
    }
    
    private static int f13(int n) {
        if(n==1) {
        	return 0;
        }
        if(n==2) {
        	return 1;
        }
        return f13(n-2)*f13(n-2)+f13(n-1)*f13(n-1);
    }
    
    
    private static int f132(int n) {
    	if(n==0) {
    		return 0;
    	}
    	return f13(n)+f132(n-1);
    }
    
    private static String f24(char letter1, char letter2) {
    	  if (letter1 > letter2) {
              char temp = letter1;
              letter1 = letter2;
              letter2 = temp;
          }

          // תנאי עצירה: אם הגענו לאות האחרונה, מדפיסים ועוצרים
          if (letter1 == letter2) {
        	  return letter1+"";
          }
             
          return letter1+f24((char)(letter1 + 1), letter2);
          }
      
    
    
    private static String f25(int n, int x) {
    	 if (x > n) {
             return "";
    	 }
         if (n % x == 0) {
             System.out.print(x+ " ");
         }

         return f25(n, x + 1);
    }
    
    private static String f26(int n) {
        if (n == 0) {
            return "";
        }
        int lastDigit = n % 10;

        if (lastDigit % 2 == 0) {
            System.out.print(lastDigit + " ");
        }
        return f26(n / 10);
    }
    
    
    private static String f27(int row, int col) {
        int size = 10; 
        if (row > size) {
            return "";
        }
        System.out.print((row * col) + "\t");
        if (col == size) {
            System.out.println(); 
            return f27(row + 1, 1);
        }
        return f27(row, col + 1);
  
    }
    
    private static String f28(int a1, int d, int n) {
    	if (n <= 0) {
            return "";
        }
        System.out.print(a1 + " ");
        return f28(a1 + d, d, n - 1); 
    }
    
    private static String f29(int c, int d, int count) {
    	if (count <= 0) {
            return ""; 
    	}
        System.out.print(c + " ");
        return f29(c + d, d + 1, count - 1);
    }
    
    private static String f30(int c, int p, int count) {
    	if (count <= 0) {
            return ""; 
        }
        System.out.print(c + " ");
        return f30(p, c + 1, count - 1);
    }
    
    private static String f31(int[] arr, int i) {
    	if (i >= arr.length) {
            return ""; 
        }
        if (i % 2 == 0) {
            System.out.print(arr[i] + " ");
        }
        return f31(arr, i + 1);
    }
    
    private static String f32(int[] arr, int i) {
    	if (i >= arr.length - 1) {
            return "";
        }
        if (arr[i] < arr[i + 1]) {
            System.out.print(arr[i] + " ");
        }
        return f32(arr, i + 1);
    }
    
    public static int sum(int num) {
        if (num == 0) {
            return 0; 
        }
        return (num % 10) + sum(num / 10);
    }
    
    public static int f42(int num) {
        if (num < 10) {
            return num;
        }
        int sumOfDigits = sum(num);
        return f42(sumOfDigits);
    }

    
    
    public static void main(String[] args) {
    	int [] a= {3,3,3,3,3,3,3};
    	System.out.println(f42(200));
    }

}
