package Q29_NumeroComplexo;

public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;

    public NumeroComplexo() {
        this.parteReal = 0;
        this.parteImaginaria = 0;
    }

    public NumeroComplexo(double parteReal) {
        this.parteReal = parteReal;
        this.parteImaginaria = 0;
    }

    public NumeroComplexo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public String toString() {
        if (parteImaginaria >= 0) {
            return parteReal + " + " + parteImaginaria + "i";
        } else {
            return parteReal + " - " + (-parteImaginaria) + "i";
        }
    }


}

