package br.com.home.api_flowable_labs.dto;

import java.time.LocalDateTime;

public class TaskInstanceDTO {

    private Long id;
    private String name;
    private LocalDateTime create;
    private LocalDateTime end;
    private Long idUsuario;
    private String dsNome;
    private Boolean isOpen;
    private String nameFluxo;

    public TaskInstanceDTO(Long id, String name, LocalDateTime create, LocalDateTime end,
                           Long idUsuario, String dsNome, Boolean isOpen, String nameFluxo) {
        this.id = id;
        this.name = name;
        this.create = create;
        this.end = end;
        this.idUsuario = idUsuario;
        this.dsNome = dsNome;
        this.isOpen = isOpen;
        this.nameFluxo = nameFluxo;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreate() {
        return create;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getDsNome() {
        return dsNome;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public String getNameFluxo() {
        return nameFluxo;
    }
}
