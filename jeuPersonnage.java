import Personnage.*;

    public class jeuPersonnage {
        public static void main (String args[]) {
            Personnage UnPilier = new Personnage ("Tanjiro", 200);
            Personnage UneLuneSuperieur = new Personnage ("Muzan", 500);
            System.out.println("\nLe pourfendeur " + UnPilier.getNom() + " (" + UnPilier.getVie() + " HP), est à la recherche d'un démon se trouvant sur le Mont Fuji et qu'il doit décapiter. Tel est sa nouvelle mission");
            System.out.println("\nLa nuit tombée, il tombe nez à nez avec le démon");
            System.out.println("\nLe démon est : " + UneLuneSuperieur.getNom() + " (" + UneLuneSuperieur.getVie() + " HP)");
            System.out.println("\n" + UnPilier.getNom() + " attaque " + UneLuneSuperieur.getNom() + " avec un sabre (dégâts " +  UnPilier.attack(100) + ") " + UneLuneSuperieur.getNom() + " en vie ? " + UneLuneSuperieur.degat(UnPilier.attack(100)) + " (" + UneLuneSuperieur.getVie() + " HP)");
            System.out.println("\n" + UneLuneSuperieur.getNom() + " ricane");
            System.out.println("\n" + UneLuneSuperieur.getNom() + " riposte en se ruant sur " + UnPilier.getNom() + " et enlève (dégâts " + UneLuneSuperieur.attack(150) + ") " + UnPilier.getNom() + " en vie ? " + UnPilier.degat(UneLuneSuperieur.attack(150)) + " (" + UnPilier.getVie() + "HP)");
            System.out.println("\n" + UnPilier.getNom() + " mal en point donne tout ce qu'il a dans sa technique afin de pouvoir le décapiter, 'Hinokami Kagura' sur " + UneLuneSuperieur.getNom() + " (dégâts " + UnPilier.attack(400) + ") " + UneLuneSuperieur.getNom() + " en vie ? " + UneLuneSuperieur.degat(UnPilier.attack(400)) + " (" + UneLuneSuperieur.getVie() + " HP)");
            if(UnPilier.getVie()>0)
                System.out.println("\n" + UnPilier.getNom() + " -> aaaa..aaaa.mission...réussie");
            else
                System.out.println("\n" + UnPilier.getNom() + " -> arrgh!!");
            if(UneLuneSuperieur.getVie()>0)
                System.out.println("\n" + UneLuneSuperieur.getNom() + " -> je suis immortel après tout, hahahah");
            else
                System.out.println("\n" + UneLuneSuperieur.getNom() + " -> impo..ssi..ble..arrgh!!");            
            System.out.println("\nUn calme étrange règne... " + UneLuneSuperieur.getNom() + " revient à la vie ! (" + UneLuneSuperieur.revive(500) + " HP)");
            System.out.println("\n" + UnPilier.getNom() + " équarquille les yeux 😱");
            System.out.println("\n" + UneLuneSuperieur.getNom() + " -> surpris ? Les démons ne connaissent pas la mort, je ne crains que le Soleil");
            System.out.println("\nLe combat s'éternise, et l'aube approche " + UnPilier.getNom() + " attend que le Soleil apparaisse et brûle " + UneLuneSuperieur.getNom() + " c'est sa seul chance de l'emporter");
            System.out.println("\n" + UneLuneSuperieur.getNom() + " s'apprete à tuer " + UnPilier.getNom());
            System.out.println("\nL'Aube apparaît enfin... et brûle " + UneLuneSuperieur.getNom() + " , vie après les dommages subie : " + (UneLuneSuperieur.soleil(100000000)) + " (" + UneLuneSuperieur.degat(UneLuneSuperieur.getVie()) + UneLuneSuperieur.getVie() + " HP)");
            System.out.println("\n" + UnPilier.getNom() + " est en vie (" + UnPilier.getVie() + " HP) le combat est terminé " + UneLuneSuperieur.getNom() + " a été réduit en cendre par le soleil...");
            System.out.println("\n");        
        }
    }
