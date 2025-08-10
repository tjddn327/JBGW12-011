package j10.j10_5;

import java.util.*;

public class Pair<T, S> {
    private T first;
    private S second;

    // 생성자
    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    // TODO 1: Getter/Setter 작성
    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    // TODO 2: 값을 서로 교환하는 swap 메서드 (Pair<S,T> 반환)
    public Pair<S, T> swap() {
        return new Pair<>(second, first);
    }

    // TODO 3: 첫 번째와 두 번째가 같은지 확인하는 isEqual 메서드
    public boolean isEqual() {
        if (first == null && second == null) return true;
        if (first == null || second == null) return false;
        return first.equals(second);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) obj;
        return Objects.equals(first, pair.first) &&
               Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    // TODO 4: 정적 팩토리 메서드 of
    public static <T, S> Pair<T, S> of(T first, S second) {
        return new Pair<>(first, second);
    }

    public static void main(String[] args) {
        // 다양한 타입의 Pair 테스트
        Pair<String, Integer> nameAge = new Pair<>("김철수", 25);
        Pair<Double, Double> coordinates = new Pair<>(3.14, 2.71);
        Pair<String, String> keyValue = new Pair<>("name", "홍길동");

        System.out.println("이름-나이: " + nameAge);
        System.out.println("좌표: " + coordinates);
        System.out.println("키-값: " + keyValue);

        // swap 테스트
        Pair<Integer, String> swapped = nameAge.swap();
        System.out.println("교환된 값: " + swapped);

        // isEqual 테스트
        System.out.println("keyValue 같은 값? " + keyValue.isEqual());

        Pair<String, String> same = new Pair<>("test", "test");
        System.out.println("same 같은 값? " + same.isEqual());

        // 정적 메서드로 생성
        Pair<Integer, Boolean> numFlag = Pair.of(42, true);
        System.out.println("정적 생성: " + numFlag);

        // 컬렉션에서 Pair 사용 예제
        List<Pair<String, Integer>> scores = Arrays.asList(
            Pair.of("Alice", 95),
            Pair.of("Bob", 87),
            Pair.of("Charlie", 92)
        );

        System.out.println("\n점수 목록:");
        for (Pair<String, Integer> score : scores) {
            System.out.println(score.getFirst() + ": " + score.getSecond() + "점");
        }
    }
}
