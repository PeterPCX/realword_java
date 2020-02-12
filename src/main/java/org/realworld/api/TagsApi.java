package org.realworld.api;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/tags")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TagsApi {
    @Inject TagsApiService service;

    @GET
    public Response tagsGet(@Context SecurityContext securityContext) throws NotFoundException {
        return service.tagsGet(securityContext);
    }
}
