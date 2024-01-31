package ch09.resolve07;

public class Resolve3_ArrayUtility {
	public static double[] intToDouble(int[] source){
		double[] doubleArr = new double[source.length];
		for(int i=0; i<source.length; i++) {
			doubleArr[i] = (double)source[i];
		}
		return doubleArr;
	}
	public static int[] doubleToInt(double[] source){
		int[] intArr = new int[source.length];
		for(int i=0; i<source.length; i++) {
			intArr[i] = (int)source[i];
		}
		return intArr;
	}
}
