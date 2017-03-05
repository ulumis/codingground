public class Tugas6{
    
    public static void Kelulusan(int nilai){
        
        if(nilai > 60){
            System.out.println("LULUS");
        }else if(nilai < 60){
            System.out.println("TIDAK LULUS");
        }
        
    }
    
    
    public static void main(String []args){
        
        Kelulusan(70);
    
    }
    
    
}