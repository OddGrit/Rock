package grit.services;

import java.util.Map;
import java.util.TreeMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller  
@RestController
public class Play {
	
	@RequestMapping(value = "/play", method = RequestMethod.GET)
	public String play(String r) {
		return Logic.multiPlayer(r);
	}

	@RequestMapping(path = "/{name}", method = RequestMethod.POST)
	public String playComp(@PathVariable String name, String play) {		
		return Logic.singlePlayer(name, play);
	}
}