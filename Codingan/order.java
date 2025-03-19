import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class order {
    private LocalDate tanggal_order;
    private int total_harga;

    public order(){
        this.tanggal_order = LocalDate.now();
        this.total_harga = 0;
    }

    public order(LocalDate tanggal_order, int total_harga){
        this.tanggal_order = tanggal_order;
        this.total_harga = total_harga;
    }

    public LocalDate getTanggal_order(){
        return tanggal_order;
    }

    public void setTanggal_Order(LocalDate tanggal_order){
        this.tanggal_order = tanggal_order;
    }

    public double getTotal_Harga(){
        return total_harga;
    }

    public void setTotal_Harga(int total_harga){
        this.total_harga = total_harga;
    }
}
