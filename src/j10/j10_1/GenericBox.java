package j10.j10_1;

/**
 * 제네릭 Box 클래스 - 어떤 타입의 객체든 저장 가능
 */
public class GenericBox<T> {
    private T content;

    public void put(T item) {
        // TODO: item을 content에 저장
        this.content = item;
    }

    public T get() {
        // TODO: content를 반환
        return content;
    }

    public boolean isEmpty() {
        // TODO: content가 null인지 확인
        return content == null;
    }

    public static void main(String[] args) {
        // String을 저장하는 Box
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.put("Hello, Generics!");

        // Integer를 저장하는 Box
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.put(42);

        // Person을 저장하는 Box
        GenericBox<Person> personBox = new GenericBox<>();
        personBox.put(new Person("홍길동", 25));

        System.out.println("String Box: " + stringBox.get());
        System.out.println("Integer Box: " + intBox.get());
        System.out.println("Person Box: " + personBox.get());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + "세)";
    }
}
