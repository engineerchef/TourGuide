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
public class FunFragment extends Fragment {

    public FunFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.adventure_rock_name),
                getString(R.string.adventure_rock_address),
                getString(R.string.not_applicable),
                getString(R.string.adventure_rock_phone),
                getString(R.string.adventure_rock_description),
                R.drawable.adventure_rock));

        locations.add(new Location(getString(R.string.icombat_name),
                getString(R.string.icombat_address),
                getString(R.string.not_applicable),
                getString(R.string.icombat_phone),
                getString(R.string.icombat_description),
                R.drawable.icombat));

        locations.add(new Location(getString(R.string.skyzone_name),
                getString(R.string.skyzone_address),
                getString(R.string.not_applicable),
                getString(R.string.skyzone_phone),
                getString(R.string.skyzone_description),
                R.drawable.skyzone));

        locations.add(new Location(getString(R.string.veloce_name),
                getString(R.string.veloce_address),
                getString(R.string.not_applicable),
                getString(R.string.veloce_phone),
                getString(R.string.veloce_description),
                R.drawable.veloce_speedway));

        locations.add(new Location(getString(R.string.country_springs_name),
                getString(R.string.country_springs_address),
                getString(R.string.not_applicable),
                getString(R.string.country_springs_phone),
                getString(R.string.country_springs_description),
                R.drawable.country_springs));

        locations.add(new Location(getString(R.string.waukesha_museum_name),
                getString(R.string.waukesha_museum_address),
                getString(R.string.not_applicable),
                getString(R.string.waukesha_museum_phone),
                getString(R.string.waukesha_museum_description),
                R.drawable.waukesha_museum));

        locations.add(new Location(getString(R.string.lasertag_adventure_name),
                getString(R.string.lasertag_adventure_address),
                getString(R.string.not_applicable),
                getString(R.string.lasertag_adventure_phone),
                getString(R.string.lasertag_adventure_description),
                R.drawable.lasertag_adventure));

        locations.add(new Location(getString(R.string.swingtime_name),
                getString(R.string.swingtime_address),
                getString(R.string.not_applicable),
                getString(R.string.swingtime_phone),
                getString(R.string.swingtime_description),
                R.drawable.swing_time));

        locations.add(new Location(getString(R.string.pieper_porch_name),
                getString(R.string.pieper_porch_address),
                getString(R.string.not_applicable),
                getString(R.string.pieper_porch_phone),
                getString(R.string.pieper_porch_description),
                R.drawable.pieper_porch));

        locations.add(new Location(getString(R.string.merrill_hills_name),
                getString(R.string.merrill_hills_address),
                getString(R.string.not_applicable),
                getString(R.string.merrill_hill_phone),
                getString(R.string.merrill_hills_description),
                R.drawable.merrill_hills));

        // Find display view for list
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
