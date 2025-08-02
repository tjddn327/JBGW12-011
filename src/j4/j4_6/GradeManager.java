package j4.j4_6;

// TODO 35: import문 추가하기
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// TODO 36: 클래스에 상세한 Javadoc 주석 작성하기
/**
 * 성적을 관리하는 클래스입니다.
 * <p>
 * <ul>
 *   <li>점수 추가</li>
 *   <li>평균 계산</li>
 *   <li>학점 산출</li>
 * </ul>
 *
 * <p>사용 예제:
 * <pre>
 * GradeManager gm = new GradeManager();
 * gm.addScore(90);
 * gm.addScore(80);
 * double avg = gm.getAverage();
 * char grade = gm.getLetterGrade();
 * </pre>
 *
 * @author 김성우
 * @version 1.0
 * @see java.util.ArrayList
 */
public class GradeManager {
    private ArrayList<Integer> scores;

    // TODO 37: 생성자에 Javadoc 주석 작성하기
    /**
     * GradeManager 객체를 생성하고 점수 리스트를 초기화합니다.
     */
    public GradeManager() {
        scores = new ArrayList<>();
    }

    // TODO 38: addScore 메서드에 Javadoc 주석 작성하기
    /**
     * 점수를 추가합니다.
     *
     * @param score 0부터 100까지의 점수
     * @throws IllegalArgumentException 점수가 범위를 벗어날 경우 발생
     */
    public void addScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException(
                    "점수는 0과 100 사이여야 합니다: " + score);
        }
        scores.add(score);
    }

    // TODO 39: getAverage 메서드에 Javadoc 주석 작성하기
    /**
     * 저장된 점수들의 평균을 반환합니다.
     *
     * @return 평균값, 점수가 없으면 0.0
     */
    public double getAverage() {
        if (scores.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.size();
    }

    // TODO 40: getLetterGrade 메서드에 상세한 Javadoc 주석 작성하기
    /**
     * 평균 점수를 기반으로 학점을 반환합니다.
     * <p>학점 기준:
     * <ul>
     *   <li>90 이상: A</li>
     *   <li>80 이상 90 미만: B</li>
     *   <li>70 이상 80 미만: C</li>
     *   <li>60 이상 70 미만: D</li>
     *   <li>60 미만: F</li>
     * </ul>
     *
     * @return 학점 문자
     * @see #getAverage()
     */
    public char getLetterGrade() {
        double avg = getAverage();
        if (avg >= 90) return 'A';
        if (avg >= 80) return 'B';
        if (avg >= 70) return 'C';
        if (avg >= 60) return 'D';
        return 'F';
    }
}