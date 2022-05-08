public class Binario {
    
    public static int N = 8; // Binário 
    public static int vet[] = new int[N];
    public static int topo = -1;


    public static void main(String[] args) {

        binario(192);
        binario(168);
        binario(1);
        binario(255);
        binario(0);
    }

    public static void binario(int x) {
        int b = 128;
        int dot = 0;
        for(int i = N; i > topo + 1; i--) {
            if(dot == 4) 
                System.out.print(".");
            if (x - b >= 0) {
               
                System.out.print("1");
                x = x - b;
                b = b / 2;
                dot++;
                
            } else {
                System.out.print("0");
                b = b / 2;
                dot++;
        }}
        System.out.println();
    }
}
