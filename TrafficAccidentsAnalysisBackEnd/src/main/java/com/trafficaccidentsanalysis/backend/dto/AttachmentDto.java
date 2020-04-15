package com.trafficaccidentsanalysis.backend.dto;

import java.util.Date;


public class AttachmentDto {
	private int attachmentidDto;
	private byte[] attachmentDto;
	private String attachmentTypeDto;
	private Date dateCreatedDto;
	private Date dateUpdatedDto;
	public AttachmentDto() {
		super();
	}
	public int getAttachmentidDto() {
		return attachmentidDto;
	}
	public void setAttachmentidDto(int attachmentidDto) {
		this.attachmentidDto = attachmentidDto;
	}
	public byte[] getAttachmentDto() {
		return attachmentDto;
	}
	public void setAttachmentDto(byte[] attachmentDto) {
		this.attachmentDto = attachmentDto;
	}
	public String getAttachmentTypeDto() {
		return attachmentTypeDto;
	}
	public void setAttachmentTypeDto(String attachmentTypeDto) {
		this.attachmentTypeDto = attachmentTypeDto;
	}
	public Date getDateCreatedDto() {
		return dateCreatedDto;
	}
	public void setDateCreatedDto(Date dateCreatedDto) {
		this.dateCreatedDto = dateCreatedDto;
	}
	public Date getDateUpdatedDto() {
		return dateUpdatedDto;
	}
	public void setDateUpdatedDto(Date dateUpdatedDto) {
		this.dateUpdatedDto = dateUpdatedDto;
	}
	
	
	
}
