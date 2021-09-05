package org.una.inventario.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.una.inventario.dto.DepartamentoDTO;
import org.una.inventario.dto.UsuarioDTO;
import org.una.inventario.services.IDepartamentoService;
import org.una.inventario.services.IUsuarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departamentos")
@Api(tags = {"/departamentos"})
class DepartantoController {

//    @Autowired
//    private IDepartamentoService departamentoService;
//

//    @ApiOperation(value = "Obtiene una lista de todos los Departamentos", response = DepartamentoDTO.class, responseContainer = "List", tags = "Departamentos")
//    @GetMapping()
//    public @ResponseBody
//    ResponseEntity<?> findAll() {
//        Optional<List<DepartamentoDTO>> result = departamentoService.findAll();
//        return new ResponseEntity<>(result, HttpStatus.OK);
//    }
//
//    @ApiOperation(value = "Obtiene una departamento a partir de su id", response = DepartamentoDTO.class, tags = "Departamentos")
//    @GetMapping("/{id}")
//    public ResponseEntity<?> findById(@PathVariable(value = "id") Long id) {
//        Optional<DepartamentoDTO> departamentoFound = departamentoService.findById(id);
//        return new ResponseEntity<>(departamentoFound, HttpStatus.OK);
//
//    }

//    @ApiOperation(value = "Inicio de sesión para conseguir un token de acceso", response = UsuarioDTO.class, tags = "Seguridad")
//    @PutMapping("/login")
//    @ResponseBody
//    public ResponseEntity<?> login(@PathVariable(value = "cedula") String cedula, @PathVariable(value = "password") String password) {
//        Optional<UsuarioDTO> usuarioFound = usuarioService.login(cedula, password);
//        return new ResponseEntity<>(usuarioFound, HttpStatus.OK);
//
//    }


//    @GetMapping("/cedula/{term}")
//    public ResponseEntity<?> findByCedulaAproximate(@PathVariable(value = "term") String term) {
//        try {
//            Optional<List<UsuarioDTO>> result = usuarioService.findByCedulaAproximate(term);
//            if (result.isPresent()) {
//                return new ResponseEntity<>(result, HttpStatus.OK);
//            } else {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//        } catch (Exception e) {
//            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

//    @GetMapping("/nombre/{term}")
//    public ResponseEntity<?> findByNombreCompletoAproximateIgnoreCase(@PathVariable(value = "term") String term) {
//        try {
//            Optional<List<UsuarioDTO>> result = usuarioService.findByNombreCompletoAproximateIgnoreCase(term);
//            if (result.isPresent()) {
//                return new ResponseEntity<>(result, HttpStatus.OK);
//            } else {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//        } catch (Exception e) {
//            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

//    @ResponseStatus(HttpStatus.OK)
//    @PostMapping("/")
//    @ResponseBody
//    public ResponseEntity<?> create(@RequestBody UsuarioDTO usuarioDTO) {
//        try {
//            Optional<UsuarioDTO> usuarioCreated = usuarioService.create(usuarioDTO);
//            return new ResponseEntity<>(usuarioCreated, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @PutMapping("/{id}")
//    @ResponseBody
//    public ResponseEntity<?> update(@PathVariable(value = "id") Long id, @RequestBody UsuarioDTO usuarioModified) {
//        try {
//            Optional<UsuarioDTO> usuarioUpdated = usuarioService.update(usuarioModified, id);
//            if (usuarioUpdated.isPresent()) {
//                return new ResponseEntity<>(usuarioUpdated, HttpStatus.OK);
//
//            } else {
//                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//
//            }
//        } catch (Exception e) {
//            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) throws Exception {
//        try {
//            usuarioService.delete(id);
//            return new ResponseEntity<>("Ok", HttpStatus.OK);
//
//        } catch (Exception e) {
//            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    @DeleteMapping("/")
    public ResponseEntity<?> deleteAll() throws Exception {
//        //TODO: Implementar este método
        throw new Exception("Not implemented Function");

    }

}