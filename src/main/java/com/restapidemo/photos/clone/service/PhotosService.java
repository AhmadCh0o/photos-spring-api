package com.restapidemo.photos.clone.service;



import org.springframework.stereotype.Service;

import com.restapidemo.photos.clone.Repository.PhotosRepository;
import com.restapidemo.photos.clone.model.Photo;

@Service
public class PhotosService {
    
    private final PhotosRepository photosRepository;

    public PhotosService(PhotosRepository photosRepository) {
        this.photosRepository = photosRepository;
    }

    public Iterable<Photo> get() {
        return photosRepository.findAll();
    }

    public Photo get(Integer id) {
        return photosRepository.findById(id).orElse(null);
    }

    public void remove(Integer id) {
         photosRepository.deleteById(id);
    }

    public Photo save(String fileName, String contentType ,byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        photo.setFileName(fileName);
        photo.setData(data);
        photosRepository.save(photo);
        return photo;
    }
}
