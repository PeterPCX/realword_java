package org.realworld.api;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/articles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ArticlesApi {
    @Inject ArticlesApiService service;

    @GET
    public Response getArticles(@QueryParam("tag") String tag,
                                @QueryParam("author") String author,
                                @QueryParam("favouited") String favorited,
                                @DefaultValue("20") @QueryParam("limit") Integer limit,
                                @DefaultValue("0") @QueryParam("offset") Integer offset,
                                SecurityContext securityContext) {
        return service.getArticles(tag, author, favorited, limit, offset, securityContext);
    }

    @POST
    public Response createArticle(SecurityContext securityContext);
}
