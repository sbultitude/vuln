package vulncheck.vulncheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VulncheckWeb {
	private VulncheckDB db;

    @Autowired
	public VulncheckWeb(VulncheckDB db){
		this.db = db;
	}

	@GetMapping("/{in}")
	public String get(@PathVariable String in){
		return db.get(in);
	}

}
