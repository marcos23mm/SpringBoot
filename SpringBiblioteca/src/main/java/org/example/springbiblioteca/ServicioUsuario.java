package org.example.springbiblioteca;

import org.example.springbiblioteca.RepoUsuario;
import org.example.springbiblioteca.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioUsuario {

    @Autowired
    private RepoUsuario repoUsuario;

    public List<usuario> listarUsuarios() {
        return repoUsuario.findAll();
    }

    public usuario buscarPorId(Integer id) {
        return repoUsuario.findById(id).orElse(null);
    }

    public usuario guardarUsuario(usuario usuario) {
        return repoUsuario.save(usuario);
    }

    public usuario actualizarUsuario(Integer id, usuario usuarioActualizado) {
        Optional<usuario> usuarioExistente = repoUsuario.findById(id);
        if (usuarioExistente.isPresent()) {
            usuario usuario = usuarioExistente.get();
            usuario.setDni(usuarioActualizado.getDni());
            usuario.setNombre(usuarioActualizado.getNombre());
            usuario.setEmail(usuarioActualizado.getEmail());
            usuario.setPassword(usuarioActualizado.getPassword());
            usuario.setTipo(usuarioActualizado.getTipo());
            usuario.setPenalizacion_hasta(usuarioActualizado.getPenalizacion_hasta());
            return repoUsuario.save(usuario);
        }
        return null;
    }

    public void eliminarUsuario(Integer id) {
        repoUsuario.deleteById(id);
    }
}
