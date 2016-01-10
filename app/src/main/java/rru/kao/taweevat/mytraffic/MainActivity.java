package rru.kao.taweevat.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ZoomButtonsController;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Buttin Controller
        ButtonsController();

    } // Main Method

    private void ButtonsController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effecf
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(),
                        R.raw.bee);
                buttonMediaPlayer.start();

                //Intent to Actionview
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/ZU_5F_YPBWQ"));
                startActivity(objIntent);
            }
        });

    } // buttonController

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);


    }

} // Main Class นี่คือคลาสหลัก
