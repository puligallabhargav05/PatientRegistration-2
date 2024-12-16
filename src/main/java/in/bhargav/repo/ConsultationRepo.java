package in.bhargav.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bhargav.entities.Consultation;

public interface ConsultationRepo extends JpaRepository<Consultation, Integer> {
	
	public List<Consultation> findByPatientid(int patientid);

}
