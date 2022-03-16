package club.example.demo;

import org.springframework.stereotype.Service;

@Service
public class SomeService {
    SomeDAO someDAO;

    public String getSomething(String input) {
        return this.someDAO.getSomething(input);
    }
}
