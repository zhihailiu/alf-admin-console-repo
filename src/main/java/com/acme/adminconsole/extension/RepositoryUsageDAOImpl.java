package com.acme.adminconsole.extension;

import org.alfresco.repo.domain.query.CannedQueryDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RepositoryUsageDAOImpl implements RepositoryUsageDAO {

	final static Logger logger = LoggerFactory.getLogger(RepositoryUsageDAOImpl.class);

	private CannedQueryDAO cannedQueryDAO;

	public void setCannedQueryDAO(CannedQueryDAO cannedQueryDAO) {
		this.cannedQueryDAO = cannedQueryDAO;
	}

	@Override
	public long getDocumentCount() {
		Long count = cannedQueryDAO.executeCountQuery("acme.query.repositoryUsage", "select_DocumentCount", null);
		logger.debug("Counted documents:" + count);
		return count;
	}

}
