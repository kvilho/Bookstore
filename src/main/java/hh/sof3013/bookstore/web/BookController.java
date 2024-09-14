package hh.sof3013.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hh.sof3013.bookstore.domain.BookRepository;

import org.springframework.web.bind.annotation.GetMapping;


@ResponseBody
@Controller
public class BookController {

    @Autowired
    BookRepository repository;
    
    @GetMapping("/index")
    public String getMethodName() {
        return "moikka";
    }

    
}
