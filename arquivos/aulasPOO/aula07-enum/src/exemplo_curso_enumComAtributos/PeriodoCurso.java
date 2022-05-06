package exemplo_curso_enumComAtributos;

public enum PeriodoCurso {
	INTEGRAL("segunda a sexta", 80, 3600),
	NOTURNO("terça e quinta", 40, 1200),
	MANHA("quarta e sexta", 60, 2400);
	
	private String diasDaSemana;
	private int cargaHoraria;
	private double valor;
	
	private PeriodoCurso(String diasDaSemana, int cargaHoraria, double valor) {
		this.diasDaSemana = diasDaSemana;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public String getDiasDaSemana() {
		return diasDaSemana;
	}

	public void setDiasDaSemana(String diasDaSemana) {
		this.diasDaSemana = diasDaSemana;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
