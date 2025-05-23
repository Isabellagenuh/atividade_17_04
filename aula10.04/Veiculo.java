public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private boolean motorLigado;
    private double combustivel;

    public Veiculo(String marca, String modelo, int ano, double combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
        this.motorLigado = false;
        this.combustivel = combustivel;
    }

    public Veiculo() {
        System.out.println("construtor padrao");
    }

    /*
     * public String getMarca() {
     * return marca;
     * }
     * 
     * public void setMarca(String marca) {
     * this.marca = marca;
     * }
     * 
     * public String getModelo() {
     * return modelo;
     * }
     * 
     * public void setModelo(String modelo) {
     * this.modelo = modelo;
     * }
     * 
     * public int getAno() {
     * return ano;
     * }
     * 
     * public void setAno(int ano) {
     * this.ano = ano;
     * }
     * 
     * public double getVelocidadeAtual() {
     * return velocidadeAtual;
     * }
     * 
     * public void setVelocidadeAtual(double velocidadeAtual) {
     * this.velocidadeAtual = velocidadeAtual;
     * }
     * 
     * public boolean isMotorLigado() {
     * return motorLigado;
     * }
     * 
     * public void setMotorLigado(boolean motorLigado) {
     * this.motorLigado = motorLigado;
     * }
     * 
     * public double getCombustivel() {
     * return combustivel;
     * }
     * 
     * public void setCombustivel(double combustivel) {
     * this.combustivel = combustivel;
     * }
     */

    // void = vazio. ele armazena um valor mas não pode retornar
    // declaração de variavel (int, double, string) + return = retornar o valor ao
    // usuário, mostrar isto em algum lugar.

    /*
     * CARMINO ME DESAFIOU
     * public void ligarMotor() {
     * if (motorLigado && combustivel>=1) {
     * System.out.println("Seu motor ja está ligado!");
     * } else if(combustivel>=1){
     * motorLigado = true;
     * System.out.println("Motor ligado!");
     * }else if (combustivel<1){
     * System.out.println("você esta sem gasolina");
     * }else{
     * System.out.println("ligado!");
     * }
     * }
     */

    public void ligarMotor() {
        if (!this.motorLigado) {
            this.motorLigado = true;
            System.out.println("Motor ligado!");
        } else {
            System.out.println("O motor ja esta ligado");
        }
    }

    public void desligarMotor() {
        if (this.motorLigado) {
            this.motorLigado = false;
            this.velocidadeAtual = 0;
            System.out.println("Seu motor está desligado!");
        } else {
            System.out.println("Seu motor ja está ligado!");
        }
    }

    public void acelerar() {
        if (this.motorLigado && this.combustivel >= 1) {
            this.motorLigado = true;
            this.velocidadeAtual += 10;
            this.combustivel -= 0.10;
            System.out.println("Sua velocidade atual é: " + this.velocidadeAtual + "km/h");
        } else if (!this.motorLigado && this.combustivel >= 1) {
            System.out.println("Motor está desligado");
        } else if (this.motorLigado && this.combustivel <= 0) {
            this.motorLigado = true;
            System.out.println("Você está sem combustivel");
        } else {
            System.out.println("Seu motor está desligado, e seu combustivel acabou!");
        }
    }

    public void frear() {
        if (this.motorLigado) {
            if (this.velocidadeAtual > 0) {
                this.velocidadeAtual -= 10;
                if (this.velocidadeAtual < 0) {
                }
                System.out.println(" está parando...");
            } else {
                System.err.println(" já está parado");
            }
        } else {
            System.out.println("o seu motor esta desligado.");
        }
    }

    public void exibirInfo() {
        System.out.println("Sua marca é: " + this.marca);
        System.out.println("Seu modelo é: " + this.modelo);
        System.out.println("Seu ano é:" + this.ano);
        System.out.println("Sua velocidade atual é: " + this.velocidadeAtual);
        System.out.println("Seu motor está ligado? " + this.motorLigado);
        System.out.println("Você tem: " + this.combustivel + " de combustivel no seu veiculo");
    }

    public void abastecer(double combustivel) {
        if (this.velocidadeAtual <= 0) {
            if (!this.motorLigado) {
                this.combustivel += combustivel;
                System.out.println("foi abastecido com: " + combustivel + " Litros!");
            }else{
                System.out.println("Desligue seu motor");
            }
        }else{
            System.out.println("o veiculo ja esta parado");
        }
    }
    
    public double statusCombustivel(){
        return this.combustivel;
    }

}