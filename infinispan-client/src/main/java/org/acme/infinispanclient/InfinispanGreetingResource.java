package org.acme.infinispanclient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.infinispan.client.hotrod.RemoteCache;

import io.quarkus.infinispan.client.runtime.Remote;

@Path("/infinispan")
public class InfinispanGreetingResource {

   @Inject
   @Remote("mycache")
   private RemoteCache<String, String> cache;

   @GET
   @Produces(MediaType.TEXT_PLAIN)
   public String hello() {
      return cache.get("hello");
   }
}
