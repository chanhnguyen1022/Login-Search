package form;

import org.apache.struts.action.ActionForm;

public class UserLoginForm extends ActionForm {

	private String userId;
	private String password;
	
	public UserLoginForm(){}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}