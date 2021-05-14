package test;

public class Locker {
    public static void main(String[] args) {
        System.out.println(solution("82195", "64723"));
        System.out.println(solution("00000000000000000000", "91919191919191919191"));

    }

    public static int solution(String p, String s) {
        int answer = 0;
        int gap, left, right;

        for (int i = 0; i < p.length(); i++) {
            left = Character.getNumericValue(p.charAt(i));
            right = Character.getNumericValue(s.charAt(i));
            gap = Math.abs(left - right);
            if (gap > 5) {
                System.out.println("gap more than 5");
                int min = Math.min(left, right);
                System.out.println("left = " + left);
                right = Math.max(left, right);
                left = min + 10;
                System.out.println("right = " + right);
                gap = left - right;
            }

            System.out.println("gap = " + gap);
            answer += gap;
        }


        return answer;
    }
}
