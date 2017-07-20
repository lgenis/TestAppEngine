


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SumaNumeros  extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) 
			throws ServletException, IOException {
	
		// Set response content type
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      String title = "Fecha  & Hora";
	      Date date = new Date();
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	            "<img  src='entity-lifecycle2.png'>" +
	               "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<h2 align = \"center\">" + date.toString() + "</h2>\n" +
	            "</body> </html>"
	      );
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		  PrintWriter out = response.getWriter();
	      String title = "Suma dos numeros";
	      Date date = new Date();
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      String strFirstNum = req.getParameter("first_number");
	      String strSecondNum = req.getParameter("second_number"); 
	      
	      if (isNumber(strFirstNum) && isNumber(strSecondNum)){
	      
	      
		      double firstNum = Double.valueOf(strFirstNum);
		      
		      double secondNum = Double.valueOf(strSecondNum);
		      
		      double sum = firstNum + secondNum; 
		      
		      out.println(docType +
		         "<html>\n" +
		            "<head><title>" + title + "</title></head>\n" +
		            "<body bgcolor = \"#f0f0f0\">\n" +
		 
		               "<h1 align = \"center\"> La suma es: " + sum  + "</h1>\n" +
		               "<h2 align = \"center\">" + date.toString() + "</h2>\n" +
		            "</body> </html>"
		      );
		
	      }else{
	          out.println(docType +
	 		         "<html>\n" +
	 		            "<head><title>" + title + "</title></head>\n" +
	 		            "<body bgcolor = \"#f0f0f0\">\n" +
	 		 
	 		               "<h1 align = \"center\"> No se puede hacer suma </h1>\n" +
	 		               "<h2 align = \"center\">" + date.toString() + "</h2>\n" +
	 		            "</body> </html>"
	 		      );
	      }
	      
	      
	}
	
	public boolean isNumber(String input){
		try{
			Double.valueOf(input);
			return true;
		}catch(Exception e){
			return false;
		}
		
		
	}
	
	

	
	
}