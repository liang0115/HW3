import java.io.BufferedReader;

public class Sample19 {
    public static void main(String[] args) throws Exception {
        System.out.println("請輸入字串");    
        
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String str1 = br.readLine();

        System.out.println("請輸入要檢索的字元");
    
        String str2 = br.readLine();
        char ch1 = str2.charAt(0);

        int num = str1.indexOf(ch1);

        if(num != -1)
        {
            System.out.println(str1 +"的第" + (num+1) + "個字就是「"+ ch1 +"」");
        }
        else
            System.out.println(str1 +"中沒有「"+ ch1 +"」這個字");
    }
}
