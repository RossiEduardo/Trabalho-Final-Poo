package br.usp.poo.allpet.viewmodel;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

//import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import br.usp.poo.allpet.model.Image;

public class ImageViewModel {
	private Map<String, Object> params = new HashMap<>();
	
	public ImageViewModel(Image img) {
		byte[] imgBytes = img.getPicBytes();
		//byte[] imgBytesAsBase64 = Base64.encodeBase(imgBytes);
		byte[] imgBytesAsBase64 = Base64.getEncoder().encode(imgBytes);
		String imgDataAsBase64 = new String(imgBytesAsBase64);
		String imgAsBase64 = "data:image/png;base64," + imgDataAsBase64;
		params.put("img", imgAsBase64);
	}
	
    public Map<String, Object> getParams() {
        return params;
    }
}
