package Equipamentos;
public class Equipamento {

    private int fonte;
    private String marca;


    public Equipamento ( int fonte_, String marca_){
        this.fonte = fonte_;
        this.marca = marca_;

    }

    public int getFonte(){
        return this.fonte;

    }

    public String getMarca(){
        return this.marca;
    }

    public int setFonte( int potencia){
        return this.fonte = potencia;

    }
    

    public String setMarca( String modelo){
        return this.marca = modelo;

    }




    public String toString(){
        return "Fonte " + this.fonte + "\n" + 
                "Marca" + this.marca;
    }


}