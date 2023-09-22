package com.jakegodsall.audiophilerestapi.services;

import com.jakegodsall.audiophilerestapi.payload.ImageDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ImageService {
    public String uploadImageToFilesystem(MultipartFile file) throws IOException;
    public byte[] downloadFileFromFileSystem(String filename) throws IOException;
    public List<ImageDto> getAllImages();
    public ImageDto getImageById(long id);
    public void deleteImageById(long id);

}
