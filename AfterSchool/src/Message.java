
public abstract class Message {
	private String to;
	private String naeyong;
	private String from;

	public Message(String to, String naeyong, String from) {
		super();
		this.to = to;
		this.naeyong = naeyong;
		this.from = from;
	}


	public abstract void sendMessage();
}