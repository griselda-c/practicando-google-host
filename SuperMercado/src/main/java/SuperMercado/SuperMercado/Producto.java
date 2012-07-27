package SuperMercado.SuperMercado;

public class Producto {
	
	private String nombre;
	private String marca;
	private Integer precio;
	
	public Producto(String nombre, String marca, Integer precio)
	{this.nombre = nombre;
	  this.precio = precio;
	  this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	
	
             
}
