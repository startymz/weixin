package com.yumengze.weixin.reset.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.yumengze.weixin.vo.User;

@Path("/reset/user")
@Component("restUserService")
@Scope("prototype")
public class RestUserService {
	private Log log = LogFactory.getLog(RestUserService.class);

	@GET
	@Path("/list")
	@Produces(value = { MediaType.APPLICATION_XML })
	public List<User> list() {
		
		List<User> out = new ArrayList<User>();
		User user1 = new User();
		user1.setId("35084532");
		user1.setName("gfdgds");
		out.add(user1);
		User user2 = new User();
		user2.setId("35084532");
		user2.setName("gfdgds");
		out.add(user2);
		log.debug("return user count:" + out.size());
		return out;
	}

}
