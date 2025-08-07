package j7.J7_4;

import java.util.HashMap;
import java.util.Map;

public class RecordAsKeyExample {
    // TODO: 체스 좌표 레코드를 정의하세요
    record ChessPosition(char file, int rank) {
        // TODO: 정식 생성자에서 유효성 검증을 작성하세요
        public ChessPosition {
            if (file < 'a' || file > 'h') {
                throw new IllegalArgumentException("파일은 a-h 사이여야 합니다");
            }
            if (rank < 1 || rank > 8) {
                throw new IllegalArgumentException("랭크는 1-8 사이여야 합니다");
            }
        }

        // TODO: toString 메서드를 재정의하세요
        @Override
        public String toString() {
            return "" + file + rank;
        }
    }

    enum ChessPiece { KING("킹"), QUEEN("퀸"), ROOK("룩"), BISHOP("비숍"), KNIGHT("나이트"), PAWN("폰");
        private final String korean;
        ChessPiece(String korean) { this.korean = korean; }
        public String getKorean() { return korean; }
    }

    public static void main(String[] args) {
        // TODO: 체스판을 생성하세요
        Map<ChessPosition, ChessPiece> board = new HashMap<>();

        // TODO: 백색 기물을 배치하세요
        board.put(new ChessPosition('a', 1), ChessPiece.ROOK);
        board.put(new ChessPosition('b', 1), ChessPiece.KNIGHT);
        board.put(new ChessPosition('c', 1), ChessPiece.BISHOP);
        board.put(new ChessPosition('d', 1), ChessPiece.QUEEN);
        board.put(new ChessPosition('e', 1), ChessPiece.KING);
        board.put(new ChessPosition('f', 1), ChessPiece.BISHOP);
        board.put(new ChessPosition('g', 1), ChessPiece.KNIGHT);
        board.put(new ChessPosition('h', 1), ChessPiece.ROOK);

        // TODO: 폰을 배치하세요
        for (char file = 'a'; file <= 'h'; file++) {
            board.put(new ChessPosition(file, 2), ChessPiece.PAWN);
        }

        // TODO: 특정 위치의 기물을 확인하세요
        ChessPosition pos1 = new ChessPosition('e', 1);
        ChessPiece piece = board.get(pos1);
        System.out.println(pos1 + " 위치의 기물: " + piece.getKorean());

        // TODO: equals 테스트를 수행하세요
        ChessPosition pos2 = new ChessPosition('e', 1);
        System.out.println("pos1 == pos2: " + (pos1 == pos2));
        System.out.println("pos1.equals(pos2): " + pos1.equals(pos2));
        System.out.println("같은 위치 조회: " + board.get(pos2).getKorean());

        // TODO: 전체 보드를 출력하세요
        System.out.println("\n=== 체스판 상태 ===");
        for (int rank = 2; rank >= 1; rank--) {
            for (char file = 'a'; file <= 'h'; file++) {
                ChessPiece p = board.get(new ChessPosition(file, rank));
                if (p != null) {
                    System.out.printf("%s: %-3s ", "" + file + rank, p.getKorean());
                }
            }
            System.out.println();
        }
    }
}