package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<Box> boxList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Box> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertview, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView ivImpt = rowView.findViewById(R.id.imageViewColour);

        Box currentItem = boxList.get(position);
        if (currentItem.getColour().equalsIgnoreCase("Blue")){
            ivImpt.setImageResource(R.drawable.blue_box);
        } else if (currentItem.getColour().equalsIgnoreCase("Orange")){
            ivImpt.setImageResource(R.drawable.orange_box);
        } else {
            ivImpt.setImageResource(R.drawable.brown_box);
        }

        return rowView;
    }
}
