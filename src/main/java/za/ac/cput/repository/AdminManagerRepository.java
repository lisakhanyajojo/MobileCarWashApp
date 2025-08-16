package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.AdminManager;

import java.util.List;
@Repository
public interface AdminManagerRepository extends JpaRepository<AdminManager , String> {
    List<AdminManager>findByAdminManagerId(String adminManagerId);
}
