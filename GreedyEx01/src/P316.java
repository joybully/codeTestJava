// https://school.programmers.co.kr/learn/courses/30/lessons/42891?language=java

import java.util.*;

class Food implements Comparable<Food> {
    private int index;
    private int food;

    Food(int index, int food) {
        this.index = index;
        this.food = food;
    }

    public int getIndex() {
        return this.index;
    }

    public int getFood() {
        return this.food;
    }

    @Override
    public int compareTo(Food f) {
        return this.food - f.getFood();
    }

}

class Solution {
    public int solution(int[] food_times, long k) {
        int answer = 0;
        long sum = 0;
        for (int food : food_times) {
            sum += food;
        }
        if (sum <= k) return -1;
        PriorityQueue<Food> pq = new PriorityQueue<Food>();
        int food_length = food_times.length;
        for (int i = 0; i < food_length; i++) {
            Food f = new Food(i + 1, food_times[i]);
            pq.offer(f);
        }
        sum = 0;
        int previous = 0;
        int now = 0;
        int leftFoodLength = food_length;
        while (sum + pq.peek().getFood() * leftFoodLength <= k) {
            now = pq.poll().getFood();
            sum += (now - previous) * leftFoodLength;
            previous = now;
            leftFoodLength--;
        }
        ArrayList<Food> arr = new ArrayList<>();
        while (!pq.isEmpty()) {
            arr.add(pq.poll());
        }
        arr.sort(Comparator.comparing(Food::getIndex));
        answer = arr.get((int) ((k - sum) % leftFoodLength)).getIndex();
        return answer;
    }
}

public class P316 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3, 1, 2}, 5));
    }
}
