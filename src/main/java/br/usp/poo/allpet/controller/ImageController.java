package br.usp.poo.allpet.controller;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.usp.poo.allpet.model.Image;
import br.usp.poo.allpet.repository.ImageRepository;
import br.usp.poo.allpet.service.AnuncioService;
import br.usp.poo.allpet.service.ImageService;
import br.usp.poo.allpet.viewmodel.ImageViewModel;

@RestController
@RequestMapping("/image")
public class ImageController {

    @Autowired
    private ImageRepository imageRepository;
    @Autowired
    private ImageService imageService;
    
    @GetMapping("/upload")
    public ModelAndView view() {
    	return new ModelAndView("image/upload");
    }
    
    @PostMapping("/post")
    public String upload(@RequestParam MultipartFile file) throws IOException {
            System.out.println("Original Image Byte Size - " + file.getBytes().length);
            Image img = new Image(null, file.getOriginalFilename(), file.getContentType(), file.getBytes(), null);
            
            imageRepository.save(img);
            
            return "done";
        }
    
    /*
    @PostMapping("/post")
    public String upload(@RequestParam MultipartFile imgFile) {
    	System.out.println("\n\n---- entrei 00000-----");
    	imageService.saveImage(imgFile);
    	return "done";
    }
    */
    
        @GetMapping("get/{imageName}")
        public ModelAndView getImage(@PathVariable("imageName") String imageName) throws IOException {
            Optional<Image> retrievedImage = imageRepository.findByName(imageName);
            Image img = new Image(null, retrievedImage.get().getName(), retrievedImage.get().getType(),
            		retrievedImage.get().getPicBytes(), null);
            //return img;
            ImageViewModel ivm = new ImageViewModel(img);
            return new ModelAndView("image/get", ivm.getParams());
            
        }
    
}
