package com.beshoykamal.metroapp;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.ListAdapter;
        import android.widget.ListView;
        import android.widget.Spinner;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner fromtext, totext;
    TextView viewtext,adresstext;

    ListView list;
    int indexstation1 , indexline2, indexline2c;
    int indexstation2 , indexline3, indexline3c,count,counttiket;

    Button button;


    ArrayList<String> items = new ArrayList<>();
    ArrayList<String> culculat = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        viewtext = findViewById(R.id.viewtext);
        fromtext = findViewById(R.id.fromtext);
        totext = findViewById(R.id.totext);
        adresstext = findViewById(R.id.adresstext);
        button = findViewById(R.id.button);
        list = findViewById(R.id.list);

    }


    public void start(View view) {
        count=0;
        culculat.clear();
        adresstext.setText("");
        button.setEnabled(true);


        Collections.addAll(items, "Choose Station ","=======line1===============","New El Marg", "El Marg", "Ezbet El Nakhl", "Ain Shams", "El Matareyya",
                "Helmeyet El Zaitoun", "Hadayeq El Zaitoun", "Saray El Qobba", "Hammamat El Qobba", "Kobri El Qobba",
                "Manshiet El Sadr", "El Demerdash", "Ghamra", "Al Shohadaa","Shohadaa if need change line2",
                "Orabi", "Nasser", "Sadat","(Sadat if need change to line2)", "Saad Zaghloul",
                "Al Sayeda Zeinab", "El Malek El Saleh", "Mar Girgis", "El Zahraa", "Dar El Salam", "Hadayek El Maadi",
                "Maadi", "Sakanat El Maadi", "Tora El Balad", "Kozzika", "Tora El Asmant", "El Maasara", "Hadayek Helwan",
                "Wadi Hof", "Helwan University", "Ain Helwan", "Helwan","=======line2===============",
                "El Mounib", "Sakiat Mekki", "Omm El Masryeen", "Giza", "Faisal", "Cairo University",
                "El Bohoth", "Dokki", "Opera", "Sadat ","Sadat if you need change line1)", "Mohamed Naguib", "Attaba ",
                "Attaba if you need change line3)",
                "Al Shohada","Shohadaa if need change line1", "Masarra", "Rod El Farag",
                "St Treresa", "Khalafawy", "Mezallat", "Kolleyyet El Zeraa", "Shubra El Kheima","========line3===============",
                "Airport", "Ahmed Galal", "Assalam", "El Herafyeen", "Omar Ibn El-Khattab",
                "Keba", "El Nozha 2", "El Nozha 1", "Nadi El Shams", "Alf Maskan", "Heliopolis Square", "Haroun", "Al Ahram",
                "Koleyet El Banat", "Stadium", "Fair Zone", "Abbassiya", "Abdou Pasha", "El Geish", "Bab El Shaaria", "Attaba ",
                "(Attaba if need change line2)",
                "Nasser", "Maspero", "Zamalek", "Kit Kat", "Sudan St", "Imbaba", "El Bohy", "El Kawmeya Al Arabiya", "Ring Road",
                "Rod El Farag Axis");
        ArrayAdapter from = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
        fromtext.setAdapter(from);
        totext.setAdapter(from);
        viewtext.setText("");

    }


    public void collect(View view) {
        count=0;
        culculat.clear();
        adresstext.setText("");


        ArrayList<String> line1 = new ArrayList<>();
        Collections.addAll(line1, "New El Marg", "El Marg", "Ezbet El Nakhl", "Ain Shams", "El Matareyya",
                "Helmeyet El Zaitoun", "Hadayeq El Zaitoun", "Saray El Qobba", "Hammamat El Qobba", "Kobri El Qobba",
                "Manshiet El Sadr", "El Demerdash", "Ghamra", "Al Shohadaa", "Orabi", "Nasser", "Sadat", "Saad Zaghloul",
                "Al Sayeda Zeinab", "El Malek El Saleh", "Mar Girgis", "El Zahraa", "Dar El Salam", "Hadayek El Maadi",
                "Maadi", "Sakanat El Maadi", "Tora El Balad", "Kozzika", "Tora El Asmant", "El Maasara", "Hadayek Helwan",
                "Wadi Hof", "Helwan University", "Ain Helwan", "Helwan");
        ArrayList<String> line2 = new ArrayList<>();
        Collections.addAll(line2, "El Mounib", "Sakiat Mekki", "Omm El Masryeen", "Giza", "Faisal", "Cairo University",
                "El Bohoth", "Dokki", "Opera", "Sadat", "Mohamed Naguib", "Attaba", "Al Shohada", "Masarra", "Rod El Farag",
                "St Treresa", "Khalafawy", "Mezallat", "Kolleyyet El Zeraa", "Shubra El Kheima");
        ArrayList<String> line3 = new ArrayList<>();
        Collections.addAll(line3, "Airport", "Ahmed Galal", "Assalam", "El Herafyeen", "Omar Ibn El-Khattab",
                "Keba", "El Nozha 2", "El Nozha 1", "Nadi El Shams", "Alf Maskan", "Heliopolis Square", "Haroun", "Al Ahram",
                "Koleyet El Banat", "Stadium", "Fair Zone", "Abbassiya", "Abdou Pasha", "El Geish", "Bab El Shaaria", "Attaba",
                "Nasser", "Maspero", "Zamalek", "Kit Kat", "Sudan St", "Imbaba", "El Bohy", "El Kawmeya Al Arabiya", "Ring Road",
                "Rod El Farag Axis");
        ArrayList<String> twila=new ArrayList<>();
        Collections.addAll(twila,"Sadat","Mohamed Naguib", "Attaba");

        String stationstart=fromtext.getSelectedItem().toString();
        String stationend=totext.getSelectedItem().toString();

         if (stationstart.equalsIgnoreCase(stationend)) {
             Toast.makeText(this, "Enter station", Toast.LENGTH_SHORT).show();
             adresstext.setText("");
             viewtext.setText("");
             return;
         }

//         if (stationstart.equals("Sadat") && stationend.equals("Al Shohadaa")||
//                 (stationstart.equals("Al Shohadaa")&&stationend.equals("Sadat"))) {
//             List<String> sublisteline1 = line1.subList(13, 14);
//             viewtext.setText(sublisteline1 + "");
//             culculat.addAll(sublisteline1);
//         }

///////line 1
        if ((line1.contains(stationstart)) || (line1.contains(stationend))) {
            for (String i : line1) {
                indexstation1 = line1.indexOf(stationstart);
                indexstation2 = line1.indexOf(stationend);

                break;
            }
        }
        if (((line1.contains(stationstart)) && (line1.contains(stationend)))
                || ((line1.contains(stationend)) && (line1.contains(stationstart)))) {

            if (indexstation1 > indexstation2) {
                List<String> sublisteline1 = line1.subList(indexstation2, indexstation1);
                Collections.reverse(sublisteline1);
                viewtext.setText(sublisteline1+"");
                culculat.addAll(sublisteline1);
            }
            else {
                List<String> sublisteline1 = line1.subList(indexstation1,indexstation2+1);
                viewtext.setText(sublisteline1+"");
                culculat.addAll(sublisteline1);
            }
        }

        /////line 2
        if ((line2.contains((stationend))) || (line2.contains(stationstart))) {
            for (String i : line2) {
                indexline2 = line2.indexOf(stationstart);
                indexline2c = line2.indexOf(stationend);

                break;
            }
        }
        if ((line2.contains(stationend)) && (line2.contains(stationstart))) {
            if (indexline2 > indexline2c) {
                List<String> sublisteline2 = line2.subList(indexline2c, indexline2);
                Collections.reverse(sublisteline2);
                viewtext.setText(sublisteline2+"");
                culculat.addAll(sublisteline2);

            } else {
                List<String> sublisteline2 = line2.subList(indexline2,indexline2c+1);
                viewtext.setText(sublisteline2+"");
                culculat.addAll(sublisteline2);
            }
        }
/////line 3
        if ((line3.contains(stationend)) || (line3.contains(stationstart))) {
            for (String i : line3) {
                indexline3 = line3.indexOf(stationstart);
                indexline3c = line3.indexOf(stationend);
                break;
            }
        }
        if ((line3.contains(stationend)) && (line3.contains(stationstart))) {

            if (indexline3 > indexline3c) {
                List<String> sublisteline3 = line3.subList(indexline3c, indexline3);
                Collections.reverse(sublisteline3);
                viewtext.setText(sublisteline3+"");
                culculat.addAll(sublisteline3);

            } else {
                List<String> sublisteline3 = line3.subList(indexline3, indexline3c+1);
                viewtext.setText(sublisteline3+"");
                culculat.addAll(sublisteline3);
            }
        }
//////////////////////////////////////////////////////////////////
////////////line 1 to line 2////////////////////////////////////////////////////

        if ((line1.contains(stationend)) && (line2.contains(stationstart))) {
            indexstation1=indexstation2;
            indexline2c=indexline2;
            count++;
            /////////////////////////////more try to arrive this point////////////////////////////
            ////////////////////////////                              ///////////////////////////

        }
        if (((line1.contains(stationstart)) && (line2.contains(stationend)))||
                ((line1.contains(stationend)) && (line2.contains(stationstart)))){
            if ((indexstation1 <= 15)&& (indexline2c > 12) ){
                List<String> line1part1 = line1.subList(indexstation1, 14);
                List<String> line2part2 = line2.subList(12, indexline2c+1);
                viewtext.setText(""+(line1part1) + "\n complete with line 2 \n" + (line2part2));

                if (count>0) {
                    Collections.reverse(line2part2);
                    Collections.reverse(line1part1);
                    viewtext.setText(""+(line2part2) + "\n complete with line 1 \n" + (line1part1));
                }
                culculat.addAll(line2part2);
                culculat.addAll(line1part1);

            }

            else if ((indexstation1 <= 15)&&(indexline2c < 12)) {
                List<String> line1part1 = line1.subList(indexstation1, 14);
                List<String> line2part2 = line2.subList(indexline2c, 13);
                Collections.reverse(line2part2);
                viewtext.setText((line1part1) + "\n complete with line 2 \n" + (line2part2));
                if (count>0){
                    Collections.reverse(line1part1);
                    Collections.reverse(line2part2);
                    viewtext.setText((line2part2) + "\n complete with line 1 \n" + (line1part1));
                }
                culculat.addAll(line2part2);
                culculat.addAll(line1part1);
            }

            if ((indexstation1 > 15)&&(indexline2c > 9)) {
                List<String> line1part1 = line1.subList(16, indexstation1);
                Collections.reverse(line1part1);
                List<String> line2part2 = line2.subList(9, indexline2c+1);
                viewtext.setText((line1part1) + "\ncomplete with line 2 \n" + (line2part2));
                if (count>0) {
                    Collections.reverse(line1part1);
                    Collections.reverse(line2part2);
                    viewtext.setText((line2part2) + "\ncomplete with line 1 \n" + (line1part1));
                }
                culculat.addAll(line2part2);
                culculat.addAll(line1part1);

            }

            else if ((indexstation1 > 15)&&(indexline2c < 9)){
                List<String> line1part1 = line1.subList(16, indexstation1);
                Collections.reverse(line1part1);
                List<String> line2part2 = line2.subList(indexline2c, 9);
                Collections.reverse(line2part2);
                viewtext.setText((line1part1) + "\ncomplete with line 2 \n" + (line2part2));
                if (count>0) {
                    Collections.reverse(line1part1);
                    Collections.reverse(line2part2);
                    viewtext.setText((line2part2) + "Sadat]\ncomplete with line 1 \n" + (line1part1));
                }
                culculat.addAll(line2part2);
                culculat.addAll(line1part1);
            }
        }
        ////////////////////////////////////
//////////////////////line 1 to line 3//////////////////////
        if ((line3.contains(stationstart)) && (line1.contains(stationend))){
            indexline3c=indexline3;
            indexstation1=indexstation2;
            count++;
        }
        if (((line3.contains(stationend)) && (line1.contains(stationstart)))||
                ((line3.contains(stationstart)) && (line1.contains(stationend)))){


            if ((indexline3c >= 20)&&(indexstation1 <= 15)) {
                List<String> line3part1 = line3.subList(20, indexline3c+1);
                List<String> line1part1 = line1.subList(indexstation1, 14);
                viewtext.setText(line1part1 + "\ncomplete line 2 go Ataba and line 3 go\n" + line3part1);
                if (count>0) {
                    Collections.reverse(line1part1);
                    Collections.reverse(line3part1);
                    viewtext.setText((line3part1) + "\ncomplete with line 2 go Al Shohadaa and line 1 go \n" + (line1part1));
                }
                culculat.addAll(line3part1);
                culculat.addAll(line1part1);

            }
            else if ((indexline3c >= 20)&&(indexstation1 > 16)) {
                List<String> line3part1 = line3.subList(20, indexline3c+1);
                List<String> line1part1 = line1.subList(16, indexstation1);
                Collections.reverse(line1part1);
                viewtext.setText((line1part1) + "\ncomplete  line 2 \n"+ (twila)+"\ncomplet line 3 \n"+ (line3part1));
                if (count>0) {
                    Collections.reverse(line1part1);
                    Collections.reverse(line3part1);
                    Collections.reverse(twila);
                    viewtext.setText((line3part1) + "\ncomplete with line 2\n"+ (twila)+"\n then line 1 go \n" + (line1part1));
                }
                culculat.addAll(line3part1);
                culculat.addAll(line1part1);

            }
            if ((indexline3c < 21)&&(indexstation1 < 16)) {
                List<String> line3part2 = line3.subList(indexline3c, 20);
                Collections.reverse(line3part2);

                List<String> line1part1 = line1.subList(indexstation1, 14);
                viewtext.setText(line1part1 + "\ncomplete line 2 go [Attaba] and line 3 go\n" + line3part2);
                if (count>0) {
                    Collections.reverse(line1part1);
                    Collections.reverse(line3part2);
                    viewtext.setText((line3part2) + "Attaba]\ncomplete with line 2 go Al Shohadaa and line 1 go \n" + (line1part1));

                }
                culculat.addAll(line3part2);
                culculat.addAll(line1part1);
            }
            else if ((indexline3c < 21)&&(indexstation1 >= 16)) {
                List<String> line3part2 = line3.subList(indexline3c, 20);
                Collections.reverse(line3part2);

                List<String> line1part1 = line1.subList(16, indexstation1);
                Collections.reverse(line1part1);
                viewtext.setText(line1part1 + "\ncomplete line 2 go \n [Mohamed Naguib , Ataba]\n and complete with line 3 go\n" + line3part2);
                if (count>0) {
                    Collections.reverse(line1part1);
                    Collections.reverse(line3part2);
                    Collections.reverse(twila);
                    viewtext.setText((line3part2) + "Attaba]\ncomplete with line 2"+twila+"\nthen line 1 go \n" + (line1part1));
                }
                culculat.addAll(line3part2);
                culculat.addAll(line1part1);


            }
        }
////////////////////////////////
        /////////line 2 to line 3 /////////////////////////
        if ((line3.contains(stationstart)) && (line2.contains(stationend))){
            indexline3c=indexline3;
            indexline2=indexline2c;
            count++;
        }

        if (((line3.contains(stationend)) && (line2.contains(stationstart)))||
                ((line3.contains(stationstart)) && (line2.contains(stationend)))){
            if ((indexline3c >= 20)&&(indexline2 < 12)) {
                List<String> line3part1 = line3.subList(20, indexline3c+1);
                List<String> line2part2 = line2.subList(indexline2, 12);
                viewtext.setText(line2part2 + "\nAttaba complete line 3 go\n" + line3part1);
                if (count>0) {
                    Collections.reverse(line3part1);
                    Collections.reverse(line2part2);
                    viewtext.setText(line3part1 + "\nAttaba complete line 2 go\n" + line2part2);
                }
                culculat.addAll(line3part1);
                culculat.addAll(line2part2);

            }
            else if ((indexline3c >= 20)&&(indexline2 > 11)) {
                List<String> line3part1 = line3.subList(20, indexline3c+1);
                List<String> line2part1 = line2.subList(11, indexline2);
                Collections.reverse(line2part1);
                viewtext.setText(line2part1 + "\ncomplete with line 3 \n" + line3part1);
                if (count>0) {
                    Collections.reverse(line3part1);
                    Collections.reverse(line2part1);
                    viewtext.setText(line3part1 + "\nAttaba complete line 2 go\n" + line2part1);
                }
                culculat.addAll(line3part1);
                culculat.addAll(line2part1);
            }
            if ((indexline3c < 21)&&(indexline2 < 11)) {
                List<String> line3part2 = line3.subList(indexline3c, 20);
                Collections.reverse(line3part2);

                List<String> line2part2 = line2.subList(indexline2, 12);
                viewtext.setText(line2part2 + "\nfrom Attba then complete line 3  \n" + line3part2);
                if (count>0) {
                    Collections.reverse(line3part2);
                    Collections.reverse(line2part2);
                    viewtext.setText(line3part2 + "Attaba] \ncomplete line 2 go\n" + line2part2);
                }

                culculat.addAll(line3part2);
                culculat.addAll(line2part2);
            }
            else if ((indexline3c < 21)&&(indexline2 > 11)) {
                List<String> line3part2 = line3.subList(indexline3c, 20);
                Collections.reverse(line3part2);

                List<String> line2part1 = line2.subList(11, indexline2);
                Collections.reverse(line2part1);
                viewtext.setText(line2part1 + " \n from Attba then complete line 3\n " + line3part2);
                if (count>0) {
                    Collections.reverse(line3part2);
                    Collections.reverse(line2part1);
                    viewtext.setText(line3part2 + "Attaba] \n complete line 2 go\n" + line2part1);
                }
                culculat.addAll(line3part2);
                culculat.addAll(line2part1);

            }
        }

        if (culculat.size() <= 10 && culculat.size() >= 1) {
            counttiket = culculat.size() * 2;
            adresstext.setText("stations "+culculat.size()+"  tiket 3.LE    Time "+counttiket+"  Mints");
        }
        else if (culculat.size() > 8 && culculat.size() <= 16) {
            counttiket = culculat.size() * 2;
            adresstext.setText("stations "+culculat.size()+"  tiket 5.LE    Time "+counttiket+"  Mints");
        }
        else if (culculat.size() >=16&&culculat.size()< 24) {
            counttiket = culculat.size() * 2;
            adresstext.setText("stations "+culculat.size()+"  tiket 7.LE    Time " + counttiket + "  Mints");
        }
        else if (culculat.size() >=24) {
            counttiket = culculat.size() * 2;
            adresstext.setText("stations "+culculat.size()+"  tiket 10 .LE    Time " + counttiket + "  Mints");
        }
        return;

    }
}