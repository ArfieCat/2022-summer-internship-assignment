package com.example.sampleapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * A translucent full-screen overlay with a title, X button, and image.
 * Clicking on X or the Android back button closes this fragment.
 */
public class OverlayFragment extends Fragment {

    TextView textTitle;
    ImageView imageSelected;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_overlay, container, false);
        connectXml(view);

        return view;
    }

    /**
     * Called by parent to update this fragment with the last image clicked.
     *
     * @param stringId The ID of the title of the image.
     * @param resId    The ID of the image.
     */
    public void setInfo(int stringId, int resId) {

        textTitle.setText(getString(stringId));
        imageSelected.setImageResource(resId);
    }

    void connectXml(View view) {

        textTitle = view.findViewById(R.id.text_title);
        imageSelected = view.findViewById(R.id.image_selected);

        ImageButton buttonClose = view.findViewById(R.id.button_close);
        // Functions identically to the Android back button.
        buttonClose.setOnClickListener(v -> requireActivity().onBackPressed());
    }
}
