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
 * Servlet implementation class DoRegister
 */
@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DoRegister() {
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		name = new String(name.getBytes("8859_1"),"UTF-8");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		
		Member member=new Member(id,password,name,gender,email);//ÀÔ·Â¹ÞÀº °´Ã¼ »ý¼º
		MemberService service=(MemberService)MemberService.getInstanace();
		service.addMember(member);//service°´Ã¼¿¡ member °´Ã¼ Ãß°¡
		
		String page;
		
		if(member==null)
			page="/view/error.jsp";
		else
			page="/view/registerSuccess.jsp";
			request.setAttribute("member", member);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page); 
		dispatcher.forward(request, response); 

	}

}
