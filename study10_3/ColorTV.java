package study10_3;

class ColorTV extends TV {
	private int resolution;
	public ColorTV(int size,int resolution) {
		super(size);
		this.resolution=resolution;
	}
	protected int getResolution() {
		return resolution;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+resolution+"컬러\n");
	}
}
