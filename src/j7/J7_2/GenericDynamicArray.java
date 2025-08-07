package j7.J7_2;

import java.util.Arrays;

public class GenericDynamicArray<T> {
    private Object[] items;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public GenericDynamicArray() {
        items = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // TODO: 요소 추가 메서드를 작성하세요
    public void add(T item) {
        ensureCapacity();
        items[size++] = item;
    }

    // TODO: 특정 위치에 요소 삽입 메서드를 작성하세요
    public void insert(int index, T item) {
        if (index < 0 || index > size) { // index == size도 허용 (맨 뒤에 추가)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity();
        System.arraycopy(items, index, items, index + 1, size - index);
        items[index] = item;
        size++;
    }

    // TODO: 요소 가져오기 메서드를 작성하세요
    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) items[index];
    }

    // TODO: 요소 설정 메서드를 작성하세요
    public void set(int index, T item) {
        checkIndex(index);
        items[index] = item;
    }

    // TODO: 요소 제거 메서드를 작성하세요
    @SuppressWarnings("unchecked")
    public T remove(int index) {
        checkIndex(index);
        T removedItem = (T) items[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(items, index + 1, items, index, numMoved);
        }
        items[--size] = null; // 메모리 누수 방지

        if (size > DEFAULT_CAPACITY && size < items.length / 4) {
            resize(items.length / 2);
        }
        return removedItem;
    }

    // TODO: 크기 반환, 비어있는지 확인, 모든 요소 제거 메서드들을 작성하세요
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public void clear() {
        for (int i = 0; i < size; i++) items[i] = null;
        size = 0;
    }

    // TODO: 용량 확보 메서드를 작성하세요
    private void ensureCapacity() {
        if (size == items.length) {
            resize(items.length * 2);
        }
    }

    // TODO: 크기 조정 메서드를 작성하세요
    private void resize(int newCapacity) {
        System.out.println("배열 크기 조정: " + newCapacity);
        items = Arrays.copyOf(items, newCapacity);
    }

    // TODO: 인덱스 검사 메서드를 작성하세요
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // TODO: toString 메서드를 작성하세요
    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(items[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static void main(String[] args) {
        GenericDynamicArray<String> strings = new GenericDynamicArray<>();
        strings.add("Hello"); strings.add("World"); strings.add("Java");
        System.out.println("문자열 배열: " + strings);
        strings.insert(1, "Beautiful");
        System.out.println("삽입 후: " + strings);
        strings.remove(2);
        System.out.println("제거 후: " + strings);

        GenericDynamicArray<Integer> numbers = new GenericDynamicArray<>();
        for (int i = 1; i <= 15; i++) {
            numbers.add(i * i);
        }
        System.out.println("\n정수 배열: " + numbers);
        System.out.println("5번째 요소: " + numbers.get(4));
        numbers.set(4, 999);
        System.out.println("수정 후: " + numbers);
    }
}