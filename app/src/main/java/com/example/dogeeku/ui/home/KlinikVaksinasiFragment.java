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

public class KlinikVaksinasiFragment extends Fragment {

    private KlinikVaksinasiViewModel mViewModel;

    public static KlinikVaksinasiFragment newInstance() {
        return new KlinikVaksinasiFragment();
    }

    @Override

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.klinik_vaksinasi_fragment, container, false);

        Button button_back = (Button) v.findViewById(R.id.button_back);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KlinikVaksinasiFragment klinikVaksinasiFragment= new KlinikVaksinasiFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, klinikVaksinasiFragment, klinikVaksinasiFragment.getTag())
                        .commit();
            }
        });

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(KlinikVaksinasiViewModel.class);
        // TODO: Use the ViewModel
    }

}
