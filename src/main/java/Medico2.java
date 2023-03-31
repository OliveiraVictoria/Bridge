public class Medico2 extends Cargo {

    public Medico2(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.funcao.percentualAumento());
    }

}
