public class Desenho {
    private FiguraGeometrica f1;
    private int x1, y1;
    private FiguraGeometrica f2;
    private int x2, y2;

    public Desenho(FiguraGeometrica f1, int x1, int y1, FiguraGeometrica f2, int x2, int y2) {
        this.f1 = f1;
        this.x1 = x1;
        this.y1 = y1;
        this.f2 = f2;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void apresenta(){
        f1.descricao();
        System.out.println("Cordenadas: "+x1+", "+y1);
        f2.descricao();
        System.out.println("Cordenadas: "+x2+", "+y2);
        System.out.println();
    }
}
