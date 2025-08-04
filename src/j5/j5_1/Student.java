package j5.j5_1;

/**
 * 학생 클래스 - 성적 관리 시스템
 */
public class Student {
    // Private 필드
    private String studentId;
    private String name;
    private int[] scores;  // 각 과목 점수
    private String[] subjects;  // 과목명

    // 생성자
    public Student(String studentId, String name, String[] subjects) {
        this.studentId = studentId;
        this.name = name;
        this.subjects = subjects;
        this.scores = new int[subjects.length];
    }

    // Getter 메서드
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    // 특정 과목의 점수 가져오기
    public int getScore(String subject) {
        int index = findSubjectIndex(subject);
        if (index != -1) {
            return scores[index];
        }
        return -1;  // 과목을 찾을 수 없음
    }

    // 평균 점수 계산 (계산된 속성)
    public double getAverage() {
        if (scores.length == 0) return 0;

        int sum = 0;
        int count = 0;
        for (int score : scores) {
            if (score > 0) {  // 점수가 입력된 과목만
                sum += score;
                count++;
            }
        }
        return count > 0 ? (double) sum / count : 0;
    }

    // 최고 점수 과목 찾기
    public String getBestSubject() {
        if (subjects.length == 0) return "없음";

        int maxScore = scores[0];
        int maxIndex = 0;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxIndex = i;
            }
        }

        return subjects[maxIndex] + " (" + maxScore + "점)";
    }

    // Setter 메서드 - 점수 설정
    public boolean setScore(String subject, int score) {
        if (score < 0 || score > 100) {
            System.out.println("점수는 0-100 사이여야 합니다.");
            return false;
        }

        int index = findSubjectIndex(subject);
        if (index != -1) {
            scores[index] = score;
            System.out.println(subject + " 과목 점수가 " + score + "점으로 설정되었습니다.");
            return true;
        } else {
            System.out.println(subject + " 과목을 찾을 수 없습니다.");
            return false;
        }
    }

    // 과목 인덱스 찾기 (private 도우미 메서드)
    private int findSubjectIndex(String subject) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].equals(subject)) {
                return i;
            }
        }
        return -1;
    }

    // 성적표 출력
    public void printReport() {
        System.out.println("\n=== 성적표 ===");
        System.out.println("학번: " + studentId);
        System.out.println("이름: " + name);
        System.out.println("\n과목별 성적:");

        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("  %s: %d점\n", subjects[i], scores[i]);
        }

        System.out.printf("\n평균 점수: %.2f점\n", getAverage());
        System.out.println("최고 점수 과목: " + getBestSubject());
    }
}

