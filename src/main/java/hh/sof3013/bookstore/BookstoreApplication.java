package hh.sof3013.bookstore;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.sof3013.bookstore.domain.Book;
import hh.sof3013.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository){
		return (args) -> {
			Book book1 = new Book("Seitsemän Veljestä", "Aleksis Kivi", 1870, "123456789", 29.95);
			Book book2 = new Book("Sinuhe Egyptiläinen", "Mika Waltari", 1945, "123456798", 25.95);
			repository.save(book1);
			repository.save(book2);

			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}
		};
	}

}
