package com.sinch.messagingtutorial.app;

import android.app.Application;
import com.parse.Parse;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "f9Z4DwQwojrODbtBbnB6Fbu2AEWlTF5Hmn4EeYCm", "9LDTljATPoFDNBTbP0LZ2OEKJxYflbeXRSlDgSTX");
    }
}
