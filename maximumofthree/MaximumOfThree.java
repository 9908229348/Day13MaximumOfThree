package maximumofthree;

public class MaximumOfThree {
	public static Integer maxOfThree(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		Integer maximum = MaximumOfThree.maxOfThree(112, 193, 254);
		System.out.println("Maximum of three numbers is :" + maximum);
	}
}
