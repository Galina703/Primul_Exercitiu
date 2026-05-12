import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/moldova")
    public String moldova() {
        return "Capitala este Chisinau";
    }
    @GetMapping("/france")
    public String france() {
        return "Capitala este Paris";
    }
    @GetMapping("/germani")
    public String germani() {
        return "Capitala este Berlin";
    }
}
