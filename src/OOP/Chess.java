package OOP;

import java.util.ArrayList;

public class Chess {
}

class ChessPieceTurn {
};

class GameManager {
    void processTurn(PlayerBase player) {
    }

    ;

    boolean acceptTurn(ChessPieceTurn turn) {
        return true;
    }

    ;
    Position currentPosition;
}

abstract class PlayerBase {
    abstract ChessPieceTurn getTurn(Position p);
}

class ComputerPlayer extends PlayerBase {
    public ChessPieceTurn getTurn(Position p) {
        return null;
    }

    public void setDifficulty() {
    }

    ;
    public PositionEstimator estimater;
    public PositionBackTracker backtracter;
}

class HumanPlayer extends PlayerBase {
    public ChessPieceTurn getTurn(Position p) {
        return null;
    }
}

abstract class ChessPieceBase {
    abstract boolean canBeChecked();

    abstract boolean isSupportCastle();
}

class King extends ChessPieceBase {
    boolean canBeChecked() {
        return false;
    }

    boolean isSupportCastle() {
        return false;
    }
}

class Queen extends ChessPieceBase {
    boolean canBeChecked() {
        return false;
    }

    boolean isSupportCastle() {
        return false;
    }
}

class Position {
    // represents chess positions in compact form
    ArrayList<ChessPieceBase> black;
    ArrayList<ChessPieceBase> white;
}

class PositionBackTracker {
    static Position getNext(Position p) {
        return null;
    }
}

class PositionEstimator {
    static PositionPotentialValue estimate(Position p) {
        return null;
    }
}

abstract class PositionPotentialValue {
    abstract boolean lessThan(PositionPotentialValue pv);
}