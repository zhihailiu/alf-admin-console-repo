package com.acme.adminconsole.extension;

import org.alfresco.repo.domain.usage.ibatis.UsageDAOImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RepositoryUsageDAOImpl extends UsageDAOImpl implements RepositoryUsageDAO {

    final static Logger logger = LoggerFactory.getLogger(RepositoryUsageDAOImpl.class);
    
    private static final String SELECT_DOCUMENT_COUNT = "alfresco.usage.select_GetDocumentCount";

	@Override
	public long getDocumentCount() {
		long count = 99L;
		logger.debug("document count={}", count);
		return count;
	}
	
}
