package project.shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.shop.Entity.CSBoard;

@Repository
public interface CSBoardRepository extends JpaRepository<CSBoard, Long> {




}
