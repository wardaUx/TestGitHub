package com.example.sb.warda.languageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

   ListView listView;

   WordsAdapter wordsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Words> words = new ArrayList<Words>();

        words.add(new Words("One","aik"));
        words.add(new Words("Two","doo"));
        words.add(new Words("Three","teeen"));
        words.add(new Words("Four","chaar"));
        words.add(new Words("Five","panchh"));
        words.add(new Words("Six","cheen"));
        words.add(new Words("Seven","saat"));
        words.add(new Words("Eight","ath"));
        words.add(new Words("Nine","noo"));
        words.add(new Words("Ten","dass"));
        words.add(new Words("Eleven","giyara"));
        words.add(new Words("Twelve","bara"));

        WordsAdapter wordsAdapter = new WordsAdapter(this,words);
        listView= findViewById(R.id.listView);
        listView.setAdapter(wordsAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                int index = position;
//                Toast.makeText(Numbers.this, "position is  "+ index, Toast.LENGTH_SHORT).show();
//
//            }
//        });


        //        String[] englishWords ={"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
//        String[] urduWords =   {"aik", "doo", "teen", "chaar", "panch", "chen", "saat", "aath", "noo", "dasss"};

//        int[] imagesWords = {R.drawable.lubabaa,
//                R.drawable.coutinho,
//                R.drawable.dybala,
//                R.drawable.gustin,
//                R.drawable.kaka,
//                R.drawable.minion,
//                R.drawable.messi,
//                R.drawable.neymar,
//                R.drawable.pique,
//                R.drawable.yahyah};

//        listView = findViewById(R.id.listView);
//      wordsAdapter = new WordsAdapter(this,R.layout.numbers_and_translation, englishWords,urduWords);
//
//      listView.setAdapter(wordsAdapter);





    }












}


//        Log.v("size","is "+ size);
//        Log.v("NumbersActivity","well "+words.get(0));
//        Log.v("NumbersActivity","1st "+words[0]);
//ArrayList<Words> words = new ArrayList<Words>();
////        Words w = new Words("One","aik") ;
//        words.add(new Words("One","aik"));
//        words.add(new Words("Two","doo"));
//        words.add(new Words("Three","teeen"));
//        words.add(new Words("Four","chaar"));
//        words.add(new Words("Five","panchh"));
//        words.add(new Words("Six","cheen"));
//        words.add(new Words("Seven","saat"));
//        words.add(new Words("Eight","ath"));
//        words.add(new Words("Nine","noo"));
//        words.add(new Words("Ten","dass"));
//        words.add(new Words("Eleven","giyara"));
//        words.add(new Words("Twelve","bara"));
////        words.add("thirteen");
////        words.add("fourteen");
////        words.add("fifteen");
////        words.add("sixteen");
////        words.add("seventeen");
////        words.add("eighteen");
////        words.add("nineteen");
////        words.add("twenty");
//
//
////        int size = words.size();
//WordsAdapter itemsAdapter = new WordsAdapter(this, Words);
//
//    ListView listView = findViewById(R.id.list);
//
//        listView.setAdapter(itemsAdapter);