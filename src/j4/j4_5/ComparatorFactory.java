package j4.j4_5;

interface Comparator<T> {
    int compare(T a, T b);
}

class Student {
    String name;
    int score;
    int age;

    Student(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String toString() {
        return name + "(점수:" + score + ", 나이:" + age + ")";
    }
}

public class ComparatorFactory {
    public static void main(String[] args) {
        Student[] students = {
                new Student("김철수", 85, 20),
                new Student("이영희", 92, 19),
                new Student("박민수", 78, 21),
                new Student("최지우", 92, 20)
        };

        System.out.println("=== 비교기 생성 예제 ===\n");

        // TODO 39: 이름순 정렬 테스트하기
        sortStudents(students, getNameComparator());
        System.out.println("이름순:");
        printStudents(students);

        // TODO 40: 점수순 정렬 테스트하기 (내림차순)
        sortStudents(students, getScoreComparator(false));
        System.out.println("\n점수순 (높은순):");
        printStudents(students);
    }

    // TODO 41: 이름순 오름차순 비교기 반환
    static Comparator<Student> getNameComparator() {
        return (a, b) -> a.name.compareTo(b.name);
    }

    // TODO 42: 점수순 비교기 반환 (true=오름차순, false=내림차순)
    static Comparator<Student> getScoreComparator(boolean ascending) {
        if (ascending) {
            return (a, b) -> a.score - b.score;
        } else {
            return (a, b) -> b.score - a.score;
        }
    }

    // TODO 43: 버블 정렬로 학생 배열 정렬
    static void sortStudents(Student[] students, Comparator<Student> comp) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (comp.compare(students[j], students[j + 1]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    static void printStudents(Student[] students) {
        for (Student s : students) {
            System.out.println("  " + s);
        }
    }
}
