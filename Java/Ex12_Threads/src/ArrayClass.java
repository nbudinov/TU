import java.util.Arrays;

public class ArrayClass {

	int[] array;
	
	public ArrayClass(int arrLen) {
		this.array = new int[arrLen];
		this.fillArray(arrLen);
	}
	
	public synchronized void changeNumbers() {
		for (int i = 0; i < this.array.length; i++) {
			this.array[i] *= 10;
		}
	}
	
	public synchronized void sortArray() {
		Arrays.sort(this.array);
	}
	
	public void fillArray(int arrLen) {
		for(int i = 0; i < arrLen; i++) {
			int randNum = (int)(Math.random() * 1000); 
			this.array[i] = randNum;
		}
	}
	
	
}
