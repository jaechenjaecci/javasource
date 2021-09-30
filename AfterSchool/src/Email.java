
public class Email extends Message {
	private String title;

	public Email(String to, String naeyoung, String from,String title) {
		super(to,naeyoung, from);
		this.title = title;
}

	public void sendMessage() {
		System.out.println("이메일을 보낸다.");
	}
}
