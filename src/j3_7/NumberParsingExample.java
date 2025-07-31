package j3_7;

public class NumberParsingExample {
    public static void main(String[] args) {
        System.out.println("=== 숫자 변환 예제 ===");

        String[] testInputs = {"123", "45.67", "abc", "12x", "", "  ", "-789"};

        for (String input : testInputs) {
            System.out.println("\n입력: '" + input + "'");

            // TODO: Integer 변환 시도
            // 힌트: try-catch 구조 사용

            // 여기에 Integer 변환 코드를 작성하세요

            try{
                int num =  Integer.parseInt(input);
                System.out.println("✅ Integer 성공: " + input);
            }catch(NumberFormatException e){
                System.out.println("❌ Integer 실패: For input string: \"" + input + "\"");
            }

            // TODO: Double 변환 시도
            // 힌트: try-catch 구조 사용

            // 여기에 Double 변환 코드를 작성하세요
            try{
                if(input.equals("")){
                    throw new IllegalArgumentException();
                }
                double num = Double.parseDouble(input);
                System.out.println("✅ Double 성공: " + input);
            }catch(NumberFormatException e){
                System.out.println("❌ Double 실패: For input string: \"" + input + "\"");
            }catch(IllegalArgumentException e){
                System.out.println("❌ Double 실패: empty String");
            }
        }
    }
}
