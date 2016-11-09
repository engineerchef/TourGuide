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
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.joses_name),
                getString(R.string.joses_address),
                getString(R.string.not_applicable),
                getString(R.string.joses_phone),
                getString(R.string.jimmys_description),
                R.drawable.joses_blue_sombrero));

        locations.add(new Location(getString(R.string.bravo_name),
                getString(R.string.bravo_address),
                getString(R.string.not_applicable),
                getString(R.string.bravo_phone),
                getString(R.string.bravo_description),
                R.drawable.bravo_italian));

        locations.add(new Location(getString(R.string.golosi_name),
                getString(R.string.golosi_address),
                getString(R.string.not_applicable),
                getString(R.string.golosi_phone),
                getString(R.string.golosi_description),
                R.drawable.golosi_cafe));

        locations.add(new Location(getString(R.string.peoples_park_name),
                getString(R.string.peoples_park_address),
                getString(R.string.not_applicable),
                getString(R.string.peoples_park_phone),
                getString(R.string.peoples_park_description),
                R.drawable.peoples_park));

        locations.add(new Location(getString(R.string.jimmys_name),
                getString(R.string.jimmys_address),
                getString(R.string.not_applicable),
                getString(R.string.jimmys_phone),
                getString(R.string.jimmys_description),
                R.drawable.jimmys_grotto));

        locations.add(new Location(getString(R.string.michaels_name),
                getString(R.string.michaels_address),
                getString(R.string.not_applicable),
                getString(R.string.michaels_phone),
                getString(R.string.michaels_description),
                R.drawable.michaels_italian));

        locations.add(new Location(getString(R.string.sakura_name),
                getString(R.string.sakura_address),
                getString(R.string.not_applicable),
                getString(R.string.sakura_phone),
                getString(R.string.sakura_description),
                R.drawable.sakura));

        locations.add(new Location(getString(R.string.palmar_name),
                getString(R.string.palmar_address),
                getString(R.string.not_applicable),
                getString(R.string.palmar_phone),
                getString(R.string.palmar_description),
                R.drawable.el_palmar));

        locations.add(new Location(getString(R.string.melting_pot_name),
                getString(R.string.melting_pot_address),
                getString(R.string.not_applicable),
                getString(R.string.melting_pot_phone),
                getString(R.string.melting_pot_description),
                R.drawable.melting_pot));

        locations.add(new Location(getString(R.string.cafe_manna_name),
                getString(R.string.cafe_manna_address),
                getString(R.string.not_applicable),
                getString(R.string.cafe_manna_phone),
                getString(R.string.cafe_manna_description),
                R.drawable.cafe_manna));

        locations.add(new Location(getString(R.string.taco_amigo_name),
                getString(R.string.taco_amigo_address),
                getString(R.string.not_applicable),
                getString(R.string.taco_amigo_phone),
                getString(R.string.taco_amigo_description),
                R.drawable.taco_amigo));

        locations.add(new Location(getString(R.string.case_tequila_name),
                getString(R.string.casa_tequila_address),
                getString(R.string.not_applicable),
                getString(R.string.casa_tequila_phone),
                getString(R.string.casa_tequila_description),
                R.drawable.casa_tequila));

        locations.add(new Location(getString(R.string.lagniappe_name),
                getString(R.string.lagniappe_address),
                getString(R.string.not_applicable),
                getString(R.string.lagniappe_phone),
                getString(R.string.lagniappe_description),
                R.drawable.lagniappe_brasserie));

        // Find display view for list
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
