package demo.oscar.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/galeria")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public Usuario save(@RequestBody Usuario entity){
        return usuarioService.save(entity);
    }
    
    @GetMapping("/{id}")
    public Usuario findById(@PathVariable long id){
        return usuarioService.findById(id);
    }

    @PutMapping("/")
    public Usuario update(@RequestBody Usuario entity){
        return usuarioService.save(entity);
    }
}
