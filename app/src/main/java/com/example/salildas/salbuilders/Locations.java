package com.example.salildas.salbuilders;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Locations extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng myhome = new LatLng(23.752384, 90.378933);
        mMap.addMarker(new MarkerOptions().position(myhome).title("This My Home"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(myhome));

        LatLng myoffice = new LatLng(23.740226, 90.382819);
        mMap.addMarker(new MarkerOptions().position(myoffice).title("My Office"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(myoffice));

        LatLng myadda = new LatLng(23.751298, 90.376348);
        mMap.addMarker(new MarkerOptions().position(myadda).title("My Adda"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(myadda));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(myoffice,12.0f));
    }
}
