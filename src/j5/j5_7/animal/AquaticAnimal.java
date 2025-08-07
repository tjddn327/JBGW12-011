package j5.j5_7.animal;

// 수중 동물
public interface AquaticAnimal extends Animal, Movable {
    void swim();
    void dive(int depth);
}