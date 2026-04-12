package com.gui.taskflow.dto;

import com.gui.taskflow.entity.PrioridadeTarefa;
import com.gui.taskflow.entity.StatusTarefa;

import java.time.LocalDateTime;

public record TarefaResumoResponse(
        Long id,
        String titulo,
        StatusTarefa status,
        PrioridadeTarefa prioridade,
        LocalDateTime dataCriacao
) {
}
