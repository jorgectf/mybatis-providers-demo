package club.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

@Mapper
public interface SomeDAO {
    @SelectProvider(
            type = SomeProvider.class,
            method = "getSomething"
    )
    String getSomething(String input);
}
