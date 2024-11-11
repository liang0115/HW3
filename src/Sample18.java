import java.io.BufferedReader;

public class Sample18 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入英文字母");
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String str = br.readLine();
        
        String stru = str.toUpperCase();
        String strl = str.toLowerCase();

        System.out.println("大寫字母是" + stru);
        System.out.println("小寫字母是" + strl);
    }
}
