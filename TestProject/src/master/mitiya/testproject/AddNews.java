package master.mitiya.testproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

//Õ≈ «¿¡”ƒ‹ œ–Œœ»—¿“‹ class ¬ Ã¿Õ»‘≈—“≈ !!!

public class AddNews extends Activity implements OnClickListener{
	
	EditText inputNews;
	Button submit;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_news);
		
		inputNews = (EditText) findViewById(R.id.inputNews);
		submit = (Button) findViewById(R.id.submit_news);
		submit.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		Intent intent = new Intent();
		intent.putExtra("news", inputNews.getText().toString());
		setResult(RESULT_OK, intent);
		finish();
	}
	
	final int MENU_QUIT_ID = 1;
		@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		menu.add(0, MENU_QUIT_ID, 0, "Quit");
		return true;	}
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){	case MENU_QUIT_ID:	finish();	break;	}
		return super.onOptionsItemSelected(item);	}
}
