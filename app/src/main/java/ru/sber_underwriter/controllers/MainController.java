package ru.sber_underwriter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.sber_underwriter.services.ClientService;
import ru.sber_underwriter.services.ObligationsService;
import ru.sber_underwriter.models.Client;
import ru.sber_underwriter.models.Obligations;



@RestController
@RequestMapping("/main")
public class MainController {
    private final ClientService clientService;
    private final ObligationsService obligationsService;

    @Autowired
    public MainController(ClientService clientService, ObligationsService obligationsService) {
        this.clientService = clientService;
        this.obligationsService = obligationsService;
    }

    @GetMapping
    public ResponseEntity<Void> updateObligations(@RequestBody Client client) {
        obligationsService.updateBKI(client);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/main/{clientId}")
    public ResponseEntity<Void> updateDSTI(@RequestBody Client client) {
        clientService.updateDSTI(client.getId());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
