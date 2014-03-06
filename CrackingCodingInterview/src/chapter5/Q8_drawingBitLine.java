package chapter5;

public class Q8_drawingBitLine {
	
	//Drawing the line from a screen: 
	public static void drawBitLine(byte[] screen, int width, int x1, int x2, int y){
		int bytesEachRow = width/8;
		
		if(x1 < x2 || x1<=0 || x2>width){
			System.out.println("Exception that the inputs are problematic; ");
			return;
		}
		
		int x1Byte = x1/8;
		int x1Extra = x1%8;
		 
		int x2Byte = x2/8;
		int x2Extra = x2%8;
		
		int x1ByteInArray = y*bytesEachRow+x1Byte;
		int x2ByteInArray = y*bytesEachRow+x2Byte;
		
		byte maskX1 = (byte)((0xff)>>x1);
		byte maskX2 = (byte)((0xff)<<(7-x2));
		
		if(x1ByteInArray!=x2ByteInArray){
			screen[x1ByteInArray] = (byte) (screen[x1ByteInArray]|maskX1);
			screen[x2ByteInArray] = (byte) (screen[x2ByteInArray]|maskX2);
			for(int i = x1ByteInArray+1; i < x2ByteInArray; i++){
				screen[i] = (byte)(0xff);
			}
			return;
		} else if(x1ByteInArray ==  x2ByteInArray){
			byte maskSameByte = (byte)(maskX1&maskX2);
			screen[x1ByteInArray] = (byte) (screen[x1ByteInArray]|maskSameByte);
			return;
		}
	}

}
