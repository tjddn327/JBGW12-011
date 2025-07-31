package j3_6;

enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class WeeklySchedule {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.FRIDAY;

        System.out.println("오늘은 " + getDayNameInKorean(today) + "입니다.");

        // TODO: 요일별 활동 추천 switch문
        // 힌트: switch-case 사용

        // 여기에 코드를 작성하세요
        System.out.println("=== 활동 추천 ===");
        switch (DayOfWeek.valueOf(today.toString())) {
            case MONDAY -> {System.out.println("평일 싫어");}
            case TUESDAY -> {System.out.println("화요일 싫어");}
            case WEDNESDAY -> {System.out.println("수요일 싫어");}
            case THURSDAY -> {System.out.println("목요일 싫어");}
            case FRIDAY -> {System.out.println("\uD83C\uDF89 한 주 마무리하기\n\uD83D\uDCCA 주간 성과 정리\n\uD83C\uDF55 팀과 함께 저녁 식사");}
            case SATURDAY -> {System.out.println("주말 좋아");}

            default -> throw new IllegalStateException("Unexpected value: " + today);
        }

        // TODO: 업무일/휴일 구분
        // 힌트: switch 표현식
        boolean isWorkday = switch (DayOfWeek.valueOf(today.toString())){
            case MONDAY -> true;
            case TUESDAY -> true;
            case WEDNESDAY -> true;
            case THURSDAY -> true;
            case FRIDAY -> true;
            case SATURDAY -> false;
            case SUNDAY -> false;
            default -> false;
        };
        // 여기에 switch 표현식을 작성하세요

                System.out.println(isWorkday ? "평일입니다." : "주말입니다.");
    }

    public static String getDayNameInKorean(DayOfWeek day) {
        // TODO: switch 표현식으로 한국어 요일 명 반환
        // 힌트: -> 연산자
        return switch (day){
            case MONDAY -> "월요일";
            case TUESDAY -> "화요일";
            case WEDNESDAY -> "수요일";
            case THURSDAY -> "목요일";
            case FRIDAY -> "금요일";
            case SATURDAY -> "토요일";
            case SUNDAY -> "일요일";
        }; // 여기에 switch 표현식을 작성하세요
    }
}
