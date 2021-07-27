package br.usp.poo.allpet.controller;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.usp.poo.allpet.model.Image;
import br.usp.poo.allpet.repository.ImageRepository;
import br.usp.poo.allpet.service.AnuncioService;
import br.usp.poo.allpet.service.ImageService;

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
    /*
    @PostMapping("/upload")
    public BodyBuilder upload(@RequestParam MultipartFile file) throws IOException {
            System.out.println("Original Image Byte Size - " + file.getBytes().length);
            Image img = new Image(null, file.getOriginalFilename(), file.getContentType(), file.getBytes());
            
            imageRepository.save(img);
            
            return ResponseEntity.status(HttpStatus.OK);
        }
    */

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile file) {
    	imageService.saveImage(file);
    	return "done";
    }
    /*
        @GetMapping(path = { "/get/{imageName}" })
        public Image getImage(@PathVariable("imageName") String imageName) throws IOException {
            Optional<Image> retrievedImage = imageRepository.findByName(imageName);
            Image img = new Image(null, retrievedImage.get().getName(), retrievedImage.get().getType(),
            		retrievedImage.get().getPicBytes());
            return img;
        }
    */
}
