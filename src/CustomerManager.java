public class CustomerManager {

    BaseDatabaseManager databaseManager; // kullanırken hangi veri tabanı sistemini verirseniz onun getDAta sı çalışır

    public void getCustomers(){
        databaseManager.getData();

    }
}
