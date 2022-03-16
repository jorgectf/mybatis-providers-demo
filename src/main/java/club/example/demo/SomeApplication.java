package club.example.demo;

import org.apache.ibatis.jdbc.SQL;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//@MapperScan(basePackages = {"club.example.demo.dao"})
public class SomeApplication {
    public static void main(String[] args) {
        //SpringApplication.run(SomeApplication.class, args);
        String input = "test_input";
        System.out.println(
                (new SQL() {
                    {
                        this.INSERT_INTO(input);

                    }
                }).toString()
        );
    }
}
