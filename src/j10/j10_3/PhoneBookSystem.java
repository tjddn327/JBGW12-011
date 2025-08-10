package j10.j10_3;

import java.util.*;

public class PhoneBookSystem {
    
    private Map<String, String> phoneBook;
    private Map<String, Set<String>> reversePhoneBook;  // 전화번호 -> 이름들
    
    public PhoneBookSystem() {
        this.phoneBook = new TreeMap<>();  // 이름순 정렬
        this.reversePhoneBook = new HashMap<>();
    }
    
    // 전화번호 추가
    public void addContact(String name, String phoneNumber) {
        // 기존 번호가 있으면 역방향 맵에서 제거
        String oldNumber = phoneBook.get(name);
        if (oldNumber != null) {
            Set<String> oldNames = reversePhoneBook.get(oldNumber);
            if (oldNames != null) {
                oldNames.remove(name);
                if (oldNames.isEmpty()) {
                    reversePhoneBook.remove(oldNumber);
                }
            }
        }
        
        // 새 번호 추가
        phoneBook.put(name, phoneNumber);
        reversePhoneBook.computeIfAbsent(phoneNumber, k -> new HashSet<>()).add(name);
    }
    
    // 이름으로 번호 찾기
    public String getNumber(String name) {
        return phoneBook.get(name);
    }
    
    // 번호로 이름 찾기
    public Set<String> getNames(String phoneNumber) {
        return reversePhoneBook.getOrDefault(phoneNumber, Collections.emptySet());
    }
    
    // 이름으로 검색
    public List<Map.Entry<String, String>> searchByName(String prefix) {
        List<Map.Entry<String, String>> results = new ArrayList<>();
        
        // subMap으로 prefix 범위 설정 (prefix ~ prefix + '힣')
        String fromKey = prefix;
        String toKey = prefix + '\uffff';  // '\uffff'는 Unicode에서 가장 큰 문자로 범위를 끝냄
        
        if (phoneBook instanceof TreeMap) {
            SortedMap<String, String> sub = ((TreeMap<String, String>) phoneBook).subMap(fromKey, toKey);
            results.addAll(sub.entrySet());
        }
        
        return results;
    }
    
    // 연락처 삭제
    public boolean removeContact(String name) {
        String phoneNumber = phoneBook.remove(name);
        if (phoneNumber != null) {
            Set<String> names = reversePhoneBook.get(phoneNumber);
            if (names != null) {
                names.remove(name);
                if (names.isEmpty()) {
                    reversePhoneBook.remove(phoneNumber);
                }
            }
            return true;
        }
        return false;
    }
    
    // 전체 목록
    public void printAll() {
        System.out.println("=== 전화번호부 ===");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    // 중복 번호 찾기
    public Map<String, Set<String>> findDuplicateNumbers() {
        Map<String, Set<String>> duplicates = new HashMap<>();
        
        for (Map.Entry<String, Set<String>> entry : reversePhoneBook.entrySet()) {
            if (entry.getValue().size() > 1) {
                duplicates.put(entry.getKey(), entry.getValue());
            }
        }
        
        return duplicates;
    }
    
    public static void main(String[] args) {
        PhoneBookSystem phoneBook = new PhoneBookSystem();
        
        // 연락처 추가
        phoneBook.addContact("김철수", "010-1234-5678");
        phoneBook.addContact("이영희", "010-2345-6789");
        phoneBook.addContact("박민수", "010-3456-7890");
        phoneBook.addContact("김영희", "010-1234-5678");  // 같은 번호
        phoneBook.addContact("정지원", "010-4567-8901");
        phoneBook.addContact("김민준", "010-5678-9012");
        
        // 전체 목록
        phoneBook.printAll();
        
        // 검색
        System.out.println("\n=== '김'으로 시작하는 연락처 ===");
        List<Map.Entry<String, String>> kimContacts = phoneBook.searchByName("김");
        for (Map.Entry<String, String> entry : kimContacts) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // 역방향 검색
        System.out.println("\n=== 010-1234-5678 사용자 ===");
        Set<String> users = phoneBook.getNames("010-1234-5678");
        System.out.println(users);
        
        // 중복 번호
        System.out.println("\n=== 중복 전화번호 ===");
        Map<String, Set<String>> duplicates = phoneBook.findDuplicateNumbers();
        for (Map.Entry<String, Set<String>> entry : duplicates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
