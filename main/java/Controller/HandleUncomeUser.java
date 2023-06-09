package Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

/**
 * Servlet implementation class HandleUncomeUser
 */
@WebServlet("/HandleUncomeUser")
@MultipartConfig()
public class HandleUncomeUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HandleUncomeUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("come here already");
		// TODO Auto-generated method stub
		// Get the file from the request
		Part filePart = request.getPart("file"); // "file" is the name of the file input in the form

		// Get the InputStream of the file
		InputStream fileContent = filePart.getInputStream();
		
		
		// Get the filename
		String fileName = filePart.getSubmittedFileName();
		// Create a FileOutputStream for the file
		
		
		FileOutputStream out = new FileOutputStream(new File("C://demo/" + fileName));

		// Write the file content to the FileOutputStream
		byte[] buffer = new byte[1024];
		int bytesRead;
		while ((bytesRead = fileContent.read(buffer)) != -1) {
		    out.write(buffer, 0, bytesRead);
		}

		// Close the streams
		fileContent.close();
		out.close();
		
		// Print a message to indicate the file has been written successfully
		System.out.println(fileName + " written successfully on disk.");

	}

}
