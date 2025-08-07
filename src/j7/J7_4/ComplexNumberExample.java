package j7.J7_4;

public class ComplexNumberExample {
    // TODO: 복소수 레코드를 정의하세요
    record Complex(double real, double imaginary) {
        public static final Complex ZERO = new Complex(0, 0);
        public static final Complex ONE = new Complex(1, 0);
        public static final Complex I = new Complex(0, 1);

        // TODO: 실수로부터 복소수 생성하는 생성자를 작성하세요
        public Complex(double real) {
            this(real, 0);
        }

        // TODO: 덧셈 메서드를 작성하세요
        public Complex add(Complex other) {
            return new Complex(this.real + other.real, this.imaginary + other.imaginary);
        }

        // TODO: 뺄셈 메서드를 작성하세요
        public Complex subtract(Complex other) {
            return new Complex(this.real - other.real, this.imaginary - other.imaginary);
        }

        // TODO: 곱셈 메서드를 작성하세요
        public Complex multiply(Complex other) {
            double r = this.real * other.real - this.imaginary * other.imaginary;
            double i = this.real * other.imaginary + this.imaginary * other.real;
            return new Complex(r, i);
        }

        // TODO: 절댓값 메서드를 작성하세요
        public double magnitude() {
            return Math.sqrt(real * real + imaginary * imaginary);
        }

        // TODO: 켤레 복소수 메서드를 작성하세요
        public Complex conjugate() {
            return new Complex(real, -imaginary);
        }

        // TODO: 보기 좋은 문자열 표현 메서드를 작성하세요
        @Override
        public String toString() {
            if (imaginary == 0) return String.format("%.2f", real);
            if (real == 0) return String.format("%.2fi", imaginary);
            if (imaginary < 0) return String.format("%.2f - %.2fi", real, -imaginary);
            return String.format("%.2f + %.2fi", real, imaginary);
        }
    }

    public static void main(String[] args) {
        // TODO: 복소수 객체들을 생성하세요
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, -2);

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);

        // TODO: 연산을 수행하세요
        Complex sum = z1.add(z2);
        Complex diff = z1.subtract(z2);
        Complex prod = z1.multiply(z2);

        System.out.println("\nz1 + z2 = " + sum);
        System.out.println("z1 - z2 = " + diff);
        System.out.println("z1 * z2 = " + prod);

        System.out.println("\n|z1| = " + z1.magnitude());
        System.out.println("z1의 켤레 = " + z1.conjugate());

        // TODO: 복잡한 계산을 수행하세요: (z1 + z2) * I
        Complex result = z1.add(z2).multiply(Complex.I);
        System.out.println("\n(z1 + z2) * i = " + result);

        // TODO: 체인 연산을 수행하세요: (1 + i) * 2 - 1
        Complex chain = new Complex(1, 1).multiply(new Complex(2)).subtract(Complex.ONE);
        System.out.println("(1 + i) * 2 - 1 = " + chain);
    }
}