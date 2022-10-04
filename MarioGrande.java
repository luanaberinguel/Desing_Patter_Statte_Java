public class MarioGrande implements MarioState {

    public MarioState pegarCogumelo(){
        System.out.println("Mais 1000 pontos.");
        return this;
    }
    
    public MarioState pegarFlor(){
         System.out.println("Mario grande com fogo.");
         return new MarioFogo();
    }

    public MarioState pegarPena(){
        System.out.println("Mario grande com uma capa.");
        return new MarioCapa();
    }

    public MarioState levarDano(){
        System.out.println("Mario pequeno.");
        return new MarioPequeno();
    }
    
}
