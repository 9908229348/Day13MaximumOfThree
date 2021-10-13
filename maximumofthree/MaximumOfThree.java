package maximumofthree;

public class MaximumOfThree {
	public static Float maxOfThree(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		Float maximum = MaximumOfThree.maxOfThree(1121.5f, 193.3f, 254.4f);
		System.out.println("Maximum of three floats is :" + maximum);
	}
}
