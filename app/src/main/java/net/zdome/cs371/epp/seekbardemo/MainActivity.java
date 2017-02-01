package net.zdome.cs371.epp.seekbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView volume_display;
    private SeekBar  volume_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        volume_bar = (SeekBar)findViewById(R.id.volume_bar);
        volume_bar.setOnSeekBarChangeListener (new VolumeListener());
        volume_display = (TextView)findViewById(R.id.volume_display);
    }

    private class VolumeListener implements SeekBar.OnSeekBarChangeListener {
        public void onProgressChanged (SeekBar s, int volume, boolean b){
            int volumn = volume_bar.getProgress();
            String volume_string = Integer.toString(volume);
            volume_display.setText(volume_string);
        }

        public void onStartTrackingTouch (SeekBar s){}
        public void onStopTrackingTouch (SeekBar s){}

    }
}
