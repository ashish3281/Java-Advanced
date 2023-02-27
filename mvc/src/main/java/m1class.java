
public class m1class {
  
private String t1,t2;
public String getUsername() {
	return t1;
}
public void setUsername(String t1) {
	this.t1 = t1;
}
public String getPassword() {
	return t2;
}
public void setPassword(String t2) {
	this.t2 = t2;
}
/*public m1class(String username, String password) {
	super();
	this.t1 = username;
	this.t2 = password;
}
*/
public boolean validate() {
	if(t2.equals("admin")) {
		return true;
	}
	else {
		return false;
	}
}
}
