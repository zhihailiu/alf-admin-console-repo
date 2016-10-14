package com.acme.adminconsole.extension;

public class RepositoryUsageServiceImpl implements RepositoryUsageService {

	private RepositoryUsageDAO repositoryUsageDAO;

	public void setRepositoryUsageDAO(RepositoryUsageDAO repositoryUsageDAO) {
		this.repositoryUsageDAO = repositoryUsageDAO;
	}

	@Override
	public long getDocumentCount() {
		return this.repositoryUsageDAO.getDocumentCount();
	}

}
