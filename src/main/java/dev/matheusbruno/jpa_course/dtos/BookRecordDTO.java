package dev.matheusbruno.jpa_course.dtos;

import java.util.Set;
import java.util.UUID;

public record BookRecordDTO(
        String title,
        UUID publisherId,
        Set<UUID> authorIds,
        String reviewComment
) {
}
