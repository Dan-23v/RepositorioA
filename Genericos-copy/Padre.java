

public class Padre
{
    protected int n1, n2;
   
    public Padre (){}
    public Padre (int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public void set_N1 (int n1){
    this.n1 = n1;
    }
    public int get_N1 (){
    return this.n1;
    }
    public void set_N2 (int n2){
    this.n2 = n2;
    }
    public int get_N2 (){
    return this.n2;
    }
    public void mostrar_Numero (){
        System.out.println (n1 + " " +n2);
}
}


