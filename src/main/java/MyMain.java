public class MyMain {
    // This is the example problem that we did in class
    // This uses recursion to calculate the factorial method
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    public static int factorial(int x) {
        // Base case
        if (x == 1) {
            return 1;
        }
        // Recursive call
        else {
            int subproblem = factorial(x-1);
            int answer = x * subproblem;
            return answer;
        }
    }

    // Write a method that uses recursion to calculate the n-th term
    // of the following arithmetic sequence: 3, 5, 7, 9, ...
    // An arithmetic sequence is a sequence where the next number is
    // some set amount larger than the previous number
    // Examples:
    // arithmeticSequence(4) => 9
    // arithmeticSequence(1) => 3
    public static int arithmeticSequence(int n) {
        // Base case
        if(n == 1) {
            return 3;
        }

        // Recursive call
        else {
            int subproblem = arithmeticSequence(n - 1);
            System.out.print(subproblem + " ");
            int answer = 2 + subproblem;
            return answer;
        }
    }

    // Write a method that uses recursion to count the number
    // of times lowercase 'x' shows up in a String
    // Examples:
    // countX("hix") => 1
    // countX("ix") => 1
    // countX("x") => 1
    // countX("") => 0

    // Hint: to make the subproblem smaller, make the String shorter!
    // Hint 2: multiple recursive cases might be helpful!
    public static int countX(String str) {
        // Base case
        if(str.length() == 0) return 0;

            // Recursive call
        else {
            int subproblem = countX(str.substring(1));
            if(str.charAt(0) == 'x') return 1 + subproblem;
            else return subproblem;
        }
    }

    // Methods for homework:
    // Write a method that calculate the exponents, given a base
    // and a power
    // Examples:
    // exponent(2, 5) = 2 * 2 * 2 * 2 * 2 = 32
    // exponent(5, 2) = 5 * 5 = 25
    // exponent(4, 0) = 1
    public static int exponent(int base, int power) {
        // Base case
        if(power == 0) {
            return 1;
        }

        else {
            int subproblem = exponent(base, power - 1);
            return base * subproblem;
        }
    }

    // Write a method that uses recursion to count the number
    // of times "hi" shows up in a String
    // Examples:
    // countHi("hix") => 1
    // countHi("hellohihi") => 2
    public static int countHi(String str) {
        // Base case
        if(str.length() == 1) return 0;

            // Recursive call
        else {
            int subproblem = countHi(str.substring(1));
            if(str.substring(0, 2).equals("hi")) return 1 + subproblem;
            else return subproblem;
        }
    }


    public static void main(String[] args) {
        System.out.println("\n" + arithmeticSequence(10));
        //System.out.println(factorial(5));
    }
}
