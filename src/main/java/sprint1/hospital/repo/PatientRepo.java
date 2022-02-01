package sprint1.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sprint1.hospital.entity.PatientSG;

@Repository
public interface PatientRepo extends JpaRepository<PatientSG, Integer> {

	Iterable<PatientSG> findByPid(int pid);

	Iterable<PatientSG> findByPname(String pname);

	Iterable<PatientSG> findByPsurgery(String psurgery);

	Iterable<PatientSG> findByProom(int proom);
	
	Iterable<PatientSG> findByDid(int did);

	Iterable<PatientSG> findBySid(int sid);
}