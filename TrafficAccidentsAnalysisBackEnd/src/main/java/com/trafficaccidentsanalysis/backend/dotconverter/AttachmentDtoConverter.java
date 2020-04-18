package com.trafficaccidentsanalysis.backend.dotconverter;

import java.util.HashSet;
import java.util.Set;

import com.trafficaccidentsanalysis.backend.dto.AttachmentDto;
import com.trafficaccidentsanalysis.backend.model.Attachment;

public class AttachmentDtoConverter {
	
	
	public Attachment convertAttachmentDtoTOAttachment(AttachmentDto attachmentDto) {
		Attachment attachment=new Attachment();
		attachment.setAttachmentid(attachmentDto.getAttachmentidDto());
		attachment.setAttachment(attachmentDto.getAttachmentDto());
		attachment.setAttachmentType(attachmentDto.getAttachmentTypeDto());
		attachment.setDateUpdated(attachmentDto.getDateUpdatedDto());
		
		return attachment;
	}
	
	public Set<Attachment> convertSetOfAttachmentDtoTOSetOfAttachment(Set<AttachmentDto> attachmentsDto){
		Set<Attachment> attachments=new HashSet<Attachment>();
		if(attachmentsDto == null) {
			attachmentsDto= new HashSet<AttachmentDto>();
		}
		attachmentsDto.forEach(attachmentDto->{
			attachments.add(convertAttachmentDtoTOAttachment(attachmentDto));
		});
		
		return attachments;
	}
}
