import java.io.BufferedReader;

public class Sample21 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入兩個整數");    
        
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int ans = Math.max(num1, num2);

        System.out.println(num1 +"和"+ num2 +"的最大值是"+ ans);
    }
}
