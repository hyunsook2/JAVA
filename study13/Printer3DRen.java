package study13;

interface Material {
	public abstract void doPrinting();
}

class Powder extends Object implements Material {
	@Override
	public String toString() {
		return "사용물질:파우더";
	}

	@Override
	public void doPrinting() {
		System.out.println("파우더 제품 제작중...");
	}
}

class Plastic implements Material {
	@Override
	public String toString() {
		return "사용물질:플라스틱";
	}

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 제품 제작중...");
	}
}

class Print3D<T extends Material> {
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	public String toString() {
		return material.toString();
	}

	public void printing() {
		material.doPrinting();
	}
}

public class Printer3DRen {
	public static void main(String[] args) {
		Print3D<Powder> pPo = new Print3D<>();
		pPo.setMaterial(new Powder());
		System.out.println(pPo.toString());
		pPo.printing();
		
		Print3D<Plastic> pPl = new Print3D<>();
		pPl.setMaterial(new Plastic());
		System.out.println(pPl.toString());
		pPl.printing();
		
		Print3D<Material> pMa = new Print3D<>();
		pMa.setMaterial(new Powder());
		System.out.println(pMa.toString());
		pMa.printing();
		pMa.setMaterial(new Plastic());
		System.out.println(pMa.toString());
		pMa.printing();
		
	}
}