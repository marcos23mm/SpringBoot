package org.example.springbiblioteca;

import org.example.springbiblioteca.ServicioUsuario;
import org.example.springbiblioteca.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class ControlUsuario {

    @Autowired
    private ServicioUsuario servicioUsuario;

    @GetMapping
    public List<usuario> listarUsuarios() {
        return servicioUsuario.listarUsuarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<usuario> buscarUsuarioPorId(@PathVariable Integer id) {
        usuario usuario = servicioUsuario.buscarPorId(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public usuario guardarUsuario(@RequestBody usuario usuario) {
        return servicioUsuario.guardarUsuario(usuario);
    }

    @PostMapping("/parametros")
    public usuario guardarUsuarioConParametros(
            @RequestParam String dni,
            @RequestParam String nombre,
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String tipo,
            @RequestParam(required = false) String penalizacion_hasta
    ) {
        usuario usuario = new usuario();
        usuario.setDni(dni);
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(password);
        usuario.setTipo(tipo);

        if (penalizacion_hasta != null) {
            usuario.setPenalizacion_hasta(LocalDate.parse(penalizacion_hasta));
        }

        return servicioUsuario.guardarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<usuario> actualizarUsuario(@PathVariable Integer id, @RequestBody usuario usuario) {
        usuario usuarioActualizado = servicioUsuario.actualizarUsuario(id, usuario);
        if (usuarioActualizado != null) {
            return ResponseEntity.ok(usuarioActualizado);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Integer id) {
        servicioUsuario.eliminarUsuario(id);
        return ResponseEntity.noContent().build();
    }
}
