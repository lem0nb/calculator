import java.util.Scanner;
import java.util.StringTokenizer;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("请输入2个数字的计算式(+-*/)");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringTokenizer tk = new StringTokenizer(s,"*-/+",true);
        boolean isComputed = false;
        long result = 0;
        long n1 = Long.parseLong(tk.nextToken().trim());
        String opt = tk.nextToken();
        long n2 = Long.parseLong(tk.nextToken().trim());
        switch (opt) {
            case "*":
                result = n1*n2;
                isComputed = true;
                break;
            case "-":
                result = n1-n2;
                isComputed = true;
                break;
            case "/":
                if (n2==0) {
                    System.out.println("0不能做除数！");
                    break;
                }
                double result_ = (double)n1/n2;
                System.out.println(result_);
                isComputed = true;
                break;
            case "+":
                result = n1+n2;
                isComputed = true;
                break;
        }
        if (isComputed) System.out.println(result);
        else System.out.println("计算错误！");
    }
}
