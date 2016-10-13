package com.acme.adminconsole.extension;

import org.alfresco.repo.domain.usage.UsageDAO;
import org.alfresco.repo.usage.UsageServiceImpl;

public class RepositoryUsageServiceImpl extends UsageServiceImpl implements RepositoryUsageService {

	private RepositoryUsageDAO usageDAO;

	@Override
	public void setUsageDAO(UsageDAO usageDAO) {
		this.usageDAO = (RepositoryUsageDAO) usageDAO;
	}

	@Override
	public long getDocumentCount() {
		return this.usageDAO.getDocumentCount();
	}

}
