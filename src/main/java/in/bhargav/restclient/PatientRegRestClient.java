package in.bhargav.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.bhargav.dto.Patient;



@FeignClient("Patient-registration-service")
public interface PatientRegRestClient {
	  @GetMapping("/patientregistration/patients/{id}")
	   Patient getPatientDetails(@PathVariable("id") int id);

}
