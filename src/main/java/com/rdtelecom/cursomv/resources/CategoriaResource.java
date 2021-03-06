package com.rdtelecom.cursomv.resources;

import com.rdtelecom.cursomv.domain.Categoria;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
    
    
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar(){
          
        Categoria cat1 = new Categoria(1, "Informática");
        Categoria cat2 = new Categoria(2, "Esctitório");
        
        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);
      
        return lista;
    }

}
