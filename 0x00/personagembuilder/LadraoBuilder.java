package personagembuilder;

public class LadraoBuilder implements Builder{
    String nome;
    TipoPersonagem tipo;
    int inteligencia;
    int forca;
    int vigor;
    int resistencia;
    int destreza;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setTipo(TipoPersonagem tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public Ladrao build(){
        return new Ladrao(nome, inteligencia, forca, vigor, resistencia, destreza);
    }
}
