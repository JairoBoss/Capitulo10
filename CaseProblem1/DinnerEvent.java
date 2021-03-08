package CaseProblem1;

public class DinnerEvent extends Event{
    private Integer princiapl;
    private Integer guarnicion1;
    private Integer guarnicion2;
    private Integer postre;

    public DinnerEvent(String evento, String numeroDeTelefono, Integer tipoDeEvento, Integer princiapl, Integer guarnicion1, Integer guarnicion2, Integer postre) {
        super(evento, numeroDeTelefono, tipoDeEvento);
        this.princiapl = princiapl;
        this.guarnicion1 = guarnicion1;
        this.guarnicion2 = guarnicion2;
        this.postre = postre;
    }

    public Integer getPrinciapl() {
        return princiapl;
    }

    public void setPrinciapl(Integer princiapl) {
        this.princiapl = princiapl;
    }

    public Integer getGuarnicion1() {
        return guarnicion1;
    }

    public void setGuarnicion1(Integer guarnicion1) {
        this.guarnicion1 = guarnicion1;
    }

    public Integer getGuarnicion2() {
        return guarnicion2;
    }

    public void setGuarnicion2(Integer guarnicion2) {
        this.guarnicion2 = guarnicion2;
    }

    public Integer getPostre() {
        return postre;
    }

    public void setPostre(Integer postre) {
        this.postre = postre;
    }


    public String getMenu() {
        return "DinnerEvent{" +
                "princiapl=" + princiapl +
                ", guarnicion1=" + guarnicion1 +
                ", guarnicion2=" + guarnicion2 +
                ", postre=" + postre +
                '}';
    }
}
