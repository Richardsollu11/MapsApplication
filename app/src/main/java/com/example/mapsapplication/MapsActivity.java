package com.example.mapsapplication;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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

        // Add a marker in Home and airport
        LatLng home = new LatLng(-0.929311, 119.892994);
        LatLng airport = new LatLng(-0.9184647, 119.9062647);
        LatLng market1 = new LatLng(-0.93386, 119.89862);
        LatLng market2 = new LatLng(-0.92719, 119.89579);
        LatLng market3 = new LatLng(-0.92284, 119.89459);
        LatLng market4 = new LatLng(-0.919485, 119.893175);

        //Custom size marker
        //custom size marker
        int tinggi = 100;
        int lebar = 100;

        BitmapDrawable bitmapStart = (BitmapDrawable)getResources().getDrawable(R.drawable.pin_home);
        BitmapDrawable bitmapDes = (BitmapDrawable)getResources().getDrawable(R.drawable.pin_airport);
        BitmapDrawable bitmapMarket1 = (BitmapDrawable)getResources().getDrawable(R.drawable.pin_market1);
        BitmapDrawable bitmapMarket2 = (BitmapDrawable)getResources().getDrawable(R.drawable.pin_market2);
        BitmapDrawable bitmapMarket3 = (BitmapDrawable)getResources().getDrawable(R.drawable.pin_market3);
        BitmapDrawable bitmapMarket4 = (BitmapDrawable)getResources().getDrawable(R.drawable.pin_market4);
        Bitmap s = bitmapStart.getBitmap();
        Bitmap d = bitmapDes.getBitmap();
        Bitmap m1 = bitmapMarket1.getBitmap();
        Bitmap m2 = bitmapMarket2.getBitmap();
        Bitmap m3 = bitmapMarket3.getBitmap();
        Bitmap m4 = bitmapMarket4.getBitmap();

        Bitmap markerStart = Bitmap.createScaledBitmap(s, lebar, tinggi, false);
        Bitmap markerDes = Bitmap.createScaledBitmap(d, lebar, tinggi, false);
        Bitmap markerMarket1 = Bitmap.createScaledBitmap(m1, lebar, tinggi, false);
        Bitmap markerMarket2 = Bitmap.createScaledBitmap(m2, lebar, tinggi, false);
        Bitmap markerMarket3 = Bitmap.createScaledBitmap(m3, lebar, tinggi, false);
        Bitmap markerMarket4 = Bitmap.createScaledBitmap(m4, lebar, tinggi, false);

        //Add Marker to map
        mMap.addMarker(new MarkerOptions().position(home).title("My Home")
                .snippet("This is my home")
                .icon(BitmapDescriptorFactory.fromBitmap(markerStart)));

        mMap.addMarker(new MarkerOptions().position(airport).title("Mutiara SIS Al-Jufri Airport")
                .snippet("This is airport")
                .icon(BitmapDescriptorFactory.fromBitmap(markerDes)));

        mMap.addMarker(new MarkerOptions().position(market1).title("Alfamidi Dewisartika 1")
                .snippet("Alfamidi Dewisartika 1")
                .icon(BitmapDescriptorFactory.fromBitmap(markerMarket1)));

        mMap.addMarker(new MarkerOptions().position(market2).title("Alfamidi Dewisartika 2")
                .snippet("Alfamidi Dewisartika 2")
                .icon(BitmapDescriptorFactory.fromBitmap(markerMarket2)));

        mMap.addMarker(new MarkerOptions().position(market3).title("Alfamidi Dewisartika 4")
                .snippet("Alfamidi Dewisartika 4")
                .icon(BitmapDescriptorFactory.fromBitmap(markerMarket3)));

        mMap.addMarker(new MarkerOptions().position(market4).title("Alfamidi Dewisartika 3")
                .snippet("Alfamidi Dewisartika 3")
                .icon(BitmapDescriptorFactory.fromBitmap(markerMarket4)));

        mMap.addPolyline(new PolylineOptions().add(
                home,
                new LatLng(-0.929311, 119.892994),
                new LatLng(-0.929292, 119.893019),
                new LatLng(-0.929044, 119.892967),
                new LatLng(-0.9290812, 119.8932647),
                new LatLng(-0.9290815, 119.8936342),
                new LatLng(-0.9274080, 119.8936355),
                new LatLng(-0.9275277, 119.8955584),
                new LatLng(-0.9273681, 119.8960593),
                new LatLng(-0.9252961, 119.8952579),
                new LatLng(-0.9242884, 119.8951034),
                new LatLng(-0.9242146, 119.8951684),
                new LatLng(-0.9221848, 119.8940939),
                new LatLng(-0.9208016, 119.8936761),
                new LatLng(-0.9187986, 119.8926616),
                new LatLng(-0.9186528, 119.8939282),
                new LatLng(-0.9191006, 119.8954531),
                new LatLng(-0.9191321, 119.8988669),
                new LatLng(-0.9190788, 119.8993674),
                new LatLng(-0.9189773, 119.9036707),
                new LatLng(-0.9185314, 119.9046239),
                new LatLng(-0.9178469, 119.9052311),
                new LatLng(-0.9178874, 119.9056247),
                new LatLng(-0.9179032, 119.9059965),
                new LatLng(-0.9184647, 119.9062647),
                airport
                ).width(9)
                        .color(Color.BLUE)
        );

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(home, 15.5f));
    }
}