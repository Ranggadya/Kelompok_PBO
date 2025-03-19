public class Menu {
    private String nama;
    private String kategori;
    private int harga;

    public Menu(){
        this.nama = "";
        this.kategori = "";
        this.harga = 0;
    }

    public Menu(String nama, String kategori, int harga){
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getKategori(){
        return kategori;
    }

    public void setKategori(String kategori){
        this.kategori = kategori;
    }

    public int getHarga(){
        return harga;
    }

    public void setNama(int harga){
        this.harga = harga;
    }
    
}
