package br.usp.poo.allpet.service;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import br.usp.poo.allpet.model.Image;
import br.usp.poo.allpet.repository.ImageRepository;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;
    
    public void saveImage(MultipartFile file) {
    	String fileName = StringUtils.cleanPath( file.getOriginalFilename() );

    	Image i = new Image(null, fileName, "tipo", null, null);
    	
    	try {
			i.setContent(Base64.getEncoder().encodeToString( file.getBytes() ));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	imageRepository.save(i);
    }
}
