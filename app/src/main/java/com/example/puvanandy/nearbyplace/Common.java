package com.example.puvanandy.nearbyplace;

import com.example.puvanandy.nearbyplace.Model.Results;
import com.example.puvanandy.nearbyplace.Remote.IGoogleAPIService;
import com.example.puvanandy.nearbyplace.Remote.RetrofitClient;
import com.example.puvanandy.nearbyplace.Remote.RetrofitScalarsClient;

public class Common {


    public static Results currentResult;
    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";

    public static IGoogleAPIService getGoogleAPIService()
    {
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }

    public static IGoogleAPIService getGoogleAPIServiceScalars()
    {
        return RetrofitScalarsClient.getScalarClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
