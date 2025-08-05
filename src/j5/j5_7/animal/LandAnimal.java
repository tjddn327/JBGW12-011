package j5.j5_7.animal;
// 육상 동물 - 여러 인터페이스 확장
public interface LandAnimal extends Animal, Movable, Audible {
    void run();
    void jump();
}