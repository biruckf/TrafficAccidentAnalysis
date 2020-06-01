package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Attachment;

@Service
public interface AttachmentService {
	
	List<Attachment> getAllAttachment();
	Attachment saveAttachment(Attachment attachment);
	ResponseEntity<?> deleteAttachment(Attachment Attachment);
	Attachment updateAttachment(Attachment attachment);
}



