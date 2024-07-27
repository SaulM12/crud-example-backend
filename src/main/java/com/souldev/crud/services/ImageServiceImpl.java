package com.souldev.crud.services;

import com.souldev.crud.entities.Image;
import com.souldev.crud.repositories.ImageRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class ImageServiceImpl implements ImageService {

    private final CloudinaryService cloudinaryService;
    private final ImageRepository imageRepository;

    public ImageServiceImpl(CloudinaryService cloudinaryService, ImageRepository imageRepository) {
        this.cloudinaryService = cloudinaryService;
        this.imageRepository = imageRepository;
    }

    @Override
    public Image uploadImage(MultipartFile file) throws IOException {
        Map uploadResult = cloudinaryService.upload(file);
        String imageUrl = (String) uploadResult.get("url");
        String imageId = (String) uploadResult.get("public_id");
        Image image = new Image(file.getOriginalFilename(), imageUrl, imageId);
        return imageRepository.save(image);
    }

    @Override
    public void deleteImage(Image image) throws IOException {
        cloudinaryService.delete(image.getImageId());
        imageRepository.deleteById(image.getId());
    }


}
