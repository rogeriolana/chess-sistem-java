package chess;

import boardgame.BoardExcepition;

public class ChessException extends BoardExcepition {
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
}
