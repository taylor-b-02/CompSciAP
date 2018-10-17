
public class Letter {
	
	//Constructor
	public Letter(String from, String to) {
		sender = to;
		reciever = from;
		body = "Dear " + reciever + ":\n\n";
	}
	
	//Methods
	public void addLine(String line) {
		body = body + line + "\n";
	}
	
	public void getText() {
		body = body + "\n" + "Sincerely,\n\n" + sender;
		System.out.println(body);
	}
	
	String sender;
	String reciever;
	String body = "";

}
