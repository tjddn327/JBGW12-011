package j4.j4_3;

public class ArraySearch {
    static String[] names = {"김철수", "이영희", "박민수", "최지우", "정민호"};
    static int[] scores = {85, 92, 78, 95, 88};

    public static void main(String[] args) {
        System.out.println("=== 배열 검색과 수정 ===\n");



        // TODO 47: 배열 출력하기
        System.out.println("학생 성적:");
        printStudents(names, scores);

        // TODO 48: 검색 예제 실행하기
        System.out.println("\n=== 검색 ===");
        String searchName = "박민수";
        findStudent(names, searchName);

        // TODO 49: 특정 점수 이상 학생 찾기
        System.out.println("\n90점 이상 학생:");
        findScoresAbove(scores, 90);

        // TODO 50: 배열 수정하기
        System.out.println("\n=== 점수 수정 ===");

        updateScore(names, scores, searchName, 85);

        // TODO 51: 전체 점수 조정하기
        System.out.println("\n=== 가산점 부여 ===");
        System.out.println("5점 가산 후:");
        addBonus(scores, 5);
    }

    // TODO 52: 학생 정보 출력 메서드 구현하기
    static void printStudents(String[] names, int[] scores) {
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i] + ": " + scores[i] + "점");
        }
    }

    // TODO 53: 학생 검색 메서드 구현하기
    static int findStudent(String[] names, String target) {
        for(int i = 0; i < names.length; i++){
            if(names[i].equals(target)){
                System.out.println(target + "의 점수: " + scores[i]);
            }
        }
        return 0;
    }

    // TODO 54: 특정 점수 이상 학생들의 인덱스 찾기 메서드 구현하기
    static int[] findScoresAbove(int[] scores, int threshold) {
        for(int i = 0; i < scores.length; i++){
            if(scores[i] >= threshold){
                System.out.println(names[i] + ": " + scores[i] + "점");
            }
        }
        return null;
    }

    // TODO 55: 점수 업데이트 메서드 구현하기
    static void updateScore(String[] names, int[] scores, String name, int newScore) {
        for(int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                System.out.printf("%s의 점수가 %d에서 %d로 변경되었습니다.\n", name, scores[i], newScore);
                scores[i] = newScore;
            }
        }
        System.out.println("수정 후:");
        for(int j = 0; j < names.length; j++){
            System.out.println(names[j] + ": " + scores[j] + "점");
        }

    }

    // TODO 56: 가산점 부여 메서드 구현하기
    static void addBonus(int[] scores, int bonus) {
        for(int i = 0; i < scores.length; i++){
            scores[i] += bonus;
        }
        for(int j = 0; j < names.length; j++){
            System.out.println(names[j] + ": " + scores[j] + "점");
        }
    }
}