package SuperMercado.SuperMercado;

public class Cliente {
	
	private String nombre;
	private Carrito carrito;
	
	public Cliente(String nombre){
		this.nombre = nombre;
		this.carrito = new Carrito();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
	
  public Integer calcularTotal(){
	 return this.carrito.CalcularTotal();
  }
  
  public void cargarEnCarrito(Producto p){
	  this.carrito.addProducto(p);
  }
  
  public void sacarDelCarrito(Producto p){
	  this.carrito.removeProducto(p);
  }
  

}
