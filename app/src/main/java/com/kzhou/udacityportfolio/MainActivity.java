package com.kzhou.udacityportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.spotifyStreamerBtn)
    void spotifyStreamerBtnCicked() {
        showToast(getString(R.string.spotify_streamer));
    }

    @OnClick(R.id.scoresAppBtn)
    void scoresAppBtnCicked() {
        showToast(getString(R.string.scores_app));
    }

    @OnClick(R.id.libraryAppBtn)
    void libraryAppBtnCicked() {
        showToast(getString(R.string.library_app));
    }

    @OnClick(R.id.buildItBiggerBtn)
    void buildItBiggerBtnCicked() {
        showToast(getString(R.string.build_it_bigger));
    }

    @OnClick(R.id.xyzReaderBtn)
    void xyzReaderBtnCicked() {
        showToast(getString(R.string.xyz_reader));
    }

    @OnClick(R.id.capstoneMyOwnAppBtn)
    void capstoneMyOwnAppBtnCicked() {
        showToast(getString(R.string.my_own_app_toast_msg));
    }

    private void showToast(String msg) {
        String msgForShow = getString(R.string.toast_msg_first_part)
                + msg + getString(R.string.toast_msg_last_part);

        Toast.makeText(this, msgForShow, Toast.LENGTH_SHORT).show();
    }
}
