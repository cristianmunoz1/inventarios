package cm.inventarios.repositorio;

import cm.inventarios.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepositorio extends JpaRepository<Producto, Integer> {

}
