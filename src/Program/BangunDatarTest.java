package Program;


public class BangunDatarTest {

    public static void main(String[] args) {
        BangunDatar b[] = new BangunDatar[3];
        
        PersegiPanjang pp = new PersegiPanjang(5, 4);
        Persegi p = new Persegi(2);
        Lingkaran l = new Lingkaran(10);
        
        b[0] = pp;
        b[1] = p;
        b[2] = l;
        
        for (BangunDatar b1 : b){
            System.out.println("\n" + b1.displayinfo());
        }
    }
    
}
