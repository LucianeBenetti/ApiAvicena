package br.com.marcoapps.apiavicena.model.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.marcoapps.apiavicena.model.vo.Consulta;

public class ListaConsultasDTO {

    private List<ConsultaDTO> listaConsultasDTO;

    public ListaConsultasDTO(List<ConsultaDTO> listaConsultasDTO) {
        this.listaConsultasDTO = listaConsultasDTO;
    }

    public ListaConsultasDTO() {
    }

    public List<ConsultaDTO> getListaConsultasDTO() {
        return listaConsultasDTO;
    }

    public void setListaConsultasDTO(List<ConsultaDTO> listaConsultasDTO) {
        this.listaConsultasDTO = listaConsultasDTO;
    }

    public List<Consulta> getConsultas(){

        List<Consulta> consultas = new ArrayList<>();
        for(int i = 0; i<listaConsultasDTO.size(); i++) {
            Consulta c = new Consulta();
            c.setPaciente(listaConsultasDTO.get(i).getPacienteVO().getPaciente());
            c.setHorarioConsulta(listaConsultasDTO.get(i).getHorarioConsulta());
            c.setDataConsulta(listaConsultasDTO.get(i).getDataConsulta());
            c.getDataConsulta().compareTo(listaConsultasDTO.get(i).getDataConsulta());
            c.setAtencaoEspecial(listaConsultasDTO.get(i).getAtencaoEspecial());
            c.setCodigoConsulta(listaConsultasDTO.get(i).getCodigoConsulta());
            consultas.add(c);
        }
        return consultas;
    }

}
