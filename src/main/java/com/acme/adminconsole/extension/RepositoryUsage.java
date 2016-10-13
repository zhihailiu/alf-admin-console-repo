package com.acme.adminconsole.extension;

import org.alfresco.enterprise.repo.management.MBeanSupport;
import org.alfresco.repo.transaction.RetryingTransactionHelper.RetryingTransactionCallback;

public class RepositoryUsage extends MBeanSupport implements RepositoryUsageMBean {

	private RepositoryUsageService repositoryUsageService;

	public void setRepositoryUsageService(RepositoryUsageService repositoryUsageService) {
		this.repositoryUsageService = repositoryUsageService;
	}

	@Override
	public long getDocumentCount() {
		return doWork(new RetryingTransactionCallback<Long>() {
			public Long execute() throws Throwable {
				return repositoryUsageService.getDocumentCount();
			}
		}, true);
	}

}
