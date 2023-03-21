import java.io.*;
public class Main_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 1. input
        int n = Integer.parseInt(br.readLine());
        br.close();

        // 2. for문
        int i;
        int ans;
        for (i = 1; i <= 9; i++) { // 1~9까지 반복
            ans = n * i;
            bw.write(n + " * " + i + " = " + ans + "\n");
        }

        bw.flush();
        bw.close();
    }
}
