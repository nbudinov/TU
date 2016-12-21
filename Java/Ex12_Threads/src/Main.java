public class Main {

	public static void main(String[] args) {

		ArrayClass arrObj = new ArrayClass(10);
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				arrObj.changeNumbers();
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				arrObj.sortArray();
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		for (int i = 0; i < arrObj.array.length; i++) {
			System.out.println(arrObj.array[i]);
		}	
	}
}
