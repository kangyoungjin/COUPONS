package kr.pe.dk.vo;

public class UserVO {
	private int user_seq;
	private String user_name;
	private String user_nick;
	private String user_password;
	private String user_addr;
	private String user_email;
	private String user_phone;
	private String user_desc;
	private String user_issys;
	private String user_x;
	private String user_y;
	private String user_intidate;
	public int getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_nick() {
		return user_nick;
	}
	public void setUser_nick(String user_nick) {
		this.user_nick = user_nick;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_addr() {
		return user_addr;
	}
	public void setUser_addr(String user_addr) {
		this.user_addr = user_addr;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_desc() {
		return user_desc;
	}
	public void setUser_desc(String user_desc) {
		this.user_desc = user_desc;
	}
	public String getUser_issys() {
		return user_issys;
	}
	public void setUser_issys(String user_issys) {
		this.user_issys = user_issys;
	}
	public String getUser_x() {
		return user_x;
	}
	public void setUser_x(String user_x) {
		this.user_x = user_x;
	}
	public String getUser_y() {
		return user_y;
	}
	public void setUser_y(String user_y) {
		this.user_y = user_y;
	}
	public String getUser_intidate() {
		return user_intidate;
	}
	public void setUser_intidate(String user_intidate) {
		this.user_intidate = user_intidate;
	}
	
	@Override
	public String toString() {
		return "UserVO [user_seq=" + user_seq + ", user_name=" + user_name + ", user_nick=" + user_nick
				+ ", user_password=" + user_password + ", user_addr=" + user_addr + ", user_email=" + user_email
				+ ", user_phone=" + user_phone + ", user_desc=" + user_desc + ", user_issys=" + user_issys + ", user_x="
				+ user_x + ", user_y=" + user_y + ", user_intidate=" + user_intidate + "]";
	}
	
	
}
