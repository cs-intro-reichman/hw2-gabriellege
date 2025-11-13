// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
		int steps = 1;
		boolean isVMode = mode.equals("v"); 
		
        for (int seed = 1; seed <= N; seed++) {
            int current = seed;

            if (isVMode) {
                System.out.print(current + " ");
            }

            do {
                if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = 3 * current + 1;
                }

                steps++;

                if (isVMode) {
                    System.out.print(current + " ");
                }
            }while (current != 1);

            if (isVMode) {
                System.out.println("(" + steps + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
