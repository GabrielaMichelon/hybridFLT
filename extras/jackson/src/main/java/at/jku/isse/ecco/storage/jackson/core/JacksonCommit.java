package at.jku.isse.ecco.storage.jackson.core;

import at.jku.isse.ecco.core.Commit;
import at.jku.isse.ecco.feature.Configuration;

/**
 * Memory implementation of {@link Commit}.
 */
public class JacksonCommit implements Commit {

	public static final long serialVersionUID = 1L;


	private String id;
	private String committer;
	private Configuration configuration;

	public JacksonCommit() {
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public Configuration getConfiguration() {
		return this.configuration;
	}

	@Override
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

}
