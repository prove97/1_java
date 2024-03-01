package test08;

public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	public User() {
		super();
	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return this.id + "\t" + this.password + "\t" + name + "\t" + age + "\t" + gender
				+ "\t" + phone;
	}
	
	@Override
	public boolean equals(Object obj) { 
		boolean isEquals = false;
		if(obj instanceof User) {
			User tmpUser = ((User)obj);
			if (this.getId().equals(tmpUser.getId()) &&
			    this.getPassword().equals(tmpUser.getPassword()) &&
			    this.getName().equals(tmpUser.getName()) &&		   
			    this.getAge() == tmpUser.getAge() &&		   
			    this.getGender() == tmpUser.getGender() &&		   
			    this.getPhone().equals(tmpUser.getPhone()) ) {
				isEquals = true;
			}
		}
					
		return isEquals;
		
//		if(this.getId() == ((User)obj).getId() &&
//				this.getPassword() == ((User)obj).getPassword() &&
//				this.getName() == ((User)obj).getName() &&
//				this.getAge() == ((User)obj).getAge() &&
//				this.getGender() == ((User)obj).getGender() &&
//				this.getPhone() == ((User)obj).getPhone()) {
//			return true;
//		} else
//			return false;
	}
	
	
	public Object clone() {
		User newUser = new User(this.getId(), this.getPassword(), this.getName(),
					            this.getAge(), this.getGender(), this.getPhone());
		return newUser;
	}
	
// getter, setter 메소드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
