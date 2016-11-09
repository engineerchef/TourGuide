package com.tolgaduran.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FitnessFragment extends Fragment {

    public FitnessFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.center_court_name),
                getString(R.string.center_court_address),
                getString(R.string.not_applicable),
                getString(R.string.center_court_phone),
                getString(R.string.center_court_description),
                R.drawable.center_court));

        locations.add(new Location(getString(R.string.martial_arts_name),
                getString(R.string.martial_arts_address),
                getString(R.string.not_applicable),
                getString(R.string.martial_arts_phone),
                getString(R.string.martial_arts_description),
                R.drawable.mixed_martial_arts));

        locations.add(new Location(getString(R.string.wisconsin_athletic_name),
                getString(R.string.wisconsin_athletic_address),
                getString(R.string.not_applicable),
                getString(R.string.wisconsin_athletic_phone),
                getString(R.string.wisconsin_athletic_description),
                R.drawable.wisconsin_athletic));

        locations.add(new Location(getString(R.string.crossfit_name),
                getString(R.string.crossfit_address),
                getString(R.string.not_applicable),
                getString(R.string.crossfit_phone),
                getString(R.string.crossfit_description),
                R.drawable.crossfit));

        locations.add(new Location(getString(R.string.yogasylum_name),
                getString(R.string.yogasylum_address),
                getString(R.string.not_applicable),
                getString(R.string.yogasylum_phone),
                getString(R.string.yogasylum_description),
                R.drawable.yogasylum));

        locations.add(new Location(getString(R.string.salto_name),
                getString(R.string.salto_address),
                getString(R.string.not_applicable),
                getString(R.string.sakura_phone),
                getString(R.string.salto_description),
                R.drawable.salto));

        locations.add(new Location(getString(R.string.glacier_drumlin_name),
                getString(R.string.glacier_drumlin_address),
                getString(R.string.not_applicable),
                getString(R.string.glacier_drumlin_phone),
                getString(R.string.glacier_drumlin_description),
                R.drawable.glacier_drumlin));

        locations.add(new Location(getString(R.string.koha_name),
                getString(R.string.koha_address),
                getString(R.string.not_applicable),
                getString(R.string.koha_phone),
                getString(R.string.koha_description),
                R.drawable.koha_yoga));

        // Find display view for list
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
