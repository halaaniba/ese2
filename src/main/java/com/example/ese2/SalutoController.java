package com.example.ese2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class SalutoController {
    @GetMapping(path = "/saluto/{provincia}")
    public Saluto saluto(
            @RequestParam String nome,
            @PathVariable String provincia) {
        return new Saluto(nome, provincia);
    }
}


