package com.ufpb.remais.repository;

import com.ufpb.remais.model.Material;
import com.ufpb.remais.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MaterialRepository extends JpaRepository<Material, Long> {

    Page <Material> getMaterialByAuthorId(Long id, Pageable pageable);

    Page <Material> getMaterialByAuthorUid(String id, Pageable pageable);


    Page <Material> getMaterialByCategoryId(Long id, Pageable pageable);


    List<Material> findAllByAuthorIdOrderByCreatedAtDesc(Long id);

}
