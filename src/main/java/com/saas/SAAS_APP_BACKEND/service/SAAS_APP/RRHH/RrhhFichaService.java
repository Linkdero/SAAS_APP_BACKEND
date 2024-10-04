package com.saas.SAAS_APP_BACKEND.service.SAAS_APP.RRHH;

import java.util.List;

import org.springframework.stereotype.Service;

import com.saas.SAAS_APP_BACKEND.entity.SAAS_APP.RRHH.RrhhFicha;
import com.saas.SAAS_APP_BACKEND.repository.SAAS_APP.RRHH.RrhhFichaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RrhhFichaService {
    private final RrhhFichaRepository rrhhFichaRepository;

    public RrhhFicha getFichaPersona(Integer idPersona) {
        return rrhhFichaRepository.findByIdPersona(idPersona);
    }
}