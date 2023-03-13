import java.io.*;
import java.util.StringTokenizer;
public class Main_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;
        // 1. while 문 사용
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a + b + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
