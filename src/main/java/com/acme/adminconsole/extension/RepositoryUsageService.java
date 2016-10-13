package com.acme.adminconsole.extension;

import org.alfresco.service.cmr.usage.UsageService;

public interface RepositoryUsageService extends UsageService {

	long getDocumentCount();
	
}
