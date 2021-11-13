package springmvc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUpload {
	
	@RequestMapping("/fileform")
	public String showUploadForm() {
		
		String str = null;	//throw an Null pointer exception
		System.out.println(str.charAt(1));
		
		return "File";
	}
	
	@RequestMapping(value="/uploadimage",method = RequestMethod.POST)
	public String fileupload(@RequestParam("myfile") CommonsMultipartFile file,
			Model model,
			HttpSession session) throws IOException {
		
		System.out.println("file Upload Handler..");
		System.out.println(file.getSize());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getName());
		
		//File Upload Start
		
		byte[] data = file.getBytes();
		
		// we have to save to this file to server
		String path = session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"Resources"+File.separator+"img"+File.separator+file.getOriginalFilename();
		System.out.println("path(Upload in deployed folder)==>" +path);
		
		//data write in file
		
		try {
			FileOutputStream out = new FileOutputStream(path);
			out.write(data);
			out.close();
			System.out.println("File Uploaded..");
			
			model.addAttribute("filename :"+file.getOriginalFilename());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Uploading error");
		}
		
		return "fileuploadsuccess";
	}
}
