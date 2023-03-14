package study10_3;

class IPTV extends ColorTV {
	private String address;

	public IPTV(int size, int resolution, String address) {
		super(size, resolution);
		this.address = address;
	}

	protected String getAddress() {
		return address;
	}

	public void printProperty() {
		System.out.println(getSize() + "인치 " + getResolution() + "컬러" + "\n주소 : " + address);
	}
}