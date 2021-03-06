
public class Shapes {
    public String tri1(int h) {
	String s = "";
	int rowcounter = 1;
	while (rowcounter <= h){
	    int columncounter = 1;
	    while (columncounter<=rowcounter){
		s += "*";
		columncounter += 1;
	    }
	    s = s + "\n";
	    rowcounter += 1;
	}
	return s;
    }
    public String tri2(int h) {
	String s = "";
	int rowcounter = 1;
	while (rowcounter<=h) {
	    int spacecounter = rowcounter;
	    int columncounter = 1;
	    while (spacecounter+1 <= h){
		s += " ";
		spacecounter += 1;
	    }
	    while (columncounter<=rowcounter){
		s += "*";
		columncounter += 1;
	    }
	    s=s+"\n";
	    rowcounter += 1;
	}
        return s;
    }

    public String tri3(int h) {
	String s = "";
	int rowcounter = 1;
	while (rowcounter<=h) {
	    int spacecounter = rowcounter;
	    int columncounter = 1;
	    while (spacecounter+1 <= h){
		s += " ";
		spacecounter += 1;
	    }
	    while (columncounter<=(2*rowcounter-1)){
		s += "*";
		columncounter += 1;
	    }
	    s=s+"\n";
	    rowcounter += 1;
	}
        return s;
    }

    public String tri3reverse(int h){
     	String s = "";
	int rowcounter = h;
	while (rowcounter>0) {
	    int spacecounter = rowcounter;
	    int columncounter = 1;
	    while (spacecounter<=h){
		s += " ";
		spacecounter += 1;
	    }
	    while (columncounter<=(2*rowcounter-1)){
		s += "*";
		columncounter += 1;
	    }
	    s=s+"\n";
	    rowcounter--;
	}
        return s;
    }

    public String diamond(int h){
	String s= "";
	return tri3((h/2)+1)+tri3reverse((h/2));
	
    }

    public String tri4(int h) {
	String s = "";
	int rowcounter = h;
	while (rowcounter>0) {
	    int spacecounter = rowcounter;
	    int columncounter = 1;
	    while (spacecounter+1 <= h){
		s += " ";
		spacecounter += 1;
	    }
	    while (columncounter<=rowcounter){
		s += "*";
		columncounter += 1;
	    }
	    s=s+"\n";
	    rowcounter--;
	}
        return s;
    }
    
}
