package j5.j5_6.message;

// 테스트
public class ChainingExample {
    public static void main(String[] args) {
        // TODO 11: MessageBuilder 객체 생성하기
        MessageBuilder mb = new MessageBuilder();

        // TODO 12: 메서드 체이닝을 사용하여 문자열 구성하기
        // "안녕하세요 여러분!\n오늘은 좋은 날씨입니다."
        // append(), appendWithSpace(), appendLine() 활용
        mb.appendLine("안녕하세요 여러분!");
        mb.append("오늘은");
        mb.appendWithSpace("좋은 날씨입니다.");
        System.out.println(mb);

        // TODO 13: 리셋 후 다시 사용하기
        // "메서드 체이닝은 편리합니다!"
        mb.reset();
        mb.append("메서드 체이닝은 편리합니다.");
        System.out.println(mb);
    }
}