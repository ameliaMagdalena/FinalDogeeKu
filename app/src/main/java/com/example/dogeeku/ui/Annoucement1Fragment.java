package com.example.dogeeku.ui;

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
import com.example.dogeeku.ui.home.KlinikKonsultasiFragment;
import com.example.dogeeku.ui.home.LayananKlinikFragment;
import com.example.dogeeku.ui.home.LayananPenitipanFragment;
import com.example.dogeeku.ui.home.LayananSalonFragment;

public class Annoucement1Fragment extends Fragment {

    private Annoucement1ViewModel mViewModel;

    public static Annoucement1Fragment newInstance() {
        return new Annoucement1Fragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.annoucement1_fragment, container, false);

        Button announce_close = (Button) v.findViewById(R.id.announce_close);

        announce_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //announcement1.setVisibility(View.GONE);
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
        mViewModel = ViewModelProviders.of(this).get(Annoucement1ViewModel.class);
        // TODO: Use the ViewModel
    }

}
