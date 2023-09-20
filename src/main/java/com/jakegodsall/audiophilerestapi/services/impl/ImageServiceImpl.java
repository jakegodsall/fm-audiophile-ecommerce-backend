package com.jakegodsall.audiophilerestapi.services.impl;

import com.jakegodsall.audiophilerestapi.entities.Image;
import com.jakegodsall.audiophilerestapi.repositories.ImageRepository;
import com.jakegodsall.audiophilerestapi.services.ImageService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

@Service
public class ImageServiceImpl implements ImageService {

    private ImageRepository repository;
    private final String FOLDER_PATH = "/Users/jakegodsall/Desktop/testfiles/";

    public ImageServiceImpl(ImageRepository repository) {
        this.repository = repository;
    }

    @Override
    public String uploadImageToFilesystem(MultipartFile file) throws IOException {
        String filePath = FOLDER_PATH + file.getOriginalFilename();
        Image image = new Image();
        image.setName(file.getOriginalFilename());
        image.setType(file.getContentType());
        image.setFilePath(filePath);

        file.transferTo(new File(filePath));

        Image savedImage = repository.save(image);

        if (savedImage != null) {
            return "File uploaded successfully"
                    + file.getOriginalFilename();
        }
        return null;
    }

    @Override
    public byte[] downloadFileFromFileSystem(String filename) throws IOException {
        Optional<Image> image = repository.findByName(filename);
        String filePath = image.get().getFilePath();
        return Files.readAllBytes(new File(filePath).toPath());
    }

    public List<Image> getImagesFromDb() {
        return repository.findAll();
    }
}
