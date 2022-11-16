package org.soulcodeacademy.helpr.domain;

import org.soulcodeacademy.helpr.domain.enums.StatusChamado;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Chamado {

    //TOTAL DE 8 ATRIBUTOS DENTRO DA CLASSE CHAMADO
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idChamado; //CHAVE PRIMARIA

    @Column (nullable = false, length = 120)
    private String titulo;

    @Column (nullable = false, length = 120)
    private String descricao;


    private LocalDate dataInicial  = LocalDate.now(); //AO INVES DE PASSAR NO PARAMETRO JA DIGO AQUI O VALOR QUE ESSA PROPRIEDADE VAI ASSUMIR

    private LocalDate dataFinal; //NAO SOU OBRIGADA A POR DATA DE FECHAMENTO, POIS DEPENDE SE ALGUEM JA ATENDEU AO CHAMADO


    @Enumerated(EnumType.STRING)
    private StatusChamado status = StatusChamado.RECEBIDO; //TODOS OS CHAMADOS COMEÇAM  COM O STATUS RECEBIDO

    @ManyToOne //MUITOS CHAMADOS PARA UM UNICO FUNCIONARIO
    @JoinColumn (name = "id_funcionario") // CHAVE ESTRANGEIRA NA QUAL O NOME DA COLUNA SERÁ id_funcionario
    private Funcionario funcionario; //CHAVE ESTRANGEIRA

    @ManyToOne //MUITOS CHAMADOS PARA UM UNICO CLIENTE
    @JoinColumn (name = "id_cliente") //CHAVE ESTRANGEIRA NA QUAL O NOME DA COLUNA SERÁ id_cliente
    private Cliente cliente; //CHAVE ESTRANGEIRA

    public Chamado (){
    }

    public Chamado (Integer idChamado, String titulo, String descricao){
        //O ENUM NAO VAI DENTRO DO PARAMETRO POIS JA POSSUI VALORES DEFINIDOS //COMO A CLASSE CHAMADO NAO HERDA OUTRA CLASSE E MESMO SE HERDASSE
        // O ATRIBUTO DO TIPO ENUM NAO TIVESSE SIDO PASSADO DENTRO DA SUPER CLASSE QUE ELE HERDOU //POR CONTA DISSO O ENUM É PASSADO NO POPULATESERVICE
        this.idChamado = idChamado;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Integer getIdChamado(){
        return idChamado;
    }

    public void setIdChamado(Integer idChamado){ //ESSE idChamado é o tipo e o nome do atributo
        this.idChamado = idChamado; //ESSE idChamado é o que está dentro do construtor da classe Chamado
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public StatusChamado getStatus() {
        return status;
    }

    public void setStatus(StatusChamado status) {
        this.status = status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}