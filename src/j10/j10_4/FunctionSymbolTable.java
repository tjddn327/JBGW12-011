package j10.j10_4;

import java.util.*;

public class FunctionSymbolTable {

    // 함수 정보를 담는 클래스
    static class FunctionInfo {
        String name;
        List<String> parameters;
        String body;

        FunctionInfo(String name, List<String> parameters, String body) {
            this.name = name;
            this.parameters = parameters;
            this.body = body;
        }

        @Override
        public String toString() {
            return String.format("function %s(%s) { %s }", 
                name, String.join(", ", parameters), body);
        }
    }

    private Map<String, FunctionInfo> functions;

    public FunctionSymbolTable() {
        functions = new HashMap<>();

        // 기본 함수 정의
        defineFunction("abs", Arrays.asList("x"), 
                      "return x < 0 ? -x : x");
        defineFunction("max", Arrays.asList("a", "b"), 
                      "return a > b ? a : b");
    }

    // 함수 정의
    public void defineFunction(String name, List<String> params, String body) {
        // TODO 9: 같은 이름 함수 있는지 확인
        if (functions.containsKey(name)) {
            // TODO 10: 경고 메시지 출력
            System.out.println("경고: 함수 [" + name + "] 재정의");
        }

        // TODO 11: FunctionInfo 객체 생성 및 저장
        FunctionInfo func = new FunctionInfo(name, params, body);
        functions.put(name, func);
    }

    // 함수 호출
    public void callFunction(String name, List<Double> arguments) {
        // TODO 12: 함수 정보 가져오기
        FunctionInfo func = functions.get(name);

        // TODO 13: 함수 없으면 예외
        if (func == null) {
            throw new RuntimeException("정의되지 않은 함수: " + name);
        }

        // TODO 14: 매개변수 개수와 인자 개수 비교
        if (func.parameters.size() != arguments.size()) {
            throw new RuntimeException(
                String.format("인자 개수 불일치: 함수 %s는 %d개 필요, %d개 받음",
                name, func.parameters.size(), arguments.size())
            );
        }

        // TODO 15: 호출 정보 출력
        System.out.println("함수 호출: " + name + arguments);
        System.out.println("함수 본문: " + func.body);
    }

    // 모든 함수 목록
    public void listFunctions() {
        System.out.println("정의된 함수:");
        TreeMap<String, FunctionInfo> sorted = new TreeMap<>(functions);
        for (FunctionInfo func : sorted.values()) {
            System.out.println("  " + func);
        }
    }

    public static void main(String[] args) {
        FunctionSymbolTable table = new FunctionSymbolTable();

        // 함수 정의
        table.defineFunction("square", Arrays.asList("x"), 
                           "return x * x");
        table.defineFunction("add", Arrays.asList("a", "b"), 
                           "return a + b");

        // 함수 목록
        table.listFunctions();

        // 함수 호출
        System.out.println("\n함수 호출:");
        table.callFunction("square", Arrays.asList(5.0));
        table.callFunction("add", Arrays.asList(3.0, 4.0));

        try {
            table.callFunction("unknown", Arrays.asList(1.0));
        } catch (RuntimeException e) {
            System.err.println("오류: " + e.getMessage());
        }
    }
}
