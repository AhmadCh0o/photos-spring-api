package com.restapidemo.photos.clone.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotEmpty;

@Table("PHOTOS")
public class Photo {
    
    @Id
    private Integer id;

    private String contentType;

    @NotEmpty
    private String fileName;

    @JsonIgnore
    private byte[] data;

    // constructors
    public Photo() {
        
    }

    // raw data 

    // getters and setters

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
