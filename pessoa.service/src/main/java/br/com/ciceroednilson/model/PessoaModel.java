package br.com.ciceroednilson.model;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tb_pessoa")
@Entity
public class PessoaModel {
 
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id_pessoa")
	private Integer codigo;
 
	@Column(name="ds_nome")
	private String  nome;
 
	@Column(name="fl_ativo")
	private boolean ativo;
    
	
	 
 
	
	/*public PessoaModel(Integer codigo, String nome, boolean ativo) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.ativo = true;
	}*/
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAtivo() {
		return ativo;
	 }
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}	
 
}