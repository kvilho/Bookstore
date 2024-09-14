package hh.sof3013.bookstore.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hh.sof3013.bookstore.domain.Book;
import hh.sof3013.bookstore.domain.BookRepository;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BookController {

    @Autowired
    BookRepository repository;

    @GetMapping("/booklist")
    public String getBooks(Model model) {
        List<Book> books = (List<Book>) repository.findAll();
        model.addAttribute("books", books);
        return "booklist";
    }

    
}
