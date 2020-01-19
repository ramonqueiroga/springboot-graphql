package com.udemy.springbootgraphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

    public String hello() {
        return "Hello GraphQL";
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public Customer customer() {
        return new Customer("Ramon", "email");
    }

}
