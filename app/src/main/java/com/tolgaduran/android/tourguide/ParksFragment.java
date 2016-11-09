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
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Add all of the Park locations
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.lapham_peak_name),
                getString(R.string.lapham_peak_address),
                getString(R.string.lapham_peak_hours),
                getString(R.string.lapham_peak_phone),
                getString(R.string.lapham_peak_description),
                R.drawable.lapham_peak));

        locations.add(new Location(getString(R.string.frame_park_name),
                getString(R.string.frame_park_address),
                getString(R.string.frame_park_hours),
                getString(R.string.not_applicable),
                getString(R.string.frame_park_description),
                R.drawable.frame_park));

        locations.add(new Location(getString(R.string.retzer_name),
                getString(R.string.retzer_address),
                getString(R.string.retzer_hours),
                getString(R.string.retzer_phone),
                getString(R.string.retzer_description),
                R.drawable.retzer_nature_center));

        locations.add(new Location(getString(R.string.fox_brook_name),
                getString(R.string.fox_brook_address),
                getString(R.string.fox_brook_hours),
                getString(R.string.fox_brook_phone),
                getString(R.string.fox_brook_description),
                R.drawable.fox_brook_park));

        locations.add(new Location(getString(R.string.minooka_name),
                getString(R.string.minooka_address),
                getString(R.string.minooka_hours),
                getString(R.string.minooka_phone),
                getString(R.string.minooka_description),
                R.drawable.minooka_park));

        locations.add(new Location(getString(R.string.fox_river_name),
                getString(R.string.fox_river_address),
                getString(R.string.fox_river_hours),
                getString(R.string.fox_river_phone),
                getString(R.string.fox_river_description),
                R.drawable.fox_river_park));

        // Find display view for list
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
