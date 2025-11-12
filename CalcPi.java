// Computes an approximation of PI.
public class CalcPi {
    public static void main(String[] args) { 
        int number = Integer.parseInt(args[0]);
        double sum = 1.0;
        int currentIndex = 3;
        boolean plus = false;

        for (int i = 1; i < number; i++) {
            if (plus) {
                sum += 1.0 / currentIndex;
                plus = false;
            } else {
                sum -= 1.0 / currentIndex;
                plus = true;
            }
            currentIndex += 2;
        }

        double approxPi = 4 * sum;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + approxPi);
    }
}