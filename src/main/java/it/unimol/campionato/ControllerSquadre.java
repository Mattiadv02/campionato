package it.unimol.campionato;


import it.unimol.campionato.Squadre;
import it.unimol.campionato.PartiteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/squadre")

public class ControllerSquadre {
    private PartiteService partiteService;

    @Autowired
    public ControllerSquadre(PartiteService partiteService) {
        this.partiteService = partiteService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Squadre>> getAllSquadreHandler() {
        this.partiteService.insertSquadre();

        return ResponseEntity.ok(this.partiteService.getAllSquadre());
    }
}
