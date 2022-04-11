
public class arrayhomework3 {

	public static double[] toPower(int size, int power) {
		double [] returnValue = new double[size];
		for(int i=0; i<size; ++i) {
			returnValue[i] = Math.pow(i,power);
		}
		
		
		return returnValue;
	}
	public static void main(String args[]){
		double[] values = toPower(4,2);
		
		for(double value:values) {
			System.out.println(value);
		}
		

	}

}
