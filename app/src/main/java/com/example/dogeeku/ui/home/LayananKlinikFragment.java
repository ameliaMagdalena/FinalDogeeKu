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

public class LayananKlinikFragment extends Fragment {

    private LayananKlinikViewModel mViewModel;
    public static LayananKlinikFragment newInstance() {
        return new LayananKlinikFragment();
    }

    @Override

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_layanan_klinik, container, false);

        Button button_back = (Button) v.findViewById(R.id.button_back);

        Button button_konsultasi = (Button) v.findViewById(R.id.penitipan_kategori1);
        Button button_perawatan_khusus = (Button) v.findViewById(R.id.penitipan_kategori2);
        Button button_vaksinasi = (Button) v.findViewById(R.id.penitipan_kategori3);

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

        button_konsultasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KlinikKonsultasiFragment klinikKonsultasiFragment= new KlinikKonsultasiFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, klinikKonsultasiFragment, klinikKonsultasiFragment.getTag())
                        .commit();
            }
        });

        button_perawatan_khusus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KlinikPerawatanKhususFragment klinikKonsultasiFragment= new KlinikPerawatanKhususFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, klinikKonsultasiFragment, klinikKonsultasiFragment.getTag())
                        .commit();
            }
        });

        button_vaksinasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KlinikKonsultasiFragment klinikKonsultasiFragment= new KlinikKonsultasiFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, klinikKonsultasiFragment, klinikKonsultasiFragment.getTag())
                        .commit();
            }
        });
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LayananKlinikViewModel.class);
        // TODO: Use the ViewModel
    }
}
