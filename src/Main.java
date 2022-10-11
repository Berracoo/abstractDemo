public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabseManager(); // customerManager ın dataBAse manager ı = new oracle dır dedik. Bir strateji belirledik.
       // kullanım noktası belirledik. new den sonraki kısım bir konfigürasyondur o kısımlar değişebilir
        customerManager.getCustomers(); // ortada newlenmiş bir şey olmadığı için açlışmaz senin oluşturman gerekir.

     // SOLID O-> open-close principles--> when u bring a new property to a system, you cannot change the codes that are already exist.
        // yani bir özellik getiricem diye diğer methodları değiştiriyorsan orada bir arıza vardır demektir.

    }
}