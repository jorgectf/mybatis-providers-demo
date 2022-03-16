package club.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping({"/something"})
public class SomeController {
    private SomeService someService;

    @RequestMapping(
            value = {"/getSomething"},
            method = {RequestMethod.GET}
    )
    public String getSomething(@RequestParam("input") String input) throws IOException {
        try {
            return this.someService.getSomething(input);
        } catch (Exception err) {
            return "error";
        }
    }
}
