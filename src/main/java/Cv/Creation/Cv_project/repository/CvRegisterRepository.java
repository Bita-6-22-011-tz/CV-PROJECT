package Cv.Creation.Cv_project.repository;

import Cv.Creation.Cv_project.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CvRegisterRepository extends JpaRepository<Register,Long> {
    }
