

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class threeValues
 */
@WebServlet("/threeValues")
public class threeValues extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public threeValues() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int WBAI = 200;
		String Command = "You need to drop it today";
		ArrayList <String> stocksList = new ArrayList <String>();
		stocksList.add("VIPS");
		stocksList.add("YY");
		stocksList.add("WUBA");
		stocksList.add("WBAI");
		stocksList.add("SFUN");
		
		request.setAttribute("CommandString",Command);
		request.setAttribute("Integer", WBAI);
		request.setAttribute("stockList",stocksList);
		
		getServletContext().getRequestDispatcher("/NewFile.jsp").forward(request,response);
				
	}

}
