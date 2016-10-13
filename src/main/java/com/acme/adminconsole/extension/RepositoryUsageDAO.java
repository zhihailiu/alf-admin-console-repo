package com.acme.adminconsole.extension;

import org.alfresco.repo.domain.usage.UsageDAO;

public interface RepositoryUsageDAO extends UsageDAO {

	long getDocumentCount();
	
}
