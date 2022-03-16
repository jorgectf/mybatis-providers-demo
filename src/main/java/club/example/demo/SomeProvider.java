package club.example.demo;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

public class SomeProvider {
    public String getSomething(@Param("input") final String input) {
        String s = (new SQL() {
            {
                this.SELECT("some_column, " + input);
                this.FROM(input);
                this.WHERE("some_column = " + input);
            }
        }).toString();
        return s;
    }
}

