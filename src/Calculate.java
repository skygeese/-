import java.util.Random;

public class Calculate {
	static int [] arr=new int[50]; 
	static String [] arr_1=new String[50];
	public static void main(String[] args) {
		printHeader();
		generateEquations();
		printEquations();
		printResult();
		
	}

	private static void printHeader() {
		System.out.print("*************************************************************************\n");
		System.out.print("以下是随机生成的50道100以内的加减法习题：\n");
		System.out.print("*************************************************************************\n");
	}

	private static void generateEquations() {
		Random random = new Random();
		int d=0;
		int a=0,b=0,i;
		String o="";
		boolean f;
		for ( i = 0; i < 50; i++) {
			f=false;
			while(f==false) {
				a = random.nextInt(101);
				b = random.nextInt(101);
				int c = random.nextInt(2);
				if (c==0) {
					o="+";
					d=a+b;
					arr[i]=d;
					arr_1[i]=a+o+b;
					if (d<100) {
						f=true;
					}
					else f = false;
				}
				else if (c==1) {
					o="-";
					d=a-b;
					arr[i]=d;
					arr_1[i]=a+o+b;
					if (d>0) {
						f=true;
					}
					else f=false;
				}
			}
		}
	}

	private static void printEquations() {
		for (int i = 0; i < arr_1.length; i++) {
			System.out.print((i+1)+":"+arr_1[i]+"="+"\t");
			if ((i+1)%5==0) {
				System.out.print("\n");
			}
		}
		
	}

	private static void printResult() {
		
		System.out.print("*************************************************************************\n");
		System.out.print("50道100以内加减法算数题答案：\n");
		System.out.print("*************************************************************************\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+":"+arr[i]+"\t");
			if ((i+1)%5==0) {
				System.out.print("\n");
			}
		}
	}

}
