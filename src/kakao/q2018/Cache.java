package kakao.q2018;

import java.util.LinkedList;
import java.util.Queue;

public class Cache {
    public static void main(String[] args) {

        int cacheSize = 0;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        int answer = 0;

        // 캐시 사용
        if (cacheSize > 0) {
            Queue<String> que = new LinkedList<>();

            for (String city : cities) {
                city = city.toLowerCase();

                if (que.contains(city)) {
                    que.remove(city);
                    que.offer(city);
                    answer += 1;
                } else {
                    if (que.size() >= cacheSize) {
                        que.poll();
                    }
                    que.offer(city);
                    answer += 5;
                }
            }

        // 캐시 미사용
        } else {
            answer = cities.length * 5;
        }

        System.out.println("answer = " + answer);

    }
}
