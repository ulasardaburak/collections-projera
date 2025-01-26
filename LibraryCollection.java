import java.util.HashMap;
import java.util.Map;

public class LibraryCollection {
    public static void main(String[] args) {
        //Bizden saklamamızı istenen veri bir anahtar ve bir değere sahip olacağı için Hashmap kullanmayı tercih ettim.
        //Aynı yazarın birden fazla kitabını eklememiz gerekseydi anahtar olarak string tipinde yazarı, değer olaraksa arraylist tipinde kitapları ekleyebilirdik.
        //Basım yılı ya da bulunduğu kısım gibi bir bilgi de girmemiz gerekseydi bir Kitap classı oluşturarak çözebilirdik.

        Map<String, String> library = new HashMap<>();
        library.put("Tutunamayanlar", "Oğuz Atay");
        library.put("Otomatik Portakal", "Anthony Burgess");
        library.put("Simyacı", "Paulo Coelho");
        library.put("Aylak Adam", "Yusuf Atılgan");
        library.put("Suç ve Ceza", "Fyodor Dostoyevski");
        library.put("Yerdeniz Büyücüsü", "Ursula K. Le Guin");

        System.out.println("Kitaplıkta bulunan tüm kitaplar:");
        for (String kitaplar: library.keySet()){
            System.out.println(kitaplar);
        }
        System.out.println("Kitaplıkta bulunan tüm yazarlar:");
        for (String yazarlar: library.values()){
            System.out.println(yazarlar);
        }

    }
}
