package com.yassir.yassirpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class OffersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);

        ArrayList<Offer> offers = new ArrayList<>();
        offers.add(new Offer("Consultation de Pneumologie",
                "11/10/2022", "2000 DA",false,true, true, false, true));
        offers.add(new Offer("Consultation de Allergologie",
                "05/08/2022", "1500 DA",false,true, false, false, true));
        offers.add(new Offer("Chirurgie Pulmonaire",
                "08/06/2022", "10000 - 200000 DA",false,false, false, false, true));
        offers.add(new Offer("Séance d'Aromathérapie",
                "10/07/2022", "2500 DA",false,false, false, true, false));


        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(new Adapter(this, offers));
    }

    public class Adapter extends BaseAdapter {
        private List <Offer> offers;
        private Context context;

        public Adapter (Context context, List<Offer> offers){
            this.offers = offers;
            this.context = context;
        }

        @Override
        public int getCount() {
            return offers.size();
        }

        @Override
        public Object getItem(int i) {
            return offers.get(i);
        }

        @Override
        public long getItemId(int i) {
            return -1;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(context).
                        inflate(R.layout.item_offer, viewGroup, false);
            }

            // get current item to be displayed
            Offer offer = offers.get(i);

            TextView title = view.findViewById(R.id.textView9);
            TextView date = view.findViewById(R.id.textView10);
            TextView priceRange = view.findViewById(R.id.textView11);
            TextView ongoing = view.findViewById(R.id.textView12);
            TextView completed = view.findViewById(R.id.textView15);
            TextView canceled = view.findViewById(R.id.textView16);
            TextView newUpdate = view.findViewById(R.id.textView13);
            TextView newOffer = view.findViewById(R.id.textView14);

            title.setText(offer.title);
            date.setText(offer.date);
            priceRange.setText(offer.priceRange);
            if(offer.ongoing){
                ongoing.setVisibility(View.VISIBLE);
            }
            else{
                ongoing.setVisibility(View.INVISIBLE);
            }

            if(offer.completed){
                completed.setVisibility(View.VISIBLE);
            }
            else{
                completed.setVisibility(View.INVISIBLE);
            }

            if(offer.canceled){
                canceled.setVisibility(View.VISIBLE);
            }
            else{
                canceled.setVisibility(View.INVISIBLE);
            }

            if(offer.newUpdate){
                newUpdate.setVisibility(View.VISIBLE);
            }
            else{
                newUpdate.setVisibility(View.INVISIBLE);
            }

            if(offer.newOrder){
                newOffer.setVisibility(View.VISIBLE);
            }
            else{
                newOffer.setVisibility(View.INVISIBLE);
            }

            // returns the view for the current row
            return view;
        }
    }
}