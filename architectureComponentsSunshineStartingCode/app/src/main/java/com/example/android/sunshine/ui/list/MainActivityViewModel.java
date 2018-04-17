package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.ListViewWeatherEntry;
import com.example.android.sunshine.data.database.WeatherEntry;

import java.util.Date;
import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private LiveData<List<ListViewWeatherEntry>> mWeather;

    public MainActivityViewModel(SunshineRepository sunshineRepository) {
        mWeather = sunshineRepository.getForecastWeatherAfterDate();
    }

    public LiveData<List<ListViewWeatherEntry>> getWeather() {
        return mWeather;
    }
}
