import java.util.Scanner;

public class solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static String catAndMouse(int x, int y, int z)
    {
    	String result="";
    	if (Math.abs(z-y) < Math.abs(z-x))
    	{
    		result = "Cat B";
    	}
    	else if (Math.abs(z-y) > Math.abs(z-x))
    	{
    		result = "Cat A";
    	}
    	else
    	{
    		result = "Mouse C";
    	}
    	
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of queries: ");
		int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Enter x, y, and z: ");
        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);
            System.out.println(result+ " Won");

	}

}
}
