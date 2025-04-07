public class SistemaMedida {
    public static void main (String[] args){
        String sigla = "G";

        /*if(sigla == "P")
            System.out.println("Pequena");

        else if (sigla == "M")
            System.out.println("Media");

        else if (sigla == "G")
            System.out.println("Grande");

        else
            System.out.println("Indefinido");*/

        switch (sigla){
            case "P":{
                System.out.println("Pequena");
                break;}

            case "M":{
                System.out.println("Media");
                break;
            }

            case "G":{
                System.out.println("Grande");
                break;
            }

            default:
                System.out.println("Indefinido");
        }
    }
}
