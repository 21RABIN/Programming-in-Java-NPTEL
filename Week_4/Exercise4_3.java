package Week_4;


interface ExtraLarge{
	static String extra = "This is extra-large";
	void display();
}

class Large {
    public void Print() {
        System.out.println("This is large");
    }
}
 
class Medium extends Large {
    public void Print() {
    	super.Print();  
        System.out.println("This is medium");
    }
}
class Small extends Medium {
    public void Print() {
        super.Print();  
        System.out.println("This is small");
    }
}
 
class Exercise4_3 implements ExtraLarge{
    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
        Exercise4_3 q = new Exercise4_3();
		q.display();
    }
	public void display(){
		System.out.println(extra);
	}
}

/*-----------OUTPUT-------------

Input	        |     Expected Output
 NoInput        |     This is large\n
                      This is medium\n
                      This is small\n
                      This is extra-large
                      


*/