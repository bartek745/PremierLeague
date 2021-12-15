package com.bartek.Premier.modules;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TeamRepository extends JpaRepository<TeamEntity,Long>,
        JpaSpecificationExecutor<TeamEntity> {
}
