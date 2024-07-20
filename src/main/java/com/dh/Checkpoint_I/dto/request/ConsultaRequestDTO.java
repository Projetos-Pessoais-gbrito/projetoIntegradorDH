package com.dh.Checkpoint_I.dto.request;

import com.dh.Checkpoint_I.model.Dentista;
import com.dh.Checkpoint_I.model.Paciente;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsultaRequestDTO {
    private LocalDateTime dataHoraPaciente;
    private LocalDateTime dataHoraDentista;
    private LocalDateTime dataHoraConsulta;
    private String nomeDentista;
    private String nomePaciente;
}
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//        import lombok.*;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@Builder
//@JsonIgnoreProperties(ignoreUnknown = true)
//public class FilialResponseDTO {
//
//    private String nome;
//    private String rua;
//    private String numero;
//    private String cidade;
//    private String estado;
//    private String cincoEstrelas;
//
//}