package j4.j4_2;

public class GradeManager {
    // TODO 43: 멤버 변수들 선언하기
    // MAX_STUDENTS (상수, 30), names (문자열 배열),
    // scores (정수 배열), studentCount (정수)
    static int MAX_STUDENTS = 30;
    static String[] names = new String[MAX_STUDENTS];
    static int[] scores = new int[MAX_STUDENTS];
    static int studentCount = 0;

    public static void main(String[] args) {
        System.out.println("=== 성적 관리 프로그램 ===");

        // TODO 44: 샘플 학생들 추가하고 테스트하기
         addStudent("김철수", 85);
         addStudent("이영희", 92);
         addStudent("박민수", 78);
         addStudent("최유진", 88);
         addStudent("정하늘", 95);

         showAllStudents();
         showStatistics();
         findStudent("이영희");
         findStudent("홍길동"); // 없는 학생
    }

    // TODO 45: 학생 추가 메서드 구현하기
    public static void addStudent(String name, int score) {
        // studentCount가 MAX_STUDENTS 이상이면 "더 이상 학생을 추가할 수 없습니다." 출력하고 return
        // score가 0~100 범위를 벗어나면 "점수는 0~100 사이여야 합니다." 출력하고 return
        // names와 scores 배열에 정보 저장
        // studentCount 증가
        // "학생이 추가되었습니다." 출력
        if(studentCount >= MAX_STUDENTS) {
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
            return;
        }
        if(score < 0 || score > 100){
            System.out.println("점수는 0~100 사이여야 합니다.");
            return;
        }
        names[studentCount] = name;
        scores[studentCount] = score;
        studentCount++;
    }

    // TODO 46: 전체 학생 조회 메서드 구현하기
    public static void showAllStudents() {
        // studentCount가 0이면 "등록된 학생이 없습니다." 출력하고 return
        // 표 형태로 학생 정보 출력 (번호, 이름, 점수, 학점)
        if(studentCount == 0){
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        System.out.println("=== 전체 학생 목록 ===\n" +
                "번호\t이름\t점수\t학점\n" +
                "------------------------------");
        for(int i = 0; i < studentCount; i++){
            System.out.println(i+1 + "\t" + names[i] + "\t" + scores[i] + "\t" + getGrade(scores[i]));
        }
    }

    // TODO 47: 통계 보기 메서드 구현하기
    public static void showStatistics() {
        // studentCount가 0이면 "등록된 학생이 없습니다." 출력하고 return
        // 학생 수, 평균 점수, 최고 점수, 최저 점수 계산하여 출력
        if(studentCount == 0){
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        double sum = 0.0;
        for(int i = 0; i < studentCount; i++){
            sum += scores[i];
        }

        double max = scores[0];
        for(int i = 0; i < studentCount; i++){
            if(scores[i] > max){
                max = scores[i];
            }
        }

        double min = scores[0];
        for(int i  = 0; i < studentCount; i++){
            if(scores[i] < min){
                min = scores[i];
            }
        }

        System.out.println("\n=== 성적 통계 ===\n" +
                "학생 수: " + studentCount + "\n" +
                "평균 점수: " + sum/studentCount + "\n" +
                "최고 점수: " + (int)max + "\n" +
                "최저 점수: " + (int)min);
    }

    // TODO 48: 학생 검색 메서드 구현하기
    public static void findStudent(String searchName) {
        // 이름으로 학생 검색
        // 찾으면 학생 정보 출력, 못 찾으면 "학생을 찾을 수 없습니다." 출력

        System.out.println("\n=== 검색 결과 ===");
        for(int i = 0; i < studentCount; i++) {
            if (names[i].equals(searchName)) {
                System.out.println("이름: " + searchName);
                System.out.println("점수: " + scores[i]);
                System.out.println("학점: " + getGrade(scores[i]));
                break;
            }else if(i == studentCount-1 && !names[studentCount-1].equals(searchName)){
                System.out.println("학생을 찾을 수 없습니다.");
            }
        }

    }

    // TODO 49: 학점 계산 메서드 구현하기
    public static String getGrade(int score) {
        // 90 이상: A, 80 이상: B, 70 이상: C, 60 이상: D, 60 미만: F
        switch (score/10) {
            case 9,10 -> {
                return "A";
            }
            case 8 -> {
                return "B";
            }
            case 7 -> {
                return "C";
            }
            case 6 -> {
                return "D";
            }
            default -> {
                return "F";
            }
        }
    }
}