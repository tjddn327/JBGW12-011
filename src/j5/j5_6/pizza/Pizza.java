package j5.j5_6.pizza;

/**
 * 빌더 패턴을 사용한 복잡한 객체 생성
 */
public class Pizza {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;
    private boolean onions;

    // private 생성자 - 빌더를 통해서만 생성 가능
    private Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
        this.onions = builder.onions;
    }

    // 정적 내부 빌더 클래스
    public static class Builder {
        private String size;
        private boolean cheese = true;  // 기본값
        private boolean pepperoni = false;
        private boolean mushrooms = false;
        private boolean onions = false;

        public Builder(String size) {
            this.size = size;
        }

        public Builder cheese(boolean value) {
            // TODO 58: cheese 설정하고 this 반환하기
            this.cheese = value;
            return this;
        }

        public Builder pepperoni(boolean value) {
            // TODO 59: pepperoni 설정하고 this 반환하기
            this.pepperoni = value;
            return this;
        }

        public Builder mushrooms(boolean value) {
            // TODO 60: mushrooms 설정하고 this 반환하기
            this.mushrooms = value;
            return this;
        }

        public Builder onions(boolean value) {
            // TODO 61: onions 설정하고 this 반환하기
            this.onions = value;
            return this;
        }

        public Pizza build() {
            // TODO 62: new Pizza(this)로 피자 객체 생성하여 반환하기
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        // TODO 63: 피자 정보를 문자열로 반환하기
        // "[size] 피자" + 선택된 토핑들
        // 예: "Large 피자 + 치즈 + 페퍼로니"\
        StringBuilder sb = new StringBuilder(size + " 피자");

        if(cheese) sb.append(" + 치즈");
        if(pepperoni) sb.append(" + 페퍼로니");
        if(mushrooms) sb.append(" + 버섯");
        if(onions) sb.append(" + 양파");

        return sb.toString();
    }
}