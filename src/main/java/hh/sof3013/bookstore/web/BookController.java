package hh.sof3013.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BookController {
    @GetMapping("/index")
    public String getMethodName(@RequestParam String param) {
        return "moikka";
    }
    
}
