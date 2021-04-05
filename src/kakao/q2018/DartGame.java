package kakao.q2018;

public class DartGame {
    public static void main(String[] args) {

        String dartResult = "1D2S3T*";
        int answer = 0;

        int[] scores = new int[3];
        int index = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            // 숫자일 때
            if (ch >= 48 && ch <= 57) {
                index++;
                String str = String.valueOf(ch);
                char nextCh = dartResult.charAt(i + 1);
                if (nextCh >= 48 && nextCh <= 57) {
                    str += nextCh;
                    i++;
                }
                scores[index] = Integer.parseInt(str);

            // 영문일 때
            } else if (ch >= 65 && ch <= 88) {
                int pow = ch == 'S' ? 1 : ch == 'D' ? 2 : ch == 'T' ? 3 : 0;
                scores[index] = (int)Math.pow(scores[index], pow);

            // #일 때
            } else if (ch == 35) {
                scores[index] *= -1;

            // *일 때
            } else if (ch == 42) {
                scores[index] *= 2;
                if (index > 0) {
                    scores[index-1] *= 2;
                }
            }
        }

        for (int point : scores) {
            answer += point;
        }
    }
}
