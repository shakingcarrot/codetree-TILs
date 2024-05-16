import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        int len = str.length();
        for(int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if(c == '(') {
                stack.push(c);
            }
            else if(c == ')') {
                if(stack.isEmpty()) {
                    System.out.println("No");
                    break;
                }else{
                    stack.pop();
                }

            }
        }
        if(!stack.isEmpty()) {
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}