package org.una.inventario.services;

import org.una.inventario.dto.UsuarioDTO;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {

    public Optional<List<UsuarioDTO>> findAll();

    public Optional<UsuarioDTO> findById(Long id);

    public Optional<List<UsuarioDTO>> findByCedulaAproximate(String cedula);

    public Optional<List<UsuarioDTO>> findByNombreCompletoAproximateIgnoreCase(String nombreCompleto);

    public Optional<UsuarioDTO> create(UsuarioDTO usuarioDTO);

    public Optional<UsuarioDTO> update(UsuarioDTO usuarioDTO, Long id);

    public void delete(Long id);

    public void deleteAll();

    public Optional<UsuarioDTO> login(String cedula,String password);

    Optional<List<UsuarioDTO>> findByDepartamentoId(String id);
}
