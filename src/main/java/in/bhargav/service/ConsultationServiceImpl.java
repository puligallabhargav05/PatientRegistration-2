package in.bhargav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bhargav.entities.Consultation;
import in.bhargav.repo.ConsultationRepo;

@Service
public class ConsultationServiceImpl implements ConsultationService {
	
	  @Autowired
	  private ConsultationRepo consultationRepo;

	@Override
	public Consultation saveConsultation(Consultation consultation) {
		
		return consultationRepo.save(consultation);
		
	}

	@Override
	public Consultation updateConsultation(Consultation consultation) {
		
		return consultationRepo.save(consultation);
	}

	@Override
	public void deleteConsultation(Consultation consultation) {
		consultationRepo.delete(consultation);
		   
	}

	@Override
	public Consultation findById(int id) {
		
		return consultationRepo.findById(id).get();
		
	}

	@Override
	public List<Consultation> findAll() {
		
	  return consultationRepo.findAll();
		 
	}

	@Override
	public List<Consultation> findByPatientid(int patientid) {
		
		return consultationRepo.findByPatientid(patientid);
		
	}

}
