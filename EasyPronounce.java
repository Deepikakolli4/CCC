import java.util.Scanner;

public class EasyPronounce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int j = 0; j < t; j++) {
            int n = input.nextInt();
            String s = input.next();
            int count = 0;
            boolean ishard = false;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                    count = 0;
                } else {
                    count++;
                    if (count >= 4) {
                        ishard = true;
                        break;
                    }
                }
            }
            if (ishard) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
