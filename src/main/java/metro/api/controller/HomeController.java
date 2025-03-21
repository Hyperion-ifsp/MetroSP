package metro.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Usar @Controller em vez de @RestController
public class HomeController {

    @GetMapping("/") // Mapear para a raiz ("/")
    public String home() {
        return "index.html"; // Retorna o nome do template (sem a extensão .html)
    }
}