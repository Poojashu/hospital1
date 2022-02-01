package sprint1.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sprint1.hospital.dto.StaffPatient;
import sprint1.hospital.entity.StaffsSG;

@Repository
public interface StaffsRepo extends JpaRepository<StaffsSG, Integer> {

	Iterable<StaffsSG> findBySname(String sname);

	@Query("SELECT new sprint1.hospital.dto.StaffPatient(s.sid, s.sname, p.pid, p.pname, p.proom) FROM StaffsSG s JOIN s.patient p where s.sid = :sp")
	public Iterable<StaffPatient> getJoinSP(@Param("sp") int sp);
}