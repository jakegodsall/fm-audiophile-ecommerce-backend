package com.jakegodsall.audiophilerestapi.controllers;

import com.jakegodsall.audiophilerestapi.entities.Image;
import com.jakegodsall.audiophilerestapi.repositories.ImageRepository;
import com.jakegodsall.audiophilerestapi.services.ImageService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/image")
public class ImageUploadController {
    private ImageService service;

    public ImageUploadController(ImageService service) {
        this.service = service;
    }

    @PostMapping()
    public ResponseEntity<?> uploadImage(
            @RequestBody MultipartFile file
            ) throws IOException {
        String uploadedImage = service.uploadImageToFilesystem(file);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(uploadedImage);
    }

    @GetMapping
    public ResponseEntity<List<Image>> getImages() {
        List<Image> images = service.getImagesFromDb();
        return ResponseEntity.status(HttpStatus.OK)
                .body(images);
    }

    @GetMapping("/{fileName}")
    public ResponseEntity<?> downloadImage(
            @PathVariable String fileName
    ) throws IOException {
        byte[] imageData = service.downloadFileFromFileSystem(fileName);
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.valueOf("image/png"))
                .body(imageData);
    }
}
