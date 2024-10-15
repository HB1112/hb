package chapter07;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.fileupload.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/7_3")
public class exam07_03 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher ds = req.getRequestDispatcher("chapter07/exam7_03.jsp");
		ds.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String save = req.getServletContext().getRealPath("img");
		System.out.println(save);
		DiskFileUpload upload = new DiskFileUpload();
		
		List items;
		try {
			items = upload.parseRequest(req);
			Iterator params=items.iterator();
			
			while(params.hasNext()) {
				FileItem fileitem=(FileItem)params.next();
				if(!fileitem.isFormField()) {
					String fileName=fileitem.getName();
					fileName =fileName.substring(fileName.lastIndexOf("\\")+1);
					File file=new File(save+"/"+fileName);
					fileitem.write(file);
				}
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
