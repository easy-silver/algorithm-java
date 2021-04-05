package kakao.q2018;

public class SecretMap {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};
        String[] returnArr = new String[n];

        for (int i = 0; i < n; i++) {
            String result = Integer.toBinaryString(arr1[i] | arr2[i]);
            result = String.format("%0" + n + "d", Long.parseLong(result));
            result = result.replace("1", "#");
            result = result.replace("0", " ");
            returnArr[i] = result;
        }
        for (String x : returnArr) {
            System.out.println(x + " ");
        }
    }
}
