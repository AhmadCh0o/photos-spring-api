package com.restapidemo.photos.clone.Repository;

import org.springframework.data.repository.CrudRepository;

import com.restapidemo.photos.clone.model.Photo;

public interface PhotosRepository extends CrudRepository<Photo, Integer> {
    
}
