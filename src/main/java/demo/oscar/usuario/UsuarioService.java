package demo.oscar.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario save(Usuario entity){
        return usuarioRepository.save(entity);
    }
    
    public Usuario findById(long id){
        return usuarioRepository.findById(id).orElse(null);
    }

    public void deleteById(long id){
        usuarioRepository.deleteById(id);
    }

}
