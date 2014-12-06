package master.mitiya.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements OnClickListener{

	Button btn_main_news;
	Button btn_main_regform;
	Button btn_main_specialty;
	final int REQUEST_CODE = 1;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                
        btn_main_news = (Button) findViewById(R.id.btn_main_news);
        btn_main_news.setOnClickListener(this);
        btn_main_regform = (Button) findViewById(R.id.btn_main_regform);
        btn_main_regform.setOnClickListener(this);
        btn_main_specialty = (Button) findViewById(R.id.btn_main_specialty);
        btn_main_specialty.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        /*if (id == R.id.action_settings) {
            return true;
        }*/
        return super.onOptionsItemSelected(item);
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.btn_main_news:
			Intent intentNews = new Intent(this, News.class);
			//startActivity(intentNews);
			startActivityForResult(intentNews, REQUEST_CODE);
			break;
		case R.id.btn_main_regform:
			Intent intentRegform = new Intent(this, RegistrationForm.class);
			//startActivity(intentRegform);
			startActivityForResult(intentRegform, REQUEST_CODE);
			break;
		case R.id.btn_main_specialty:
			Intent intentSpecialty = new Intent(this, Specialty.class);
			//startActivity(intentSpecialty);
			startActivityForResult(intentSpecialty, REQUEST_CODE);
			break;
		default:
			break;
		}
	}
}
