/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el_sake_de_binks;


public class El_Sake_De_Binks {

    String Musica;
    String cantate;
    String fruta_del_diablo;

    public El_Sake_De_Binks() {
    }

    public El_Sake_De_Binks(String Musica, String cantate, String fruta_del_diablo) {
        this.Musica = Musica;
        this.cantate = cantate;
        this.fruta_del_diablo = fruta_del_diablo;
    }

    public String getMusica() {
        return Musica;
    }

    public void setMusica(String Musica) {
        this.Musica = Musica;
    }

    public String getCantate() {
        return cantate;
    }

    public void setCantate(String cantate) {
        this.cantate = cantate;
    }

    public String getFruta_del_diablo() {
        return fruta_del_diablo;
    }

    public void setFruta_del_diablo(String fruta_del_diablo) {
        this.fruta_del_diablo = fruta_del_diablo;
    }
    
    public void Cantar(){
        System.out.println("Yohohoho, yohohoho\n" +
"Yohohoho, yohohoho\n" +
"Yohohoho, yohohoho\n" +
"Yohohoho, yohohoho\n" +
"\n" +
"Yendo a entregar el sake de Binks\n" +
"Siguiendo la brisa del mar, cortando las olas\n" +
"La puesta del Sol agitando las mareas\n" +
"Mientras un pájaro canta, volando en círculos en el cielo\n" +
"\n" +
"Adiós al puerto, a mi viejo pueblo\n" +
"El Don nos invita a cantar mientras izamos las velas\n" +
"Las ondas doradas y plateadas se disuelven en spray\n" +
"Mientras nos dirigimos hacia el borde del mar\n" +
"\n" +
"Yendo a entregar el sake de Binks\n" +
"Somos piratas, cortando los mares\n" +
"Las olas son nuestra almohada, el barco, nuestra red\n" +
"Con una calavera en nuestras velas\n" +
"\n" +
"En el norte, una tormenta se forma en el cielo lejano\n" +
"Ahora las olas bailan, golpeando como tambores\n" +
"Si pierdes la calma, este suspiro podría ser el último\n" +
"Pero con cada mañana llega un nuevo Sol\n" +
"\n" +
"Yohohoho, yohohoho\n" +
"Yohohoho, yohohoho\n" +
"Yohohoho, yohohoho\n" +
"Yohohoho, yohohoho\n" +
"\n" +
"Yendo a entregar el sake de Binks\n" +
"Hoy, mañana, por la noche, soñamos\n" +
"Agitando nuestra mano, nos despedimos, no nos volvamos a ver\n" +
"No seas así, mañana aparecerá la Luna\n" +
"\n" +
"Yendo a entregar el sake de Binks\n" +
"El Don nos invita a cantar su canción junto al mar\n" +
"Porque no importa, al final solo somos huesos\n" +
"Eternos, hospitalarios, lleno de historias que se hacen reír\n" +
"\n" +
"Yohohoho, yohohoho\n" +
"Yohohoho, yohohoho\n" +
"Yohohoho, yohohoho\n" +
"Yohohoho, yohohoho\n" +
"");
    }
    
    public void bailar(){
        System.out.println(""
                + "¡A bailar!");
    }
}
