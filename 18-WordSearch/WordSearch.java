public class WordSearch {
    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    public WordSearch() {
	this(20,40);
    }
 
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public void addWordH(String w, int row, int col, boolean right){
	int c = col;
	if (c+w.length()<board.length){
	    for (int i=0; i < w.length();i++){
		board[row][c] = w.charAt(i);
		if (right == true){c++;}else c--;
	    }
	}
    }
    public void addWordV(String w, int row, int col, boolean down){
	int r = row;
	if (r+w[0].get.length()<board.length){
	    for (int i=0; i < w[0].get.length();i++){
		board[r][col] = w.charAt(i);
		if (down == true){c--;}else c--;
	    }
	}
    }
		
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH("hello",3,15, true); // should work
	w.addWordH("hello",2,34, true);
	w.addWordH("hello",3,38, true);
	w.addWordH("look",2,14, false); // test illegal overlap
	System.out.println(board.length);
	//w.addWordH("look",3,18); // test legal overlap
	//w.addWordH("look",-3,20); // test illegal row
	//w.addWordH("look",3,55); // test illegal col
	// etc
	System.out.println(w);
    }
}
