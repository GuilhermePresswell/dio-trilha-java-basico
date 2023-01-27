public class Usuario {
    public static void main(String[] args) throws Exception {
      
        SmartTv smartTv = new SmartTv();

        smartTv.ligar ();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        System.out.println("Canal atual: " + smartTv.canal) ;
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal) ;
        smartTv.avançarCanal();
        System.out.println("Canal atual: " + smartTv.canal) ;


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("TV Ligada? " + smartTv.ligada) ; 
        System.out.println("Canal atual: " + smartTv.canal) ;
        System.out.println("Volume atual: " + smartTv.volume) ;

    
        smartTv.desligar ();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);
    }
}
