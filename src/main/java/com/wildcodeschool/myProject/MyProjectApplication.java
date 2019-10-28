package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<h1>Hello, I'm the Doctor</h1> " + "<ul> " + "<li><a href='/doctor/1'>David Tennant</a></li>  "
				+ "<li><a href='/doctor/2'>Matt Smith</a></li>  " + "<li><a href='/doctor/3'>Peter Capaldi</a></li>  "
				+ "<li><a href='/doctor/4'>Jodie Whittaker</a></li> " + "</ul>";
	}

	@RequestMapping(value = "/doctor", method = RequestMethod.GET)
	public String redirect() {
		return "redirect:/";
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctor1() {
		return "<h1>David Tennant</h1><br><img src='https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/Good_Omens_panel_at_NYCC_%2860841%29a.jpg/440px-Good_Omens_panel_at_NYCC_%2860841%29a.jpg'>";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctor2() {
		return "<h1>Matt Smith</h1><br><img src='https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Matt_Smith_by_Gage_Skidmore_2.jpg/440px-Matt_Smith_by_Gage_Skidmore_2.jpg'>";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String doctor3() {
		return "<h1>Peter Capaldi</h1><br><img src='https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Peter_Capaldi_by_Gage_Skidmore_2.jpg/440px-Peter_Capaldi_by_Gage_Skidmore_2.jpg'>";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctor4() {
		return "<h1>Jodie Whittaker</h1><br><img src='https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Jodie_Whittaker_by_Gage_Skidmore.jpg/440px-Jodie_Whittaker_by_Gage_Skidmore.jpg'>";
	}
}