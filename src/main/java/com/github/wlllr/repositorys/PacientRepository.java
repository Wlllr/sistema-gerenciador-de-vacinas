package com.github.wlllr.repositorys;

import com.github.wlllr.models.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacientRepository extends JpaRepository<Pacient, Long> {}
