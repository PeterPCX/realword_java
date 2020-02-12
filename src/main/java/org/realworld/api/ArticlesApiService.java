package org.realworld.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public interface ArticlesApiService {
     Response getArticles(String tag, String author, String favorited, Integer limit, Integer offset, SecurityContext securityContext);
}
