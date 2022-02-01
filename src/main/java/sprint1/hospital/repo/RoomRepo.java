package sprint1.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sprint1.hospital.dto.*;
import sprint1.hospital.entity.RoomSG;

public interface RoomRepo extends JpaRepository<RoomSG, Integer> {

	@Query("SELECT new sprint1.hospital.dto.RoomPatient(r.roomno, r.location, p.pid, p.pname) FROM RoomSG r JOIN r.patient p where r.roomno = :rp")
	public Iterable<RoomPatient> getJoinRP(@Param("rp") int rp);
}