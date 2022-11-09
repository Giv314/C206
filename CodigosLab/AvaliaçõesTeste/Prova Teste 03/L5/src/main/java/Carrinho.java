public class Carrinho implements Comparable<Carrinho>{
    private String nomeJogador;
    private int velocidade;
    private String chassi;

    // Método que mostra as informações dos carrinhos
    public void mostraInfo(){
        System.out.println("Nome do jogador: " + nomeJogador);
        System.out.println("Velocidade do carrinho: " + velocidade);
        System.out.println("Chassi: " + chassi);
        System.out.println("--------------------------------------");
    }

    // Construtor para criar carrinhos
    public Carrinho() {

    }

    // Getter para obter as infos
    public String getNomeJogador() {
        return nomeJogador;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getChassi() {
        return chassi;
    }

    // Setters para adicionar infos aos carrinhos

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public int compareTo(Carrinho carrinho) {
        return Integer.compare(this.velocidade, carrinho.velocidade);
    }
}