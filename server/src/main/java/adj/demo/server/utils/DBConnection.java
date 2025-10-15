package adj.demo.server.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DBConnection {
    @Value("${db.host}")
    private String host;

    @Value("${db.port}")
    private String port;

    @Value("${db.name}")
    private String name;

    @Value("${db.user}")
    private String user;

    @Value("${db.pass}")
    private String pass;

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.jdbc.Driver");
        source.setUrl("jdbc:mysql://" + host + ":" + port + "/" + name);
        source.setUsername(user);
        source.setPassword(pass);
        return source;
    }
}
