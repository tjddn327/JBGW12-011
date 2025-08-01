package j4.j4_3;

public class ActualParameters {
    static boolean sung = true;
    public static void main(String[] args) {
        System.out.println("=== 실제 매개변수 예제 ===\n");

        // TODO 11: 리터럴 값 전달하기
        calculate(10,20);
        // TODO 12: 변수 전달하기
        int x = 15;
        int y = 25;
        calculate(x,y);

        // TODO 13: 표현식 전달하기
        calculate(x+5,y*2);

        // TODO 14: 메서드 반환값 전달하기
        calculate(getNumber(),getNumber());
        // TODO 15: 복잡한 표현식 전달하기
        calculate(getNumber()*2+2,getNumber()+50);
        calculate(getNumber()*1,getNumber()+28);
    }

    // TODO 16: calculate 메서드 구현하기
    static void calculate(int first, int second) {
        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println();
    }

    // TODO 17: getNumber 메서드 구현하기
    static int getNumber() {
        if(sung){
            sung = false;
            return 20;
        }else{
            sung = true;
            return 2;
        }
    }
}