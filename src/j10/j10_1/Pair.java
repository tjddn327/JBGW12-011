package j10.j10_1;

/**
 * 키-값 쌍을 저장하는 제네릭 클래스
 */
public class Pair<K, V> {
    private K key;
    private V value;
    
    public Pair(K key, V value) {
        // TODO: key와 value 초기화
        this.key = key;
        this.value = value;
    }
    
    public K getKey() {
        // TODO: key 반환
        return key;
    }
    
    public V getValue() {
        // TODO: value 반환
        return value;
    }
    
    public void setValue(V value) {
        // TODO: value 설정
        this.value = value;
    }
    
    @Override
    public String toString() {
        // TODO: "(key, value)" 형식으로 문자열 반환
        return "(" + key + ", " + value + ")";
    }
    
    public static void main(String[] args) {
        Pair<Integer, String> student = new Pair<>(2024001, "김철수");
        Pair<String, Double> product = new Pair<>("노트북", 1500000.0);
        Pair<Integer, Integer> coordinate = new Pair<>(10, 20);
        
        System.out.println("학생: " + student);
        System.out.println("상품: " + product);
        System.out.println("좌표: " + coordinate);
    }
}
