package com.secchi.rest.controller;

import com.secchi.rest.controller.dto.MakerDTO;
import com.secchi.rest.service.MakerService;
import com.secchi.rest.util.MakerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/makers")
public class MakerCotroller {

    @Autowired
    private MakerService makerService;

    @GetMapping("/find/{id}")
    public ResponseEntity<MakerDTO> findById(@PathVariable Long id) {
        return makerService.findById(id).map(m ->
                        ResponseEntity.ok(MakerMapper.toDto.apply(m))).
                orElseGet(() -> ResponseEntity.notFound().
                        build());
    }

    @GetMapping("/find")
    public ResponseEntity<List<MakerDTO>> findAll() {
        List<MakerDTO> listMaker =  makerService.findAll().stream().map(
                MakerMapper.toDto).toList();
        return ResponseEntity.of(Optional.of(listMaker));
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody MakerDTO makerDTO) {
            makerService.save(MakerMapper.toEntity.apply(makerDTO));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping ("/save/{id}")
    public ResponseEntity<?> save(@PathVariable Long id, @RequestBody MakerDTO makerDTO) {
            makerService.save(MakerMapper.toEntity.apply(makerDTO));
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id ){
        makerService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
