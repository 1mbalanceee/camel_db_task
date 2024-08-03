package ru.headhunter;

import org.apache.camel.builder.RouteBuilder;

public class DatabaseRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer://foo?period=60000")
                .to("jdbc:dataSource")
                .log("${body}");
    }
}
