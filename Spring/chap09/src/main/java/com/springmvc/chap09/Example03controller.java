package com.springmvc.chap09;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Example03controller {
	
	@GetMapping("/form")
	public String requestForm(Member member) {
		return "webpage09_02";
	}
	@PostMapping("/form")
	public String submitForm(@ModelAttribute("member") Member member, HttpServletRequest request, HttpSession session) {
		System.out.println(member.getName());
		System.out.println(member.getImageFile());
		String name = member.getName();
		String filename = member.getImageFile().getOriginalFilename();
		String image = request.getServletContext().getRealPath("/resources/images/");
		System.out.println(image);
		File f = new File(image+name+"_"+filename);
		try {
			member.getImageFile().transferTo(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "webpage09_submit";
	}
}
