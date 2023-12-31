package chinesecheckers_v06;
import java.util.List;

public abstract class BoardState implements Cloneable {
		
	abstract public boolean wins(Player player);

	abstract public boolean isTie();
	
	abstract boolean set(int x, int y, Player player);
	
	abstract Player get(int x, int y);
	
	abstract public boolean isTerminal();
	
	abstract public List<BoardState> getSuccessors(Player player);
	
	abstract public BoardState getSwitchedBoard();
		
	abstract public BoardState clone() throws CloneNotSupportedException;
}
