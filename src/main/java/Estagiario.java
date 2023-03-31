public class Estagiario extends Cargo {

    public Estagiario(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}
