package com.trafficaccidentsanalysis.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trafficaccidentsanalysis.backend.model.Attachment;
import com.trafficaccidentsanalysis.backend.service.AttachmentService;

@RestController
@RequestMapping("/trafficaccidentanalysis/attachment")
public class AttachmentController {
	
	@Autowired
	private AttachmentService attachmentService;
	
	@PostMapping("/save")
	public Attachment saveAttachment(@RequestBody Attachment attachment) {
		return attachmentService.saveAttachment(attachment);
		
	}
	
	@GetMapping("/getall")
	public List<Attachment> getAllAttachment(){
		return attachmentService.getAllAttachment();
		
	}
	@PutMapping("/update")
	public Attachment updateAttachment(@RequestBody Attachment attachment) {
		return attachmentService.updateAttachment(attachment);
	}	

}
