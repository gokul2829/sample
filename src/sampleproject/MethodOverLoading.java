package sampleproject;

public class MethodOverLoading {

	public int methodadd(int a ,int b ,int c) {
		int d;
		d=a+b+c;
		return d;
		}

	public String methodadd(String a ,String b) {
		String c= a.concat(b);
		return c;
		}

	public static void main(String[] args) {
		
		MethodOverLoading obj01 = new MethodOverLoading();
		System.out.println(obj01.methodadd(34,41,89));
		System.out.println(obj01.methodadd("Google ","Chrome"));
	}

		}

