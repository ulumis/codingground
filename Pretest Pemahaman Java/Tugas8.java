public class Tugas8{
    
    String nama,alamat;
    int umur;
    
    public void CetakBiodata(){
        
        System.out.println("Nama      : "+nama);
        System.out.println("Alamat    : "+alamat);
        System.out.println("Umur      : "+umur);
    }
    
    public static void main(String []args){
        
        Tugas8 data = new Tugas8();
        data.nama = "Ulumis Sifaiya";
        data.alamat = "Jepara";
        data.umur = 20;
        
        data.CetakBiodata();
    }
}