package j5.j5_8.simple;

// 테스트
class ListTest {
    public static void main(String[] args) {
        // TODO 46: SimpleLinkedList 생성하고 요소 추가하기
        // "첫번째", "두번째", "세번째" 추가
        SimpleLinkedList<String> list = new SimpleLinkedList<>();
        list.add("첫번째");
        list.add("두번째");
        list.add("세번째");

        // TODO 47: 초기 리스트 출력하기
        System.out.println("초기 리스트: " + list);

        // TODO 48: 반복자로 순회하며 "두번째" 뒤에 "새로운" 삽입하기
        // ListIterator 사용
        // hasNext()와 next()로 순회
        // "두번째"를 찾으면 insert() 호출

        SimpleLinkedList<String>.ListIterator it = list.iterator();
        while (it.hasNext()) {
            String element = it.next();
            System.out.println("요소: " + element);
            if ("두번째".equals(element)) {
                it.insert("새로운");
            }
        }

        // TODO 49: 수정된 리스트 출력하기
        System.out.println("수정된 리스트: " + list);
    }
}
