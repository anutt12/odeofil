package com.odeofil.odeofil.repository;

import com.odeofil.odeofil.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository {

    Artist findByName(String artistName);

    Artist findByNameAndIdIsNot(String artistName, Long artistId);

    List<Artist> findByLibraryId(Long artistId);
    Artist findByNameAndArtistId(String name, Long artistId);

    Artist findByNameAndArtistIdAndIdIsNot(String name, Long id, Long artistId);


}