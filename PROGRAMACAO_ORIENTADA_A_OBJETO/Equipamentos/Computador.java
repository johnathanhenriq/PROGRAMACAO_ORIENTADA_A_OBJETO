package Equipamentos;

public class Computador extends Equipamento{

    private String processador;
    private String ssd;



    public Computador (int fonte_, String marca_, String processador_, String ssd_){
        super(fonte_, marca_);
        this.processador = processador_;
        this.ssd = ssd_;
    }
    
    @Override
    public String toString(){
    
        return super.toString() + "\n Processador:" + this.processador + "\n SSD: " + this.ssd;

    }
   

}
