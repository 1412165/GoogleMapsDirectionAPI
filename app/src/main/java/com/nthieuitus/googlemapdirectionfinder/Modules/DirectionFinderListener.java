package com.nthieuitus.googlemapdirectionfinder.Modules;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Nguyen Trung Hieu on 3/25/2017.
 */
public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
