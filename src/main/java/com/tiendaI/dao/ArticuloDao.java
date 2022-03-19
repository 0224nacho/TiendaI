
package com.tiendaI.dao;

import com.tiendaI.model.Articulo;
import org.springframework.data.repository.CrudRepository;


public interface ArticuloDao extends CrudRepository<Articulo,Long>{
    
}
