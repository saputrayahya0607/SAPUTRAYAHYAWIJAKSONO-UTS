public class SAPUTRAYAHYAWWIJAKSONO_UTS {
        public static void main(String[] args) {
            String status;
            for (int angka = 20; angka < 30 ; angka++){

                if (angka % 2 == 0){
                    status ="angka genap valid";
                }else {
                    status ="angka genap invalid";
                }
                System.out.println(angka + " adalah " +status);
            }
        }
}
