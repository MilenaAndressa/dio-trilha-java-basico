public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desliga(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal= canal + 1;
    }
    public void diminuirCanal(){
        canal--;
    }

}
