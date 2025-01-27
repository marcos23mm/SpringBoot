package org.example.demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerEdificio {

    @Autowired
    private Edificio edificio;

    @GetMapping
    public ResponseEntity<Edificio> getEdificio() {
        System.out.println(edificio.toString());
        return ResponseEntity.ok(edificio);
    }

}
