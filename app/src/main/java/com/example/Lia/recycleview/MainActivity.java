package com.example.Lia.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private LinkedList<Resep> resep = new LinkedList<Resep>();
    private LinkedList<String> resep_nama = new LinkedList<String>();
    private LinkedList<String> resep_detail = new LinkedList<String>();
    private LinkedList<String> resep_ingredients = new LinkedList<String>();
    private LinkedList<String> resep_process = new LinkedList<String>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resep.add(new Resep("Tahu Gimbal",
                "Tahu gimbal adalah makakan yang hampir sama dengan gado-gado.",
                "1. 10 buah tahu putih digoreng\n" +
                        "2. 1/4 kg udang\n" +
                        "3. 1/4 kg taoge\n" +
                        "4. 1/4 kg kol yang masih segar\n" +
                        "5. Daun seledri di iris kecil kecil\n" +
                        "6. Tomat di iris tipis tipis\n" +
                        "7. 1/4 kg tepung trigu\n" +
                        "8. Bumbu racik ikan goreng\n" +
                        "9. Bawang goreng\n" +
                        "10. Kecap\n" +
                        "11. bumbu yang harus di halus kan *\n" +
                        "12. Kacang tanah yang sudah di goreng di haluskan\n" +
                        "13. 10 biji Cabé merah di goreng\n" +
                        "14. 5 biji Cabé rawit di goreng\n" +
                        "15. 5 siung bawang putih digoreng\n" +
                        "16. 3 biji Gula merah\n" +
                        "17, Trasi udang dan garam",
                "1. Campur tepung dengan bumbu racik dan di kasih air setelah itu masukan udang dan di goreng\n" +
                        "2. Haluskan cabe merah dan rawit dengan terasi.garam dan bawang putih\n" +
                        "3. Setelah itu masukan kacang tanah yang telah di haluskan dan gula merah setelah jadi masukan ke mangkuk besar yg di kasih air panas secukupnya dan didiamkan kurang lebih 10 menit setelah itu di aduk.jgn terlalu kental"));
        resep.add(new Resep("Telur Gulung",
                "Telur Gulung berarti telur yang digulung",
                "1. 2 butir telor ayam\n" +
                        "2. Garam secukupnya\n" +
                        "3. 1 sdm tepung terigu\n" +
                        "4. 4 sdm air matang\n" +
                        "5. secukupnya Lada dan Royko\n" +
                        "6. Minyak goreng penuh 1 wajan (wajan kecil)",
                "1.Kocok telur masukan air, garam, lada dan royko\n" +
                        "2. Panaskan minyak sampai benar2 panas lalu kecilkan kalau sudah panas\n" +
                        "3. Masukan per 2 sdm telor dituang secara memutar\n" +
                        "4. Lalu segera gulung dari tengah hingga ujung dengan 2 tangan. Lalu tarik ke tepi wajan dan tetap gulung hingga matang. Sajikan"));
        resep.add(new Resep("Dadar Telur Tahu Kornet",
                "Telur dadar yang dicampur dengan tahu dan kornet.",
                "1. 2 btr Telur Ayam\n" +
                        "2. 1 bh Tahu Cina\n" +
                        "3. 1 bks Kornet Sapi (50gr)\n" +
                        "4. 1 btg Daun Bawang (iris tipis)\n" +
                        "5. 4 bh Bawang Merah (iris tipis)\n" +
                        "6. Secukupnya Garam, Merica & Kaldu Jamur",
                "1.Campur tahu & kornet, hancurkan dan aduk rata dengan garpu.\n" +
                        "2. Masukkan telur, bawang merah & dan bawang, kocok rata. Tambahkan garam, merica & kaldu jamur.\n" +
                        "3. Panaskan sedikit minyak, dadar telur hingga kedua sisi kecoklatan (api kecil).\n" +
                        "4. Angkat, potong2 & sajikan"));
        setContentView(R.layout.activity_main);
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        for(int i = 0; i < resep.size(); i++){
            resep_nama.add(resep.get(i).nama);
            resep_detail.add(resep.get(i).detail);
            resep_ingredients.add(resep.get(i).ingredients);
            resep_process.add(resep.get(i).proses);
        }
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, resep_nama, resep_detail, resep_ingredients, resep_process);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
