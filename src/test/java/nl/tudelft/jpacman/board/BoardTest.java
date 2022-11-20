package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Basic implementation of unit.
 *
 * @author Jeroen Roosen 
 */
public class BoardTest {
    private Square[][] grid;
    private Board board;

    private final Square square = new BasicSquare();

    /**
     * basicSquare.
     */
    @Test
    void basicSquare() {
        grid = new Square[][]{{ square, square}};
        board = new Board(grid);
        assertThat(board.invariant()).isEqualTo(true);
    }

    /**
     * testSquareAt2.
     */
    @Test
    void testSquareAt2() {
        grid = new Square[][]{
            {square, square}
        };
        board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isEqualTo(square);
    }


}
