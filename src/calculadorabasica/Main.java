
package calculadorabasica;


public class Main {
    
    int a=50;
    int b =150;
    
    public int sumar(int a, int b){
        return a+b;
    }
    
    
    public static void main(String[] args) {
      
        Main obj = new Main();
        int res=obj.sumar(obj.a, obj.b);
        System.out.println("El resultado es: "+res);
        
    }
    
}
