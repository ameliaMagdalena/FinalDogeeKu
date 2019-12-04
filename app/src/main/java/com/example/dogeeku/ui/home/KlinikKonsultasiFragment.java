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

public class KlinikKonsultasiFragment extends Fragment {

    private KlinikKonsultasiViewModel mViewModel;

    public static KlinikKonsultasiFragment newInstance() {
        return new KlinikKonsultasiFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.klinik_konsultasi_fragment, container, false);

        Button button_back = (Button) v.findViewById(R.id.button_back);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayananKlinikFragment layananKlinikFragment= new LayananKlinikFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, layananKlinikFragment, layananKlinikFragment.getTag())
                        .commit();
            }
        });

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(KlinikKonsultasiViewModel.class);
        // TODO: Use the ViewModel
    }

}
