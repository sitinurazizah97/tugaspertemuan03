package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 62000;
        double uangDiDompet = 45000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uangnya Kurang, Kurangi Jajan Anda");
        }else if(uangDiDompet>totalBelanja){
            double kembaliannya = uangDiDompet - totalBelanja;
            System.out.println("Uangnya cukup, kembaliannya : " + kembaliannya);
        }else{
            System.out.println("Uangnya Pas.. Terimakasih..");
        }
    }
}
