package com.example.sampleapp;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * A scrolling list with some titles and a list of 4 images.
 * Clicking on an image opens an overlay with the selected image and its title.
 */
public class MainActivity extends AppCompatActivity {

    OverlayFragment overlayFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addOverlayFragment();
        connectXml();
    }

    void addOverlayFragment() {

        // Add the OverlayFragment without showing it while setting up the Activity
        overlayFragment = new OverlayFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame_fragment, overlayFragment)
                .hide(overlayFragment)
                .commitNow();
    }

    void showOverlayFragment() {

        // Show the OverlayFragment with a fade-in animation.
        // The back stack will handle hiding the OverlayFragment when back is pressed.
        getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(
                        android.R.anim.fade_in,
                        android.R.anim.fade_out,
                        android.R.anim.fade_in,
                        android.R.anim.fade_out
                )
                .show(overlayFragment)
                .addToBackStack(null)
                .commit();
    }

    void connectXml() {

        ImageView imageCircle = findViewById(R.id.image_circle);
        imageCircle.setOnClickListener(view -> {

            overlayFragment.setInfo(
                    R.string.title_image_circle,
                    R.drawable.surface_zljmoufrbfq_unsplash
            );
            showOverlayFragment();
        });

        ImageView imageSquare = findViewById(R.id.image_square);
        imageSquare.setOnClickListener(view -> {

            overlayFragment.setInfo(
                    R.string.title_image_square,
                    R.drawable.lee_chinyama_6lginbaublo_unsplash
            );
            showOverlayFragment();
        });

        ImageView imageTriangle = findViewById(R.id.image_triangle);
        imageTriangle.setOnClickListener(view -> {

            overlayFragment.setInfo(
                    R.string.title_image_triangle,
                    R.drawable.simone_hutsch_8lwkilb2cei_unsplash
            );
            showOverlayFragment();
        });

        ImageView imageRectangle = findViewById(R.id.image_rectangle);
        imageRectangle.setOnClickListener(view -> {

            overlayFragment.setInfo(
                    R.string.title_image_rectangle,
                    R.drawable.sergey_pesterev_llgiayythdw_unsplash
            );
            showOverlayFragment();
        });
    }
}