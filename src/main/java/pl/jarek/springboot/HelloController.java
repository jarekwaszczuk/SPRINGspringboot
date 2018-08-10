package pl.jarek.springboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greeting from Spring Boot! :-)";
    }

    @RequestMapping("/bye")
    public String goodBye() {
        return "Good bye!";
    }

    // @RequestMapping(value = "/delete/{word}", method = RequestMethod.DELETE)
    // wersja skrócona
    @DeleteMapping("/delete/{word}")
    public String delete(@PathVariable("word") String word) {
        return "Word to delete: " + word;
    }

    @GetMapping("/search")
    public String search(@RequestParam("query") String query) {
        return "Query string: " + query;
    }
}
