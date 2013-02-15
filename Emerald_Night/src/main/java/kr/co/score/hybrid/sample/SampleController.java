package kr.co.score.hybrid.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)   
    public String addContact(@ModelAttribute("sample")   
                        SampleBean sample, BindingResult result) {       
		logger.info("Name :" + sample.getName() +            
                        ", email :" + sample.getEmail());       
        return "redirect:contacts.html";      
    }     
    
    @RequestMapping("/contacts")      
    public ModelAndView showContacts() {        
        return new ModelAndView("sample", "command", new SampleBean());     
    }  

}
