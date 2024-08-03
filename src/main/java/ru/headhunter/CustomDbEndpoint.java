package ru.headhunter;
import org.apache.camel.Consumer;
import org.apache.camel.Endpoint;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.support.DefaultEndpoint;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;

import java.io.IOException;

@UriEndpoint(scheme = "customdb", title = "CustomDB", syntax = "customdb:query", label = "database")
public class CustomDbEndpoint extends DefaultEndpoint {

    @UriParam
    private String url;
    @UriParam
    private String username;
    @UriParam
    private String password;

    // Constructor, getters and setters

    @Override
    public String getEndpointBaseUri() {
        return super.getEndpointBaseUri();
    }

    @Override
    public Producer createProducer() throws Exception {
        return new CustomDbProducer(this);
    }

    @Override
    public boolean isSingletonProducer() {
        return super.isSingletonProducer();
    }

    @Override
    public Consumer createConsumer(Processor processor) throws Exception { //экстендим все методы из класса родителя
        return null;
    }


    @Override
    public void close() throws IOException {
        super.close();
    }
}
