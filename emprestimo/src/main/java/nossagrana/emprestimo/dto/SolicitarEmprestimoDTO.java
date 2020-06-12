package nossagrana.emprestimo.dto;

import java.time.ZonedDateTime;

public class SolicitarEmprestimoDTO {
    private double montante;
    private ZonedDateTime dataVencimento;

    public SolicitarEmprestimoDTO(double montante, ZonedDateTime dataVencimento) {
        this.montante = montante;
        this.dataVencimento = dataVencimento;
    }

    public SolicitarEmprestimoDTO() {
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    public ZonedDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(ZonedDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
