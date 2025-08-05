package j5.j5_7.read;

// 구현 예제 2: 별 패턴 생성기
public class StarPattern implements Readable {
    private int currentLine = 0;
    private int currentPos = 0;
    private final int maxLines = 5;

    @Override
    public char readChar() {
        // TODO 35: 별 패턴 문자 생성하기
        // currentLine >= maxLines이면 '\0' 반환
        // currentPos <= currentLine이면:
        //   currentPos 증가하고 '*' 반환
        // 아니면:
        //   currentPos = 0, currentLine 증가하고 '\n' 반환
        if(currentLine >= maxLines){
            return '\0';
        }
        if(currentPos <= currentLine){
            currentLine++;
            return '*';
        }else{
            currentPos = 0;
            currentLine++;
            return '\n';
        }
    }
}