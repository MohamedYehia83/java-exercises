package com.techelevator;

import com.techelevator.dao.ActorDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	/* What request mapping do we want here */
	@RequestMapping(path="/actor", method=RequestMethod.GET)
	public String showSearchActorForm() {
		return "actorList";
	}

	/* What about here? */
	@RequestMapping(path="/actorList", method=RequestMethod.GET)
	public String searchActors(@RequestParam String name, ModelMap modelHolder) {
		/* Call the model and pass values to the jsp */
		modelHolder.put("actors",actorDao.getMatchingActors(name));
		return "actorList";
	}
}
