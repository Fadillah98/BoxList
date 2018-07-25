package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<Box> alBox;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.listViewBox);

        alBox = new ArrayList<>();
        Box item1 = new Box("Blue");
        Box item2 = new Box("Orange");
        Box item3 = new Box("Brown");
        alBox.add(item1);
        alBox.add(item2);
        alBox.add(item3);

        caBox = new CustomAdapter(this, R.layout.box_item, alBox);

        lvBox.setAdapter(caBox);
    }
}
