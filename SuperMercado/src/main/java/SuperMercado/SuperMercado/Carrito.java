package SuperMercado.SuperMercado;

import java.util.LinkedList;
import java.util.List;

public class Carrito {

	private List<Producto>productos = new LinkedList<Producto>();
	private Integer total;
	
	public Integer CalcularTotal(){
		Integer res = 0;
		for (Producto producto : productos) {
			res = res + producto.getPrecio();
		}
		
		return res;
	}
	
	
	public void addProducto(Producto p){
		this.productos.add(p);
	}
	
	public void removeProducto(Producto p){
		this.productos.remove(p);
		}
	
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	
	
}
