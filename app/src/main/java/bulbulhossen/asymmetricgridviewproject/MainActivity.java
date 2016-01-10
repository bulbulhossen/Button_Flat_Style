package bulbulhossen.asymmetricgridviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import info.hoang8f.widget.FButton;

public class MainActivity extends AppCompatActivity {


    private FButton primary_button;

/*    private FButton twitterBtn;
    private TextView shadowHeight;
    private SeekBar shadowHeightBar;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/*        more details about button link

        https://github.com/hoang8f/android-flat-button*/


//        twitterBtn = (FButton) findViewById(R.id.f_twitter_button);
        primary_button = (FButton) findViewById(R.id.primary_button);


        //Config disabled button
        primary_button.setButtonColor(getResources().getColor(R.color.fbutton_color_alizarin));

        primary_button.setShadowEnabled(true);
        primary_button.setShadowHeight(5);
        primary_button.setCornerRadius(5);
    }
}
