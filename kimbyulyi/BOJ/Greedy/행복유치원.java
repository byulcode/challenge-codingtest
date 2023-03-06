import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 행복유치원
public class Main {

    static int n, k, result;
    static int[] arr;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input1 = br.readLine().split(" ");
        n = Integer.parseInt(input1[0]); // 원생 수
        k = Integer.parseInt(input1[1]); // 나누려는 조 개수

        // 원생들의 키
        String[] input2 = br.readLine().split(" ");
        arr = new int[input2.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }

        // 원생들 키의 차
        for (int i = 1; i < arr.length; i++) {
            list.add(arr[i] - arr[i - 1]);
        }
        Collections.sort(list); // 오름차순
        

        for (int i = 0; i < n - k; i++) {
            result += list.get(i);
        }
        System.out.println(result);
    }
}