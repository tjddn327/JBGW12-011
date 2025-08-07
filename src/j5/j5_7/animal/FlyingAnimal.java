package j5.j5_7.animal;

// 날 수 있는 동물
public interface FlyingAnimal extends Animal, Movable {
    void fly();
    void land();
    int getAltitude();
}