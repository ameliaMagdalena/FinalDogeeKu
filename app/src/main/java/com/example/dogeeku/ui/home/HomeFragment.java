package com.example.dogeeku.ui.home;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.dogeeku.R;
import com.example.dogeeku.ui.RegisterActivity;

public class HomeFragment extends Fragment {

    //private HomeViewModel homeViewModel;

    //public View onCreateView(@NonNull LayoutInflater inflater,
    // ViewGroup container, Bundle savedInstanceState) {
    // homeViewModel =
    //ViewModelProviders.of(this).get(HomeViewModel.class);
    //View root = inflater.inflate(R.layout.fragment_home, container, false);
    //final TextView textView = root.findViewById(R.id.text_home);
    //homeViewModel.getText().observe(this, new Observer<String>() {
    //@Override
    //public void onChanged(@Nullable String s) {
    //textView.setText(s);
    //}
    //});
    //return root;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        Button button_klinik = (Button) v.findViewById(R.id.button_klinik);
        Button button_salon = (Button) v.findViewById(R.id.button_salon);
        Button button_penitipan = (Button) v.findViewById(R.id.button_penitipan);
        Button button_shop = (Button) v.findViewById(R.id.button_shop);

        VideoView video = (VideoView) v.findViewById(R.id.videoView);

        getActivity().getWindow().setFormat(PixelFormat.UNKNOWN);

        String uriPath2 = "android.resource://com.example.dogeeku/"+R.raw.layanansalon1;
        Uri uri2 = Uri.parse(uriPath2);
        video.setVideoURI(uri2);
        video.requestFocus();
        video.start();

        button_klinik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayananKlinikFragment layananKlinikFragment= new LayananKlinikFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, layananKlinikFragment, layananKlinikFragment.getTag())
                        .commit();
            }
        });

        button_salon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayananSalonFragment layananSalonFragment= new LayananSalonFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, layananSalonFragment, layananSalonFragment.getTag())
                        .commit();
            }
        });

        button_penitipan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayananPenitipanFragment layananPenitipanFragment= new LayananPenitipanFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, layananPenitipanFragment, layananPenitipanFragment.getTag())
                        .commit();
            }
        });

        button_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent (getActivity(), ShopActivity.class);
                startActivity(register);
            }
        });

        return v;

    }
}