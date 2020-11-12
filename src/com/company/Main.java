package com.company;
import com.company.display.Display;
import com.company.camera.Camera_module;

public class Main {

    public static void main(String[] args) {
	Display myDisplay = new Display.Builder()
            .withDisplay_id(0)
            .withMatrix_type("IPS")
            .withResolution("1920x1080")
            .withTouch_surface(false)
            .withColor_certification("Vesa Certified DisplayHDR")
            .withSRGB_coverage("99%")
            .build();

	System.out.print(myDisplay.toString());
//		GsonBuilder builder = new GsonBuilder();
//		Gson gson = builder.create();
//		Log.i("GSON", gson.toJson(myDisplay));

	Camera_module myCamera = new Camera_module.Builder()
            .withCamera_id(0)
            .withName("IMX363")
            .withType_of_lens("27mm,f/1.7,OIS")
            .withProducer("Sony")
            .build();
	System.out.print("\n\n"+myCamera.toString());
    }
}
