package ru.headhunter;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MainApp {
    public static void main(String[] args) throws Exception {
        CamelContext context = new DefaultCamelContext();

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/camel_db");
        dataSource.setUsername("your_username");
        dataSource.setPassword("your_password");

        context.getRegistry().bind("dataSource", dataSource);

        context.addRoutes(new DatabaseRoute());
        context.start();

        Thread.sleep(5 * 60 * 1000);

        context.stop();
    }
}
