package j5.j5_7.animal;

/**
 * 동물 행동을 나타내는 인터페이스 계층구조
 */
// 기본 동물 인터페이스
public interface Animal {
    String getName();
    void eat(String food);
    void sleep();
}