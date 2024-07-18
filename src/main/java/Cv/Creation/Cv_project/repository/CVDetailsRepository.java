package Cv.Creation.Cv_project.repository;

import Cv.Creation.Cv_project.model.CVDetails;
import Cv.Creation.Cv_project.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CVDetailsRepository extends JpaRepository<CVDetails,Long> {

}
