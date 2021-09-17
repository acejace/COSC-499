
public class launch {
	public static int add(int x, int y) {
		return x+y;
	}
    public static int add(int x, int y, int z){
        return x+y+z;
    }
	public static int multiply(int x, int y) {
		return x*y;
	}
    public static int multiply(int x, int y, int z) {
		return x*y*z;
	}


	public static void main(String[]args){
		int test;
		test = launch.add(10,10); //should return 20
		System.out.println("10 + 10 = " + test);
		test = launch.add(10,10,10); //should return 30
		System.out.println("10 + 10 + 10 = " + test);

		test = launch.multiply(10, 10); //should return 100
		System.out.println("10 x 10 = " + test);
		test = launch.multiply(10, 10, 10); //should return 1000
		System.out.println("10 x 10 x 10 = " + test);
		
	}
}
