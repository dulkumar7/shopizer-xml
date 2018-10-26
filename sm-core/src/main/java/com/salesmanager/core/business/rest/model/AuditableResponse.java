package com.salesmanager.core.business.rest.model;

public interface AuditableResponse {
	
	AuditSectionResponse getAuditSection();
	
	void setAuditSection(AuditSectionResponse audit);
}
