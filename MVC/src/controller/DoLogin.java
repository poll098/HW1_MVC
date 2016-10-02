package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Member;
import service.MemberService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DoLogin() {
        // TODO Auto-generated constructor stub
    	
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		
		MemberService service=(MemberService)MemberService.getInstanace();//->싱글톤(하나의 객체를 생성해 여러개를 커낵션)객체를 가리키는 주소값받음
		Member member=service.Login(id,password);//입력한 id,password로 로그인 확인
		
		String page;
		if (member==null){
			page="/view/loginFail.jsp";
			request.setAttribute("id", id);
		}
		else{
			page="/view/loginSuccess.jsp";
		    request.setAttribute("name", member.getName());
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher(page);
		dispatcher.forward(request,response);
		
		
	}

}
