package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.model.Tutorial;
import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContaining(String title);
}