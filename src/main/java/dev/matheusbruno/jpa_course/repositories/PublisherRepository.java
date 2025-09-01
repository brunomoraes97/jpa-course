package dev.matheusbruno.jpa_course.repositories;

import dev.matheusbruno.jpa_course.models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PublisherRepository extends JpaRepository<PublisherModel, UUID> {
}
