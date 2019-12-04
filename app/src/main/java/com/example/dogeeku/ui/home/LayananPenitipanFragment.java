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

public class LayananPenitipanFragment extends Fragment {

    private LayananPenitipanViewModel mViewModel;

    public static LayananPenitipanFragment newInstance() {
        return new LayananPenitipanFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.layanan_penitipan_fragment, container, false);

        Button button_back = (Button) v.findViewById(R.id.button_back);

        Button penitipan_kategori1= (Button) v.findViewById(R.id.penitipan_kategori1);
        Button penitipan_kategori2 = (Button) v.findViewById(R.id.penitipan_kategori2);
        Button penitipan_kategori3 = (Button) v.findViewById(R.id.penitipan_kategori3);

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

        penitipan_kategori1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PenitipanKategori1Fragment penitipanKategori1Fragment= new PenitipanKategori1Fragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, penitipanKategori1Fragment, penitipanKategori1Fragment.getTag())
                        .commit();
            }
        });

        penitipan_kategori2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PenitipanKategori2Fragment penitipanKategori2Fragment= new PenitipanKategori2Fragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, penitipanKategori2Fragment, penitipanKategori2Fragment.getTag())
                        .commit();
            }
        });

        penitipan_kategori3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PenitipanKategori3Fragment penitipanKategori3Fragment= new PenitipanKategori3Fragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, penitipanKategori3Fragment, penitipanKategori3Fragment.getTag())
                        .commit();
            }
        });
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LayananPenitipanViewModel.class);
        // TODO: Use the ViewModel
    }

}
