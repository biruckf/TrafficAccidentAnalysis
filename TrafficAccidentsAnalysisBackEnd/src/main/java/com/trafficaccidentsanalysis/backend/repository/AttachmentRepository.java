package com.trafficaccidentsanalysis.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trafficaccidentsanalysis.backend.model.Attachment;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {

}
