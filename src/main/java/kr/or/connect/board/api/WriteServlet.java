package kr.or.connect.board.api;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.connect.board.dao.BoardDao;
import kr.or.connect.board.dto.BoardDto;

/**
 * Servlet implementation class WriteServlet
 */
@WebServlet("/write")
public class WriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/boardWrite.jsp");
		rd.forward(request, response);;

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	
	SimpleDateFormat format = new SimpleDateFormat("yy.MM.dd");
	
	String userID = (String)request.getParameter("userID");
	String title = 	(String)request.getParameter("title");
	String content = (String)request.getParameter("content");
	Date now = new Date();
	String date = format.format(now);
	BoardDto dto = new BoardDto(userID, title, content, date);
	BoardDao dao = new BoardDao();
	dao.addBoard(dto);
	
	System.out.println("user :" + userID);
	System.out.println("title :" + title);
	System.out.println("content :" + content);


	System.out.println("한건 입력 완료!");

	response.sendRedirect("/board/list");
	}

}
