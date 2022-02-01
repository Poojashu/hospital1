package sprint1.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sprint1.hospital.dto.*;
import sprint1.hospital.entity.DoctorSG;

@Repository
public interface DoctorRepo extends JpaRepository<DoctorSG, Integer> {

	Iterable<DoctorSG> findByDname(String dname);
	
	@Query("SELECT new sprint1.hospital.dto.DoctorPatient(d.did, d.dname, p.pid, p.pname, p.psurgery) FROM DoctorSG d JOIN d.patient p where d.did = :dp")
	public Iterable<DoctorPatient> getJoinDP(@Param("dp") int dp);
}