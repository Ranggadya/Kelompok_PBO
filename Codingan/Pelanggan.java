public class Pelanggan {
    private String nama;
    private String notelp;
    private String alamat;
    private String email;

    public Pelanggan(){
        this.nama = "";
        this.notelp = "";
        this.alamat = "";
        this.email = "";
    }

    public Pelanggan(String nama, String notelp, String alamat, String email){
        this.nama = nama;
        this.notelp = notelp;
        this.alamat = alamat;
        this.email = email;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNoHp(){
        return notelp;
    }

    public void setNoHp(String notelp){
        this.notelp = notelp;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
}
