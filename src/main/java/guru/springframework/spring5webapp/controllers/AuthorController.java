package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.AuthorRepostitory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Djordje on 08-May-23
 */
@Controller
public class AuthorController {

    private AuthorRepostitory authorRepostitory;

    public AuthorController(AuthorRepostitory authorRepostitory) {
        this.authorRepostitory = authorRepostitory;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorRepostitory.findAll());

        return "authors/list";
    }
}
