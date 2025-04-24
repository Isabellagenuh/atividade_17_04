public class Aviao extends Veiculo {
    private double altitude;
    private boolean tremDePousoBaixo;

    public Aviao(String marca, String modelo, int ano, double combustivel) {
        super(marca, modelo, ano, combustivel);
        this.altitude = 0;
        this.tremDePousoBaixo = false;
    }

@Override
    

    public void acelerar(){
        super.acelerar();
        super.setVelocidadeAtual(240);
    }
    
    public void decolar(){
        if (this.altitude==0 && super.getmotorLigado()){
            this.acelerar();
            this.altitude = 10000;
            this.tremDePousoBaixo=false;
            System.out.println("decolou");
        }else{
            System.out.println("O trem de pouso ja está levantado");
        }
    }

    public void subir(){
        if (this.altitude>0){
            this.altitude +=10000;
            System.out.println("aumentou a altitude");
        }else{
            System.out.println("Avião no chão");
        }
    }

    public void descer(){
        if (this.altitude>0){
            this.altitude -= 10000;
            System.out.println("diminuiu a altitude");
        }else{
            System.out.println("Avião no chão");
        }
    }

    public void aterrissar(){
        if (this.altitude>0){
            for (; this.altitude>0; this.altitude -=1000){
                if(this.altitude<=1000){
                    this.tremDePousoBaixo= true;
                    System.out.println("Trem de pouso baixado");
                }else{
                    System.out.println("aviao ja esta pousado");
                }
            }
        }else{
            System.out.println("A altitude é maior que 0");
        }
    }
}

