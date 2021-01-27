package genericpractice1;

public class Maximumcheck {
	//UC2 Find The Maximum of 3 Strings
	
	public String maximumValue(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		} if (z.compareTo(max) > 0) {
			max = z;
		} 
		System.out.println(max +" is Maximum");
		return max;
	}
}