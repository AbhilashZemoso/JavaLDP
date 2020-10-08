

import processing.core.*;

public class LearnPApplet extends PApplet{
	private String URL = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSncgaoXuHl8dU_vj0YJuRosYJ6D1nB0x5yqw&usqp=CAU";
	private PImage backgroundImg;
	
	public void setup() {
		size(200,200);
		backgroundImg = loadImage(URL,"jpg");
		backgroundImg.resize(0,height);
		image(backgroundImg,0,0);
	}
	
	public void draw() {
		int []color = sunColorSec(second());
		fill(color[0],color[1],0);
		ellipse(width/4,height/4,width/5,height/5);
	}	
	
	private int[] sunColorSec(float seconds) {
		int[] rcb = new int[2];
		float diff = Math.abs(30-seconds);
		
		float ratio = diff/30;
		
		rcb[0] = (int)(255*ratio);
		rcb[1] = (int)(255*ratio);
		
		return rcb;
	}
}


