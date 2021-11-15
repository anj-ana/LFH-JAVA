package mypack;

abstract class Car{
	abstract void Model();
	abstract void Engine();
}

class Dodge extends Car {
	@Override
	void Model() {
		System.out.println("Name:Viper");
	}

	@Override
	void Engine() {
		System.out.println("Engine:Viper V10");
	}
}

class GTR extends Car {
	@Override
	void Model() {
		System.out.println("Name:GTR R35");
	}

@Override
	void Engine() {
		System.out.println("Engine:VR38DETT V6");
	}

}

public class AbstractExample {

	public static void main(String[] args) {
		Dodge d = new Dodge();
		GTR g = new GTR();
		d.Engine();
		g.Engine();
		d.Model();
		g.Model();
		

	}

}
