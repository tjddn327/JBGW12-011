package j4.j4_6;

// TODO 1: 필요한 클래스들을 개별적으로 import하기
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class BasicImportExample {
    public static void main(String[] args) {
        // TODO 2: Scanner 객체 생성하고 사용자 이름 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        // TODO 3: Random 객체로 1~100 사이의 행운의 숫자 생성하기
        Random random = new Random();
        int luckyNumber = random.nextInt(100) + 1;  // 1~100

        // TODO 4: ArrayList 생성하고 취미 3개 추가하기
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("독서");
        hobbies.add("운동");
        hobbies.add("요리");

        // TODO 5: 결과 출력하기
        System.out.println(name + "님의 행운의 숫자는 " + luckyNumber + "입니다.");
        System.out.println("취미: " + hobbies);

        scanner.close();
    }
}
