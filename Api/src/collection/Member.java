package collection;

public class Member {
	private String id;
	private String password;
	private String name;

	public Member(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return id.hashCode();
		// id hashcode�� ������ ���� ���� ����
		// id�� ������ ���� �ؽ��ڵ带 ���

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			return this.id.equals(mem.id);
			//����� ������ ���� �ؽ��ڵ带 ���
		}
		return false;
	}

}
