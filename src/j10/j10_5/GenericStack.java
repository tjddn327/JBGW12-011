package j10.j10_5;

import java.util.*;

public class GenericStack<T> {
    // 내부 ArrayList로 스택 구현
    private ArrayList<T> items;

    // 기본 생성자
    public GenericStack() {
        items = new ArrayList<>();
    }

    // 용량 지정 생성자
    public GenericStack(int initialCapacity) {
        items = new ArrayList<>(initialCapacity);
    }

    // TODO 1: 스택에 요소 추가 (push)
    public void push(T item) {
        items.add(item);
    }

    // TODO 2: 스택에서 요소 제거 (pop)
    public T pop() {
        if (items.isEmpty()) {
            throw new EmptyStackException();
        }
        return items.remove(items.size() - 1);
    }

    // TODO 3: 스택 최상단 요소 확인 (peek)
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items.get(items.size() - 1);
    }

    // 스택이 비어있는지 확인
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // 스택 크기 반환
    public int size() {
        return items.size();
    }

    // TODO 4: 특정 요소 검색, 스택에서 위치 반환 (1부터 시작)
    public int search(T item) {
        for (int i = items.size() - 1; i >= 0; i--) {
            if (item == null) {
                if (items.get(i) == null) {
                    return items.size() - i;
                }
            } else if (item.equals(items.get(i))) {
                return items.size() - i;
            }
        }
        return -1;
    }

    // TODO 5: 스택 복사(얕은 복사)
    public GenericStack<T> copy() {
        GenericStack<T> newStack = new GenericStack<>();
        newStack.items = new ArrayList<>(this.items);
        return newStack;
    }

    @Override
    public String toString() {
        return "Stack" + items.toString();
    }

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();

        // 요소 추가
        stack.push("bottom");
        stack.push("middle");
        stack.push("top");

        System.out.println("스택: " + stack);
        System.out.println("크기: " + stack.size());

        // peek과 pop 테스트
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("스택: " + stack);

        // 검색 테스트
        System.out.println("'middle' 위치: " + stack.search("middle"));
        System.out.println("'bottom' 위치: " + stack.search("bottom"));
        System.out.println("'없음' 위치: " + stack.search("없음"));

        // 스택 복사 테스트
        GenericStack<String> copied = stack.copy();
        System.out.println("복사된 스택: " + copied);
    }
}
