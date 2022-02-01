package sprint1.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import sprint1.hospital.dto.*;
import sprint1.hospital.entity.ChargesSG;

public interface ChargesRepo extends JpaRepository<ChargesSG, Integer> {

	Iterable<ChargesSG> findBySname(String sname);
	
	@Query("SELECT new sprint1.hospital.dto.ChargesPatient(c.sname, c.amount, p.pid, p.pname) FROM ChargesSG c JOIN c.patient p where c.sname = :cp")
	public Iterable<ChargesPatient> getJoinCP(@Param("cp") String cp);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM surgerycharges c where c.sname = :sname", nativeQuery = true)
	void deleteBySname(@Param("sname") String sname);
}