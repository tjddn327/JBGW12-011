package j7.J7_5;

public class ConditionalSearchExample {
    static class Student {
        String name;
        int score;
        String major;

        Student(String name, int score, String major) {
            this.name = name;
            this.score = score;
            this.major = major;
        }

        @Override
        public String toString() {
            return String.format("%s(%d점, %s)", name, score, major);
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("김철수", 85, "컴퓨터공학"),
                new Student("이영희", 92, "수학"),
                new Student("박민수", 78, "컴퓨터공학"),
                new Student("최지영", 95, "물리학"),
                new Student("홍길동", 88, "컴퓨터공학")
        };

        // 이름으로 학생 찾기
        Student found = findStudentByName(students, "이영희");
        System.out.println("찾은 학생: " + found);

        // 90점 이상인 학생들 찾기
        Student[] highScorers = findStudentsByScore(students, 90);
        System.out.println("\n90점 이상 학생들:");
        for (Student s : highScorers) {
            System.out.println("  " + s);
        }

        // 컴퓨터공학과 학생들 찾기
        Student[] csStudents = findStudentsByMajor(students, "컴퓨터공학");
        System.out.println("\n컴퓨터공학과 학생들:");
        for (Student s : csStudents) {
            System.out.println("  " + s);
        }
    }

    // TODO: 이름으로 학생 찾기 메서드를 작성하세요
    // 메서드명: findStudentByName, 매개변수: Student[] students, String name
    // 반환값: 찾은 Student 객체, 없으면 null
    public static Student findStudentByName(Student[] students, String name) {
        for (Student s : students) {
            if (s.name.equals(name)) {
                return s;
            }
        }
        return null;
    }

    // TODO: 최소 점수 이상인 학생들 찾기 메서드를 작성하세요
    // 메서드명: findStudentsByScore, 매개변수: Student[] students, int minScore
    // 반환값: 조건을 만족하는 Student 배열
    // 힌트: 먼저 조건을 만족하는 학생 수를 세고, 배열을 생성한 후 채우기
    public static Student[] findStudentsByScore(Student[] students, int minScore) {
        // TODO: 먼저 조건을 만족하는 학생 수를 세세요
        int count = 0;
        for (Student s : students) {
            if (s.score >= minScore) {
                count++;
            }
        }

        // TODO: 결과 배열을 생성하세요
        Student[] result = new Student[count];

        // TODO: 조건을 만족하는 학생들을 결과 배열에 추가하세요
        int index = 0;
        for (Student s : students) {
            if (s.score >= minScore) {
                result[index++] = s;
            }
        }

        return result;
    }

    // TODO: 전공으로 학생들 찾기 메서드를 작성하세요
    // 메서드명: findStudentsByMajor, 매개변수: Student[] students, String major
    // 반환값: 해당 전공의 Student 배열
    public static Student[] findStudentsByMajor(Student[] students, String major) {
        // TODO: 조건을 만족하는 학생 수 세기
        int count = 0;
        for (Student s : students) {
            if (s.major.equals(major)) {
                count++;
            }
        }

        // TODO: 결과 배열 생성 및 채우기
        Student[] result = new Student[count];
        int index = 0;
        for (Student s : students) {
            if (s.major.equals(major)) {
                result[index++] = s;
            }
        }

        return result;
    }
}