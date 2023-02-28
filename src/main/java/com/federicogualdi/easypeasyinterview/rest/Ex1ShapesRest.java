package com.federicogualdi.easypeasyinterview.rest;

import com.federicogualdi.easypeasyinterview.service.Ex1ShapesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Ex1ShapesRest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Inject
    Ex1ShapesService shapesService;

    @GET
    public Response computeRectangleData() {
        logger.info("Compute Rectangle Data has been call");
        var dto = shapesService.computeRectangleData();
        return Response.ok(dto).build();
    }
}
