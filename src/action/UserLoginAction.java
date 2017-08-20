package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.UserLoginDAO;
import form.UserLoginForm;


public class UserLoginAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("ME CON CHO CHANH");
		UserLoginForm loginForm = (UserLoginForm) form;

		String username = loginForm.getUserId();
		String password = loginForm.getPassword();
		System.out.println(username);
		System.out.println(password);
		UserLoginDAO dao = new UserLoginDAO();

		if (dao.authenticate(username, password)) {
			return mapping.findForward("success");
		}
		return mapping.findForward("failure");
	}
	}
