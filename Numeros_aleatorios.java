public class Numerosaleatorios {

    public static void main(String[] args) {
    int numal = 0;
    int manual = 0;
    int deletar = 0;
    Scanner sc = new Scanner (System.in);
    ArrayList <Integer> numarray = new ArrayList();
    Random ra = new Random();
    
    for (int i=0; i<=15; i++){
        System.out.println("Gerar nuemros aleatórios" );
    numal = ra.nextInt(15)+1;
    numarray.add(numal);
    
    if (numarray.indexOf(numal)==-1)
    numarray.add(numal);
    
    System.out.println("Os numeros gerados sao: "+numarray);        
    }
        System.out.println("Utilize um numero para saber se ele existe na lista");    
    manual = sc.nextInt();
    if (numarray.indexOf(numal)>0)
    System.out.println("Enontrado");
    
    deletar = numarray.indexOf(numal);
    numarray.remove(deletar);
    System.out.println("Numero deletado");
    
    }
}
