package Day2;

public class RunningNumberSum1 {
    public static void main(String[] args) {
        int lowerbound = 9;
        int upperbound = 899;
        int sum = 0;
        int num = lowerbound;

        while (num <= upperbound){
            sum = sum + num;
            ++num;
        }
        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
    }
}
