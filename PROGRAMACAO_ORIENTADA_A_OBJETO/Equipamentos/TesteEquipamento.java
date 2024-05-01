package Equipamentos;

public class TesteEquipamento {

    public static void main(String[] args) {
        Equipamento equip = new Equipamento(220, "Heltec");
        System.out.println(equip.toString());


        Computador compt = new Computador(220 , "Heltec", "Ryzen", "500GB");

        System.out.println(compt.toString());

        System.out.println(equip.getFonte());
        System.out.println(equip.getMarca());

        equip.setFonte(110);



    }
}