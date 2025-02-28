public class PrintingPattern {
    public static void main(String[] args) {
        int n = 5;
        printpattern1(n);
    }

    public static void printpattern1(int n) {
        for (int i = 1; i < n; i++) {
            int num = i;
            int difference = n - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + difference;
                difference--;
            }
            System.out.println();
        }
    }
}
