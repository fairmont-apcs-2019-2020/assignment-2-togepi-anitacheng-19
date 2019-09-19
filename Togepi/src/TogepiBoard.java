public class TogepiBoard extends Board {

	/**
	 * Creates a new <code>PokeBoard</code> with the specified number of rows and columns.
	 */
	public TogepiBoard() 
	{
		// Call the Board constructor to make an 8x4 Board
	 	super(6, 6);
	 	newGame(false);
	 	setTitle("PokemonCode Assignment 2");
	 	setInitialText("Why did the Togepi cross the Board?");
	}
	

	/**
	 * Initial placement of all PokeThings in the PokeBoard
	 */
	@Override
	public void newGame(boolean repaint)
	{
		super.newGame(repaint);
		
		// Create a MyThing at 0, 0
	 	//TogepiBoard MyThing = new TogepiBoard();
	 	//MyThing.setLocation(0, 0);
	 	//add(MyThing);
	 	
	 	MyThing MyThingg = new MyThing();
	 	MyThingg.setLocation(0, 0);
	 	add(MyThingg);
	}


	private void add(TogepiBoard myThing) {
		// TODO Auto-generated method stub
		
	}


	private void setLocation(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}