package com.example.movieiftah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val PemainbolaList = listOf<Pemainbola>(
            Pemainbola(
                R.drawable.ronaldo,
                namePemainbola = "Cristiano Ronaldo",
                descPemainbola = "Cristiano Ronaldo dos Santos Aveiro lahir pada 5 Februari 1985. Ia adalah pemain sepak bola profesional Portugis yang bermain sebagai penyerang untuk klub Liga Utama Inggris Manchester United dan menjadi kapten tim nasional Portugal.",
                desc2Pemainbola =  "Nama lengkap Cristiano Ronaldo dos Santos Aveiro \n" +
                        " Tanggal lahir 5 Februari 1985 (umur 37)\n" +
                        " Tempat lahir Funchal, Madeira, Portugal\n" +
                        " Tinggi 187 cm\n" +
                        " Posisi bermain Penyerang tengah"


            ),

            Pemainbola(
                R.drawable.bruno,
                namePemainbola = "Bruno Fernandes",
                descPemainbola = "Bruno Miguel Borges Fernandes lahir pada 8 September 1994. Ia adalah pemain sepak bola profesional Portugis yang bermain sebagai gelandang untuk klub Liga Utama Inggris Manchester United dan tim nasional Portugal.",
                desc2Pemainbola =  "Nama lengkap Bruno Miguel Borges Fernandes\n" +
                        " Tanggal lahir 8 September 1994 (umur 27)\n" +
                        " Tempat lahir Maia, Portugal\n" +
                        " Tinggi 187 cm\n" +
                        " Tinggi 179 m\n" +
                        " Posisi bermain Gelandang"

            ),

            Pemainbola(
                R.drawable.neymar,
                namePemainbola = "Neymar JR",
                descPemainbola = "Neymar da Silva Santos Junior lahir pada 5 Februari 1992. Ia biasa dikenal sebagai Neymar. Ia adalah pemain sepak bola profesional Brasil yang bermain sebagai penyerang untuk klub Ligue 1, Paris Saint-Germain dan tim nasional Brasil. Neymar melakukan debut profesionalnya pada 7 Maret 2009, meski baru berusia 17 tahun.",
                desc2Pemainbola =  "Nama lengkap Neymar da Silva Santos Júnior\n" +
                        " Tanggal lahir 5 Februari 1992 (umur 30)\n" +
                        " Tempat lahir Mogi das Cruzes, São Paulo, Brasil\n" +
                        " Tinggi 175 m\n" +
                        " Posisi bermain Penyerang"

            ),

            Pemainbola(
                R.drawable.messi,
                namePemainbola = "Lionel Messi",
                descPemainbola = "Lionel Andres Messi lahir pada 24 Juni 1987. Ia biasa dikenal sebagai Leo Messi. Ia adalah pemain sepak bola profesional Argentina yang bermain sebagai penyerang untuk klub Ligue 1, Paris Saint -Germain dan kapten tim nasional Argentina.",
                desc2Pemainbola =  "Nama lengkap Lionel Andrés Messi\n" +
                        " Tanggal lahir 24 Juni 1987 (umur 35)\n" +
                        " Tempat lahir Rosario, Argentina\n" +
                        " Tinggi 170 cm\n" +
                        " Posisi bermain Penyerang"

            ),

            Pemainbola(
                R.drawable.mbappe,
                namePemainbola = "Kylian Mbappe",
                descPemainbola = "Kylian Mbappé lahir 20 Desember 1998, dia adalah seorang pemain sepak bola profesional Prancis yang bermain sebagai penyerang untuk Paris Saint-Germain dan tim nasional Prancis.",
                desc2Pemainbola =  "Nama lengkap Kylian Mbappé Lottin\n" +
                        " Tanggal lahir 20 Desember 1998 (umur 23)\n" +
                        " Tempat lahir Paris, Prancis\n" +
                        " Tinggi 178 m\n" +
                        " Posisi bermain Penyerang"

            ),

            Pemainbola(
                R.drawable.modric,
                namePemainbola = "Luka Modric",
                descPemainbola = "Luka Modrić lahir pada 9 September 1985, dia adalah pemain sepak bola profesional berkebangsaan Kroasia yang bermain sebagai gelandang untuk Real Madrid di La Liga Spanyol dan tim nasional Kroasia.",
                desc2Pemainbola =  "Nama lengkap Luka Modrić\n" +
                        " Tanggal lahir 9 September 1985 (umur 36)\n" +
                        " Tempat lahir Zadar, SR Croatia, SFR Yugoslavia\n" +
                        " Tinggi 175 m\n" +
                        " Posisi bermain Gelandang"

            ),

            Pemainbola(
                R.drawable.thiago,
                namePemainbola = "Thiago Alcantara",
                descPemainbola = "Thiago Alcantara do Nascimento atau Thiago lahir pada 11 April 1991. Ia adalah pemain sepak bola profesional yang bermain sebagai pemain tengah. gelandang untuk klub Liga Premier Liverpool dan tim nasional Spanyol.",
                desc2Pemainbola =  "Nama lengkap Thiago Alcântara do Nascimento\n" +
                        " Tanggal lahir 11 April 1991 (umur 31)\n" +
                        " Tempat lahir San Pietro Vernotico, Italia\n" +
                        " Tinggi 172 m\n" +
                        " Posisi bermain Gelandang"

            ),

            Pemainbola(
                R.drawable.ozil,
                namePemainbola = "Mesut Ozil",
                descPemainbola = "Mesut Özil lahir pada 15 Oktober 1988. Dia adalah pemain sepak bola Jerman yang bermain untuk klub Premier League Arsenal dan tim nasional Jerman . Özil telah menjadi skuad tim muda nasional Jerman sejak tahun 2006, dan skuad tim nasional Jerman sejak tahun 2009.",
                desc2Pemainbola =  "Nama lengkap Mesut Özil\n" +
                        " Tanggal lahir 15 Oktober 1988 (umur 33)\n" +
                        " Tempat lahir Gelsenkirchen, Jerman Barat\n" +
                        " Tinggi 180 cm\n" +
                        " Posisi bermain Gelandangan"
            ),

            Pemainbola(
                R.drawable.dybala,
                namePemainbola = "Paulo Dybala",
                descPemainbola = "Paulo Exequiel Dybala (lahir 15 November 1993) adalah pemain sepak bola profesional Argentina yang bermain sebagai penyerang untuk klub Serie A Juventus dan tim nasional Argentina. Dia memulai karir dengan bergabung akademi Instituto de Cordoba.",
                desc2Pemainbola =  "Nama lengkap Paulo dybala Bruno Exequiel Dybala\n" +
                        " Tanggal lahir 15 November 1993 (umur 28)\n" +
                        " Tempat lahir Argentina\n" +
                        " Tinggi 177 m\n" +
                        " Posisi bermain Penyerang / Gelandang serang\n" +
                        " Nomor 10"

            ),

            Pemainbola(
                R.drawable.klok,
                namePemainbola = "Marc Klok",
                descPemainbola = "Marc Anthony Klok (lahir 20 April 1993) adalah seorang pemain sepak bola profesional Indonesia yang bermain sebagai gelandang tengah untuk klub Persib Bandung dan tim nasional Indonesia. Klok yang Lahir di Belanda, menjadi warga negara Indonesia lewat naturalisasi pada November 2020.",
                desc2Pemainbola =  "Nama lengkap Marc Anthony Klok\n" +
                        " Tanggal lahir 20 April 1993 (umur 29)\n" +
                        " Tempat lahir Amsterdam, Belanda\n" +
                        " Tinggi 177 cm\n" +
                        " Posisi bermain Gelandang tengah"

            ),

            )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_pemain)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PemainbolaAdapter(this,PemainbolaList){
            val intent = Intent (this, DetailPemainbolaActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}
