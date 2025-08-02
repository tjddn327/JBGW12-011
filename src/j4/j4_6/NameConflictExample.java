package j4.j4_6;

// TODO 11: java.util 패키지만 import하기 (java.awt는 주석)
// import java.awt.List; // 주석 처리함
import java.util.List;
import java.util.ArrayList;

public class NameConflictExample {
    public static void main(String[] args) {
        // TODO 12: java.util.List 사용하기
        List<String> utilList = new ArrayList<>();
        utilList.add("Java");
        utilList.add("Python");

        // TODO 13: java.awt.List를 전체 이름으로 사용하기
        java.awt.List awtList = new java.awt.List();
        awtList.add("Item1");
        awtList.add("Item2");

        // TODO 14: 결과 출력하기
        System.out.println("util.List: " + utilList);
        System.out.println("awt.List 항목 수: " + awtList.getItemCount());
    }
}
