import Personnage.*;

    public class jeuPersonnage {
        public static void main (String args[]) {

            Personnage UnPilier = new Personnage ("Tanjiro", 200);
            Personnage UneLuneSuperieur = new Personnage ("Muzan", 500);

            System.out.println("Le pourfendeur " + UnPilier.getNom() + " (" + UnPilier.getVie() + " HP), est à la recherche d'un démon se trouvant sur le Mont Fuji et qu'il doit décapiter. Tel est sa nouvelle mission");

            System.out.println("La nuit tombée, il tombe nez à nez avec le démon");

            System.out.println("Le démon est : " + UneLuneSuperieur.getNom() + " (" + UneLuneSuperieur.getVie() + " HP)");

            System.out.println(UnPilier.getNom() + " attaque " + UneLuneSuperieur.getNom() + " avec un sabre (dégâts " +  UnPilier.attack(100) + ") " + UneLuneSuperieur.getNom() + " en vie ? " + UneLuneSuperieur.degat(UnPilier.attack(100)) + " (" + UneLuneSuperieur.getVie() + " HP)");

            System.out.println(UneLuneSuperieur.getNom() + " ricane");

            System.out.println(UneLuneSuperieur.getNom() + " riposte en se ruant sur " + UnPilier.getNom() + " et enlève (dégâts " + UneLuneSuperieur.attack(150) + ") " + UnPilier.getNom() + " en vie ? " + UnPilier.degat(UneLuneSuperieur.attack(150)) + " (" + UnPilier.getVie() + "HP)");

            System.out.println(UnPilier.getNom() + " mal en point donne tout ce qu'il a dans sa technique la plus puissante afin de pouvoir décapiter le démon, 'Hinokami Kagura' sur " + UneLuneSuperieur.getNom() + " (dégâts " + UnPilier.attack(400) + ") " + UneLuneSuperieur.getNom() + " en vie ? " + UneLuneSuperieur.degat(UnPilier.attack(400)) + " (" + UneLuneSuperieur.getVie() + " HP)");

            if(UnPilier.getVie()>0)
                System.out.println(UnPilier.getNom() + " -> aaaa..aaaa.mission...réussie");
            else
                System.out.println(UnPilier.getNom() + " -> arrgh!!");

            if(UneLuneSuperieur.getVie()>0)
                System.out.println(UneLuneSuperieur.getNom() + " -> je suis immortel après tout, hahahah");
            else
                System.out.println(UneLuneSuperieur.getNom() + " -> impo..ssi..ble..arrgh!!");
        }
    }
