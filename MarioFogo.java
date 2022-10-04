public class MarioFogo implements MarioState {
    public MarioState pegarCogumelo(){
        System.out.println("Mais 1000 pontos.");
        return this;
    }
    
    public MarioState pegarFlor(){
         System.out.println("Mais 1000 pontos.");
         return this;
    }

    public MarioState pegarPena(){
        System.out.println("Mario grande com uma capa.");
        return new MarioCapa();
    }

    public MarioState levarDano(){
        System.out.println("Mario grande.");
        return new MarioGrande();
    }
    
}
