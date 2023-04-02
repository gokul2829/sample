package sampleproject;

public class Pyramid {
		  public static void main(String[] args) {
		    int rows = 6;

		  for (int i = 1; i <= rows; ++i) {
		    if (i!=3){
		      for (int j = 1; j <= i; ++j) {
		        System.out.print("* ");
		      }
		      System.out.println();
		    }}
		  }
}
