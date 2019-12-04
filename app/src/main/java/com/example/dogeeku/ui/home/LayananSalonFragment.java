package com.example.dogeeku.ui.home;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dogeeku.R;

public class LayananSalonFragment extends Fragment {

    private LayananSalonViewModel mViewModel;

    public static LayananSalonFragment newInstance() {
        return new LayananSalonFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.layanan_salon_fragment, container, false);

        Button button_back = (Button) v.findViewById(R.id.button_back);

        Button basic_gromming = (Button) v.findViewById(R.id.penitipan_kategori1);
        Button full_grooming= (Button) v.findViewById(R.id.penitipan_kategori2);
        Button additional_service = (Button) v.findViewById(R.id.penitipan_kategori3);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeFragment homeFragment= new HomeFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, homeFragment, homeFragment.getTag())
                        .commit();
            }
        });

        basic_gromming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SalonBasicGroomingFragment salonBasicGroomingFragment= new SalonBasicGroomingFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, salonBasicGroomingFragment, salonBasicGroomingFragment.getTag())
                        .commit();
            }
        });

        full_grooming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SalonFullGroomingFragment salonFullGroomingFragment= new SalonFullGroomingFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, salonFullGroomingFragment, salonFullGroomingFragment.getTag())
                        .commit();
            }
        });

        additional_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SalonAdditionalFragment salonAdditionalFragment= new SalonAdditionalFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, salonAdditionalFragment, salonAdditionalFragment.getTag())
                        .commit();
            }
        });
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LayananSalonViewModel.class);
        // TODO: Use the ViewModel
    }

}
