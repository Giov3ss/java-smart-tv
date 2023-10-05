public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV esta ligada? " + smartTv.ligada);
        System.out.println("Em qual canal esta? " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Mudando canal para: " + smartTv.canal);
        

        smartTv.diminuirVolume();        
        smartTv.diminuirVolume();        
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Qual volume? " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo status -> TV esta ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status -> TV esta ligada? " + smartTv.ligada);
    }
}
