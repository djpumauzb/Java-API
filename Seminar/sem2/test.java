package Seminar.sem2;

public class test {
    public static void main(String[] args) {
        int iterations = 100000;

        // Using String
        long startTimeString = System.currentTimeMillis();
        concatenateWithString(iterations);
        long endTimeString = System.currentTimeMillis();
        System.out.println("Time taken with String: " + (endTimeString - startTimeString) + " ms");

        // Using StringBuilder
        long startTimeStringBuilder = System.currentTimeMillis();
        concatenateWithStringBuilder(iterations);
        long endTimeStringBuilder = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder: " + (endTimeStringBuilder - startTimeStringBuilder) + " ms");
    }

    private static void concatenateWithString(int iterations) {
        String result = "";
        for (int i = 0; i < iterations; i++) {
            result += "a";
        }
    }

    private static void concatenateWithStringBuilder(int iterations) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            result.append("a");
        }
    }
}
