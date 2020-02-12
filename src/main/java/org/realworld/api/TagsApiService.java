package org.realworld.api;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public interface TagsApiService {
    Response tagsGet(SecurityContext securityContext) throws NotFoundException;
}
