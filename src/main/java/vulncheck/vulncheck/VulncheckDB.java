package vulncheck.vulncheck;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class VulncheckDB {
	private JdbcTemplate template;

    @Autowired
	public VulncheckDB(DataSource dataSource){
		this.template = new JdbcTemplate(dataSource);
	}

	public String get(String in) {
		return template.queryForObject("SELECT TOP 1 * FROM Users WHERE username = ?", String.class, in);
	}

}
