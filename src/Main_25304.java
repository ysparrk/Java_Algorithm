import java.io.*;
import java.util.StringTokenizer;
public class Main_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 1. input
        int x = Integer.parseInt(br.readLine()); // 총 금액
        int n = Integer.parseInt(br.readLine()); // 물건 종류 수

        int sum;
        for (int i = 0; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

        }




        bw.flush();
        bw.close();

    }
}
