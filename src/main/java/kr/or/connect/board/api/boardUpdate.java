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
 * Servlet implementation class boardUpdate
 */
@WebServlet("/boardupdate")
public class boardUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public boardUpdate() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("detail get success!");

		int num = Integer.parseInt(request.getParameter("id"));

		BoardDao dao = new BoardDao();
		BoardDto detail = dao.getDetail(num);
		request.setAttribute("detail", detail);
		
		RequestDispatcher rd = request.getRequestDispatcher("/boardUpdate.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		SimpleDateFormat format = new SimpleDateFormat("yy.MM.dd");
		
		int num = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		Date now = new Date();
		String date = format.format(now);
		
		BoardDao dao = new BoardDao();
		dao.updateBoard(title, content, num, date);
		System.out.println(title + content + num + date);
		System.out.println("detail post success!");

		response.sendRedirect("/board/list");
	}

}
