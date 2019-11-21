public class Calcul{
    public static void main(String[] args){
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        char operande = args[2].charAt(0);

        if(operande == '+') {
            System.out.println("Le resultat est "+ (first+second));
        
        }else if(operande == '-'){
            System.out.println("Le resultat est "+ (first-second));
        }else if(operande == 'x' || operande == 'X' ){
            System.out.println("Le resultat est "+ (first*second));
        }else if(operande == ':'){
            System.out.println("Le resultat est "+ (first/second));
        }else{
            System.out.println("Parametres invalides ");
        }
    }
}