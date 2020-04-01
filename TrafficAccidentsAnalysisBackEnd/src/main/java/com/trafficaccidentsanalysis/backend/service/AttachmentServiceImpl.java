package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Attachment;
import com.trafficaccidentsanalysis.backend.repository.AttachmentRepository;
import com.trafficaccidentsanalysis.backend.service.AttachmentService;

@Service
public class AttachmentServiceImpl implements AttachmentService {

	@Autowired
	AttachmentRepository attachmentRepository;
	
	@Override
	public List<Attachment> getAllAttachment() {
		// TODO Auto-generated method stub
		return attachmentRepository.findAll();
	}

	@Override
	public Attachment saveAttachment(Attachment attachment) {
		// TODO Auto-generated method stub
		return attachmentRepository.save(attachment);
	}
	@Override
	public ResponseEntity<?> deleteAttachment(Attachment Attachment) {
		return (ResponseEntity<?>)attachmentRepository.findById(Attachment.getAttachmentid()).map(attachmentToDelete->{
			attachmentRepository.delete(attachmentToDelete);
			return ResponseEntity.ok();
		}).orElseThrow(null);
	}

	@Override
	public Attachment updateAttachment(Attachment attachment) {
		// TODO Auto-generated method stub
		return attachmentRepository.findById(attachment.getAttachmentid()).map(oldattachment->{
			oldattachment.setAccident(attachment.getAccident());
			oldattachment.setAttachment(attachment.getAttachment());
			oldattachment.setAttachmentType(attachment.getAttachmentType());
			oldattachment.setDateUpdated(attachment.getDateUpdated());
			return attachmentRepository.save(oldattachment);
		
		}).orElseThrow(null);
	}
}


