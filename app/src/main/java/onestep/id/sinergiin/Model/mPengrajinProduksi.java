package onestep.id.sinergiin.Model;

public class mPengrajinProduksi {
    String id, img, pembeli, produk, jumlah, durasi, status;

    public mPengrajinProduksi(String id, String img, String pembeli, String produk, String jumlah, String durasi,String status) {
        this.id = id;
        this.img = img;
        this.pembeli = pembeli;
        this.produk = produk;
        this.jumlah = jumlah;
        this.durasi = durasi;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPembeli() {
        return pembeli;
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public String getProduk() {
        return produk;
    }

    public void setProduk(String produk) {
        this.produk = produk;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
