package dev.matheusbruno.jpa_course.repositories;

import dev.matheusbruno.jpa_course.models.ReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<ReviewModel, UUID> {
}
