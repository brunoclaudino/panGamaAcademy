package br.com.gama.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RequestMapping(path = "/saudacao")
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping(path = "/html")
	public ModelAndView home(Model model){
		model.addAttribute("mensagem", "Data de abertura da página:"+getDateTime());
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
	}
	
	@RequestMapping(path = "/avaliacao")
	@GetMapping
	public String ola() {
		return "A parte mais difícil para mim até o momento é o desenvolvendo soft skills. São habilidades importantes na qual precisam ser modeladas"
				+ " em um indivíduo. <br/> Entrando em partes técnicas, Spring tem sido algo novo em que estou adorando aprender!";
	}
	
	@RequestMapping(path = "/confia")
	public String confia() {
		return "<figure>\n"
				+ "  <img height=\"800\" width=\"400\" src=\"https://i.pinimg.com/originals/78/d6/8a/78d68a5864e2b229374dfc2df66ab31b.jpg\" alt=\"\">\n"
				+ "  <figcaption>Confia!</figcaption>\n"
				+ "</figure>";
	}
	
	private static String getDateTime(){                                                                            // Método que pega a data e hora
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");                                        // Define a formatação da data e hora
		Date date = new Date();                                                                                     // Instancia uma nova data
		return dateFormat.format(date);                                                                             // Retorna essa data
	}
}
