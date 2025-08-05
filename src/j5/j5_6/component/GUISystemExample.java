package j5.j5_6.component;

import j5.j5_6.simple.SimpleDate;
import org.w3c.dom.Text;

// 테스트
public class GUISystemExample {
    public static void main(String[] args) {
        // TODO 54: GUI 컴포넌트 계층 구조 만들기
        // mainPanel: 0, 0, 800, 600
        // loginForm: 100, 100, 300, 200
        // idField: 10, 10, 200, "아이디 입력"
        // pwField: 10, 50, 200, "비밀번호 입력"
        // loginBtn: 10, 100, "로그인"
        // cancelBtn: 120, 100, "취소"
        System.out.println("=== 초기화면 ===");
        Container ma = new Container(0, 0, 800, 600);
        Container login = new Container(100, 100, 300, 200);
        TextField id = new TextField(10, 10, 200, "아이디 입력");
        TextField pw = new TextField(10, 50, 200, "비밀번호 입력");
        SimpleButton lo = new SimpleButton(10, 100, "로그인");
        SimpleButton ca = new SimpleButton(120, 100, "취소");

        // TODO 55: 계층 구조 구성하기
        // loginForm에 모든 필드와 버튼 추가
        // mainPanel에 loginForm 추가
        login.add(id);
        login.add(pw);
        login.add(lo);
        login.add(ca);
        ma.add(login);

        // TODO 56: 전체 화면 그리기
        ma.draw();

        // TODO 57: 사용자 입력 시뮬레이션하기
        // idField에 "user123" 설정
        // loginBtn 클릭
        System.out.println("\n=== 아이디 입력 ===");
        id.setText("user123");
        System.out.println("\n=== 로그인 버튼 클릭 ===");
        lo.click();
    }
}