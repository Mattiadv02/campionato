package it.unimol.campionato;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unimol.campionato.Squadre;
import it.unimol.campionato.SquadreRepository;

@Service

public class PartiteService {
    private SquadreRepository squadreRepository;

    @Autowired
    public PartiteService(SquadreRepository squadreRepository) {
        this.squadreRepository = squadreRepository;
    }

    public List<Squadre> getAllSquadre() {
        return this.squadreRepository.findAll();
    }

    public void insertSquadre() {
        List<Squadre> squadre = new ArrayList<Squadre>();

        squadre.add(new Squadre(1, "Napoli", "NAP", "https://upload.wikimedia.org/wikipedia/it/thumb/e/ed/SSC_Napoli_2007.svg/1200px-SSC_Napoli_2007.svg.png"));
        squadre.add(new Squadre(2, "Juventus", "JUV", "https://cdn.tuttosport.com/images/2017/01/16/234043823-390c6553-ad33-4f97-8606-6d050b73c2a1.jpg"));
        squadre.add(new Squadre(3, "Milan", "MIL", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Logo_of_AC_Milan.svg/1306px-Logo_of_AC_Milan.svg.png"));


        for (Squadre a : squadre) {
            Squadre squadra = new Squadre(a.getId(), a.getNome(), a.getAbbreviazione(), a.getImgUrl());

            this.squadreRepository.save(squadra);
        }
    }
}
