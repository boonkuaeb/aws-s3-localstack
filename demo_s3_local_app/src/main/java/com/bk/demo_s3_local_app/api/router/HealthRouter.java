/*
 * Copyright (c) 2021. Dandelion development
 */

package com.bk.demo_s3_local_app.api.router;

import com.bk.demo_s3_local_app.api.handler.HealthHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class HealthRouter {

  @Bean
  public RouterFunction<ServerResponse> healthRouterFunction(HealthHandler healthHandler) {
    RequestPredicate healthRoute =
        RequestPredicates.GET("/s3/health")
            .and(RequestPredicates.accept(MediaType.APPLICATION_JSON));

    return RouterFunctions.route(healthRoute, healthHandler::health);
  }
}
