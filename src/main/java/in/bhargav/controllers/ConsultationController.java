package in.bhargav.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bhargav.dto.Patient;
import in.bhargav.entities.Consultation;
import in.bhargav.restclient.PatientRegRestClient;
import in.bhargav.service.ConsultationService;

@RestController
@RequestMapping("/consultations")
public class ConsultationController {
	
	@Autowired
	private ConsultationService consultationService;
	
	@Autowired
	private PatientRegRestClient patientRegRestClient;
	
	 @GetMapping("/{id}")
	 public Consultation getConsultation(@PathVariable("id") int id)  
	 {
		  Consultation consultation = consultationService.findById(id);
		  
		  return consultation;
		  
	 }
	  @GetMapping("/")
	  public List<Consultation> findAllConsultations(Consultation consultation)
	  {
		  
		  List<Consultation> consultations = consultationService.findAll();
		  
		     return consultations;
		  
		  
	  }
	  
      @PostMapping("/")
	  public Consultation saveConsultationDetails(@RequestBody Consultation consultation)
	  
	  {
    	  // it needs to know the patient details
    	  
    	  System.out.println((consultation.getPatientid()));
    	  Patient patient=patientRegRestClient.getPatientDetails(consultation.getPatientid());
    	  
    	  System.out.println("Patient Details:\n"+patient);
    	    
    	  
    	  Consultation savedConsultation = consultationService.saveConsultation(consultation);
		     
		  return savedConsultation;
	  }
      
      @PutMapping("/")
      public Consultation updateConsultationDetails(@RequestBody Consultation consultation)
      
      {
    	  Consultation updatedConsultation = consultationService.updateConsultation(consultation);
    	  
    	     return updatedConsultation;
      }
      
      @DeleteMapping("/{id}")
     public void deleteConsultation(@PathVariable("id") int id)
     {
    	  Consultation consultation = consultationService.findById(id);
    	  
    	  consultationService.deleteConsultation(consultation);
     }

	
	

}
