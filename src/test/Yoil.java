package test;

public class Yoil {
    public static void main(String[] args) {
        solution(6, 1);
        solution(6, 25);
    }

    public static int[] solution(int day, int k) {
        int[] answer = new int[12];
        int[] countOfDaysInEachMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 시작 요일
        int dayOfWeek = day;

        // 첫 번째 요일 구하기
        if (k - 1 > 0) {
            int mod = (k-1) % 7;
            dayOfWeek = day + mod;
            if (dayOfWeek > 7) {
                dayOfWeek -= 7;
            }
        }

        for (int i = 0; i < answer.length; i++) {

            if (i != 0) {
                int mod = countOfDaysInEachMonth[i-1] % 7;
                dayOfWeek = dayOfWeek + mod;
                if (dayOfWeek > 7) {
                    dayOfWeek -= 7;
                }
            }

            if (dayOfWeek == 5 || dayOfWeek == 6) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();

        return answer;
    }
}
