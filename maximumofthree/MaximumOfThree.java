package maximumofthree;

public class MaximumOfThree<T extends Comparable<T>> {
	T[] array;

	public MaximumOfThree(T[] array) {
			this.array = array;
		}

	public T testMaximum() {
		return MaximumOfThree.testMaximum(array);
	}

	public static <T extends Comparable<T>> T testMaximum(T[] array) {
		for (int i = 0; i < 4; i++) {
			for (int j = i; j < 4; j++) {
				if (array[i].compareTo(array[j]) < 0) {
					T a = array[i];
					array[i] = array[j];
					array[j] = a;
				}
			}
		}
		System.out.println("Maximum is :"+ array[0]);
		return array[0];
	}
	
	public static void main(String[] args) {
		Integer[] arrInt = {12,43,5,63};
		Float[] arrFloat = {1.2f,445.6f,87.4f,21.3f};
		String[] arrString = {"Apple","Banana","Peach","Carrot"};
		new MaximumOfThree<Integer>(arrInt).testMaximum();
		new MaximumOfThree<Float>(arrFloat).testMaximum();
		new MaximumOfThree<String>(arrString).testMaximum();
	}
}
