import java.io.BufferedReader;
import java.io.IOException;

public class Sample16 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入一個整數");
        
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        String str = br.readLine();

        int num = Integer.parseInt(str);

        System.out.println("您輸入的整數是" + num);
    }
}
