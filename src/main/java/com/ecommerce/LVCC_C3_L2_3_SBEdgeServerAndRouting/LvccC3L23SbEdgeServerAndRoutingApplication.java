package com.ecommerce.LVCC_C3_L2_3_SBEdgeServerAndRouting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableAspectJAutoProxy
@RestController
public class LvccC3L23SbEdgeServerAndRoutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LvccC3L23SbEdgeServerAndRoutingApplication.class, args);
	}
	
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
	    return builder.routes()
	    		.route(p->p
	    				.path("/api/demo/**")
	    				.uri("http://localhost:8080/"))
	    		.build();
	}
	
	//To understand better
//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//	    return builder.routes()
//	    		.route(p->p
//	    				.path("/api/demo/**")
//	    				.uri("https://amazon.com"))
//	    		.build();
//	}

}
