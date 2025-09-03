public class Hija extends Padre
{
    private int n3;

    public Hija(){}
    public Hija (int n1, int n2, int n3){
        super (n1,n2);
        this.n3=n3;
    }
    @Override
    public void mostrar_Numero (){
        System.out.println (n1 + ""+ n2 + " " +n3);
       
       

       
    }
}
