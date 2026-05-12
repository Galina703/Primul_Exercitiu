import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
   public class CountryController {

    @GetMapping("/moldova")
    public String getMoldova() {
        return "Capitale este Chisinau" ;
    }

        @GetMapping("/france")
    public String getFrance() {
            return "Capitale este Paris";
        }

        @GetMapping("/germany")
    public String getGermany() {
                return "Capitale este Berlin";
            }



    }

