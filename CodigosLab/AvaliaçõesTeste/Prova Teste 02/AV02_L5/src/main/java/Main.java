public class Main {
    public static void main(String[] args) {
        Nave nave = new Nave("StarWars", true);
        Sabre s1 = new Sabre();
        Sabre s2 = new Sabre();

        s1.setCor("Laranja");
        s2.setCor("Preto");

        nave.personagens[0] = new Jedi("João", 40, false, s1);
        nave.personagens[1] = new Sith("Gabriel", 50, true, s2);
        nave.personagens[2] = new Droid("Miguel", 30, false);

        for (int i = 0; i < nave.personagens.length; i++) {
            if(nave.personagens[i] instanceof Jedi){
                Jedi j = (Jedi) nave.personagens[i];
                j.travarBatalha();
                j.usarForca();
                j.trocarSabre("Verde");
                j.treinarPadawan();
            }
            else{
                if(nave.personagens[i] instanceof Sith){
                    Sith s = (Sith) nave.personagens[i];
                    s.travarBatalha();
                    s.corromperJedi();
                    s.usarForca();
                    s.trocarSabre("Roxo");
                }else{
                    Droid d = (Droid) nave.personagens[i];
                    d.hackearSistema();
                    d.travarBatalha();
                }
            }
        }
        nave.mostraInfo();
        System.out.println(Personagem.cont + " Personagens foram criados!");


    }
}
