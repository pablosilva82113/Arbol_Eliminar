
public class Nodo {
	public Nodo Izq;
	public Nodo Der;
	public int Data;
	public Nodo(int Data) {
		this.Data=Data;
		Izq = null;
		Der = null;
	}
	public int obtenerData() {
		return Data;
	}
	public void aignarData(int Data) {
		this.Data=Data;
	}
	public String toString() {
		return " "+Data;
	}
}
