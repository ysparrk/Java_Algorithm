import java.io.*;
import java.util.StringTokenizer;
public class Main_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 1. input
        int n = Integer.parseInt(br.readLine());  // tc 개수

        // 2.
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + (a + b) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
