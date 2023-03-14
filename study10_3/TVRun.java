package study10_3;

public class TVRun {
	public static void main(String[] args) {
		ColorTV ctv = new ColorTV(32,1024);//size,resolution
		ctv.printProperty();
		//32인치 1024컬러
		IPTV iptv = new IPTV(64,2048,"192.1.1.4");//address,size...
		iptv.printProperty();
		//IPTV는 192.1.1.4 주소의 64인치 2048컬러
		
	}
}